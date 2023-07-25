import java.util.Scanner;

public class Sudoku536 {
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

    private static int[][] borrador = sudoku.clone();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Sudoku Verifier -----");
            System.out.println("1. Mostrar Sudoku");
            System.out.println("2. Probar Valor");
            System.out.println("3. Sobreescribir Borrador");
            System.out.println("4. Mostrar Borrador y Sudoku");
            System.out.println("5. Resetear Borrador");
            System.out.println("6. Mostrar Valores Posibles de una Celda");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    printSudoku();
                    break;
                case 2:
                    testValue(scanner);
                    break;
                case 3:
                    overwriteCell(scanner);
                    break;
                case 4:
                    printBorradorAndSudoku();
                    break;
                case 5:
                    resetBorrador();
                    break;
                case 6:
                    showPossibleValues(scanner);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
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
                System.out.println("---------------------");
            }
        }
    }

    private static void testValue(Scanner scanner) {
        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        System.out.print("Ingrese el número (entre 1 y 9): ");
        int number = scanner.nextInt();

        boolean isValid = isValidMove(row, column, number);
        if (isValid) {
            System.out.println("El número " + number + " es una solución posible para la celda [" + row + "," + column + "]");
        } else {
            System.out.println("El número " + number + " no es una solución posible para la celda [" + row + "," + column + "]");
        }
    }

    private static boolean isValidMove(int row, int column, int number) {
        // Verificar si el número ya está presente en la fila
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == number) {
                return false;
            }
        }

        // Verificar si el número ya está presente en la columna
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][column] == number) {
                return false;
            }
        }

        // Verificar si el número ya está presente en el bloque 3x3
        int blockRow = row - row % 3;
        int blockColumn = column - column % 3;
        for (int i = blockRow; i < blockRow + 3; i++) {
            for (int j = blockColumn; j < blockColumn + 3; j++) {
                if (sudoku[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void overwriteCell(Scanner scanner) {
        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        if (sudoku[row][column] != 0) {
            System.out.println("Error: No se puede modificar una celda original del Sudoku.");
            return;
        }

        System.out.print("Ingrese el número (entre 1 y 9): ");
        int number = scanner.nextInt();

        if (isValidMove(row, column, number)) {
            borrador[row][column] = number;
            System.out.println("La modificación fue exitosa.");
        } else {
            System.out.println("El número " + number + " no es válido para la celda [" + row + "," + column + "]");
        }
    }

    private static void printBorradorAndSudoku() {
        System.out.println("----- Borrador -----");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(borrador[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("---------------------");
            }
        }

        System.out.println();

        printSudoku();
    }

    private static void resetBorrador() {
        borrador = sudoku.clone();
        System.out.println("El borrador ha sido reseteado.");
    }

    private static void showPossibleValues(Scanner scanner) {
        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        if (sudoku[row][column] != 0) {
            System.out.println("Error: La celda [" + row + "," + column + "] ya tiene un valor en el Sudoku original.");
            return;
        }

        System.out.print("Borrador: soluciones posibles para la celda [" + row + "," + column + "]: ");
        for (int i = 1; i <= 9; i++) {
            if (isValidMove(row, column, i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Sudoku: soluciones posibles para la celda [" + row + "," + column + "]: ");
        for (int i = 1; i <= 9; i++) {
            if (isValidMove(row, column, i)) {
                if (isValidMoveBorrador(row, column, i)) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    private static boolean isValidMoveBorrador(int row, int column, int number) {
        // Verificar si el número ya está presente en la fila
        for (int i = 0; i < 9; i++) {
            if (borrador[row][i] == number) {
                return false;
            }
        }

        // Verificar si el número ya está presente en la columna
        for (int i = 0; i < 9; i++) {
            if (borrador[i][column] == number) {
                return false;
            }
        }

        // Verificar si el número ya está presente en el bloque 3x3
        int blockRow = row - row % 3;
        int blockColumn = column - column % 3;
        for (int i = blockRow; i < blockRow + 3; i++) {
            for (int j = blockColumn; j < blockColumn + 3; j++) {
                if (borrador[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }
}
