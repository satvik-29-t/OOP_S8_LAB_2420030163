package skill3;
import java.util.Scanner;
public class array1 {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array");
          int n = sc.nextInt();
          int[] arr = new int[n];
          System.out.println("Enter the elements of the array");
          for(int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }
          int sum = 0;
          for(int i = 0; i < n; i++) {
              sum += arr[i]; 
          }
          double average = (double)sum / n;
          System.out.println("Sum = " + sum);
          System.out.println("Average = " + average);
      }

}