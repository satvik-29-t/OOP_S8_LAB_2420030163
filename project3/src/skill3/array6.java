package skill3;
import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of first matrix: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                arr1[i][j] = sc.nextInt();
        System.out.println("Enter number of rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns of second matrix: ");
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible! Columns of first != rows of second.");
            return;
        }
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                arr2[i][j] = sc.nextInt();
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of the two matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}