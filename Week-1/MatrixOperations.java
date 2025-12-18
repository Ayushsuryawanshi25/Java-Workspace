import java.util.*;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // ADDITION
        System.out.println("\nMatrix Addition:");
        int[][] add = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                add[i][j] = A[i][j] + B[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        // SUBTRACTION
        System.out.println("\nMatrix Subtraction:");
        int[][] sub = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sub[i][j] = A[i][j] - B[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        // MULTIPLICATION (only if square)
        if (r == c) {
            System.out.println("\nMatrix Multiplication:");
            int[][] mul = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    for (int k = 0; k < c; k++) {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix multiplication not possible (not square).");
        }

        // TRANSPOSE
        System.out.println("\nTranspose of Matrix A:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }

        // CHECK SQUARE MATRIX
        if (r == c) {
            System.out.println("\nMatrix is a Square Matrix.");
        } else {
            System.out.println("\nMatrix is NOT a Square Matrix.");
        }

        // CHECK DIAGONAL MATRIX
        boolean isDiagonal = true;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i != j && A[i][j] != 0) {
                        isDiagonal = false;
                        break;
                    }
                }
            }
            if (isDiagonal)
                System.out.println("Matrix is a Diagonal Matrix.");
            else
                System.out.println("Matrix is NOT a Diagonal Matrix.");
        } else {
            System.out.println("Diagonal check not possible (not square).");
        }

        // CHECK IDENTITY MATRIX
        boolean isIdentity = true;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j && A[i][j] != 1)
                        isIdentity = false;
                    else if (i != j && A[i][j] != 0)
                        isIdentity = false;
                }
            }
            if (isIdentity)
                System.out.println("Matrix is an Identity Matrix.");
            else
                System.out.println("Matrix is NOT an Identity Matrix.");
        } else {
            System.out.println("Identity check not possible (not square).");
        }

        sc.close();
    }
}
