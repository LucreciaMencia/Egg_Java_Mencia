import java.util.Scanner;

public class Sudoku506 {
    private static int[][] sudoku = {
            {0, 4, 5,   0, 2, 0,   1, 7, 0},
            {7, 2, 6,   0, 5, 0,   9, 0, 3},
            {0, 9, 1,   0, 7, 3,   6, 0, 2},

            {4, 0, 9,   0, 0, 5,   2, 0, 0},
            {1, 0, 0,   7, 0, 0,   0, 9, 0},
            {5, 0, 8,   2, 1, 0,   4, 0, 0},

            {9, 1, 0,   0, 0, 8,   0, 0, 4},
            {0, 8, 0,   0, 4, 2,   5, 0, 0},
            {2, 0, 4,   0, 9, 7,   3, 0, 0}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fila (entre 1 y 9): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese la columna (entre 1 y 9): ");
        int column = scanner.nextInt() - 1;

        System.out.print("Ingrese el número (entre 1 y 9): ");
        int number = scanner.nextInt();

        boolean isValid = isValidMove(row, column, number);
        System.out.println("Es una solución válida: " + isValid);
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
}
