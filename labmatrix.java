import java.util.Scanner;

public class MatrixPractice {

    // ========================================
    // PART 1: CREATE AND PRINT
    // ========================================

    public static double[][] fillMatrix(Scanner input, int rows, int cols) {
        double[][] m = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                m[i][j] = input.nextDouble();
            }
        }

        return m;
    }

    public static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%6.1f", m[i][j]);
            }
            System.out.println();
        }
    }

    // ========================================
    // PART 2: ROW AND COLUMN OPERATIONS
    // ========================================

    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;

        for (int j = 0; j < m[rowIndex].length; j++) {
            sum += m[rowIndex][j];
        }

        return sum;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }

        return sum;
    }

    // ========================================
    // PART 3: WHOLE MATRIX OPERATIONS
    // ========================================

    public static double total(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }

        return sum;
    }

    public static double maxValue(double[][] m) {
        double max = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }

        return max;
    }

    // ========================================
    // PART 4: MAIN
    // ========================================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        System.out.println("Enter values for a " + rows + "x" + cols + " matrix:");

        // 7a
        double[][] matrix = fillMatrix(input, rows, cols);

        // 7b
        System.out.println("\nMatrix:");
        printMatrix(matrix);

        // 7c
        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + i + ": " + sumRow(matrix, i));
        }

        // 7d
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + j + ": " + sumColumn(matrix, j));
        }

        // 7e
        System.out.println("\nTotal: " + total(matrix));
        System.out.println("Max value: " + maxValue(matrix));

        input.close();
    }
}
