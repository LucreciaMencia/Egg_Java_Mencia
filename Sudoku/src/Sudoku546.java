import java.util.Scanner;

public class Sudoku546 {
    private static int[][] sudoku = {
            {0, 4, 5, 0, 2, 0, 1, 7, 0},
            {7, 2, 6, 0, 5, 0, 9, 0, 3},
            {0, 9, 1, 0, 7, 3, 6, 0, 2},
            {4, 0, 9, 0, 0, 5, 2, 0, 0},
            {1, 0, 0, 7, 0, 0, 0, 9, 0},
            {5, 0, 8, 2, 1, 0, 4, 0, 0},
            {9, 1, 0, 0, 0, 8, 0, 0, 4},
            {0, 8, 0, 0, 4, 2, 5, 0, 0},
            {2, 0, 4, 0, 9, 7, 3, 0, 0}
    };

    private static int[][] borrador;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        borrador = sudoku.clone();

        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    printSudoku();
                    break;
                case 2:
                    testValue();
                    break;
                case 3:
                    overwriteCell();
                    break;
                case 4:
                    printBorradorAndSudoku();
                    break;
                case 5:
                    resetBorrador();
                    break;
                case 6:
                    showPossibleValues();
                    break;
                case 7:
                    autoSolve();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
                    break;
            }
            System.out.println();
        } while (option != 8);
    }

    private static void printMenu() {
        System.out.println("----- MENÚ -----");
        System.out.println("1. Mostrar Sudoku");
        System.out.println("2. Probar valor");
        System.out.println("3. Sobreescribir borrador");
        System.out.println("4. Mostrar Borrador y Sudoku");
        System.out.println("5. Resetear Borrador");
        System.out.println("6. Mostrar Valores Posibles de una Celda");
        System.out.println("7. Resolver Sudoku automáticamente");
        System.out.println("8. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void printSudoku() {
        System.out.println("----- Sudoku -----");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("-------------------");
            }
        }
    }

    private static void testValue() {
        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        if (!isValidCell(row, column)) {
            System.out.println("Error: Las coordenadas ingresadas son inválidas.");
            return;
        }

        if (sudoku[row][column] != 0) {
            System.out.println("Error: La celda [" + (row + 1) + "," + (column + 1) + "] ya tiene un valor en el Sudoku original.");
            return;
        }

        System.out.print("Ingrese el número a probar (entre 1 y 9): ");
        int number = scanner.nextInt();

        if (!isValidMove(row, column, number)) {
            System.out.println("El número " + number + " no es una solución posible para la celda [" + (row + 1) + "," + (column + 1) + "].");
        } else {
            System.out.println("El número " + number + " es una solución posible para la celda [" + (row + 1) + "," + (column + 1) + "].");
        }
    }

    private static void overwriteCell() {
        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        if (!isValidCell(row, column)) {
            System.out.println("Error: Las coordenadas ingresadas son inválidas.");
            return;
        }

        if (sudoku[row][column] != 0) {
            System.out.println("Error: La celda [" + (row + 1) + "," + (column + 1) + "] ya tiene un valor en el Sudoku original.");
            return;
        }

        System.out.print("Ingrese el nuevo valor para la celda [" + (row + 1) + "," + (column + 1) + "]: ");
        int value = scanner.nextInt();

        if (!isValidMove(row, column, value)) {
            System.out.println("Error: El número " + value + " no es una solución válida para la celda [" + (row + 1) + "," + (column + 1) + "].");
        } else {
            borrador[row][column] = value;
            System.out.println("El número " + value + " se ha sobrescrito correctamente en la celda [" + (row + 1) + "," + (column + 1) + "].");
        }
    }

    private static void printBorradorAndSudoku() {
        System.out.println("----- Borrador -----");
        printSudoku(borrador);
        System.out.println();
        System.out.println("----- Sudoku -----");
        printSudoku(sudoku);
    }

    private static void resetBorrador() {
        borrador = sudoku.clone();
        System.out.println("El borrador se ha restablecido correctamente.");
    }

    private static void showPossibleValues() {
        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        if (!isValidCell(row, column)) {
            System.out.println("Error: Las coordenadas ingresadas son inválidas.");
            return;
        }

        System.out.println("Borrador: soluciones posibles para la celda [" + (row + 1) + "," + (column + 1) + "]: " + getPossibleValues(borrador, row, column));
        System.out.println("Sudoku: soluciones posibles para la celda [" + (row + 1) + "," + (column + 1) + "]: " + getPossibleValues(sudoku, row, column));
    }

    private static void autoSolve() {
        if (solveSudoku()) {
            System.out.println("Sudoku resuelto automáticamente:");
            printSudoku(sudoku);
        } else {
            System.out.println("No se pudo resolver el Sudoku automáticamente.");
        }
    }

    private static void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("-------------------");
            }
        }
    }

    private static boolean isValidCell(int row, int column) {
        return row >= 0 && row < 9 && column >= 0 && column < 9;
    }

    private static boolean isValidMove(int row, int column, int number) {
        return !isInRow(sudoku, row, number) &&
                !isInColumn(sudoku, column, number) &&
                !isInBlock(sudoku, row - row % 3, column - column % 3, number);
    }

    private static boolean isInRow(int[][] board, int row, int number) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInColumn(int[][] board, int column, int number) {
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInBlock(int[][] board, int startRow, int startColumn, int number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startColumn + j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean solveSudoku() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (sudoku[row][column] == 0) {
                    for (int number = 1; number <= 9; number++) {
                        if (isValidMove(row, column, number)) {
                            sudoku[row][column] = number;
                            if (solveSudoku()) {
                                return true;
                            } else {
                                sudoku[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static String getPossibleValues(int[][] board, int row, int column) {
        StringBuilder possibleValues = new StringBuilder();
        for (int number = 1; number <= 9; number++) {
            if (isValidMove(row, column, number)) {
                possibleValues.append(number).append(" ");
            }
        }
        return possibleValues.toString().trim();
    }
}
