import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
            while (index < n) {
                arr[index] = 0;
                index++;
            }
            System.out.println("Final Output is : ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
    }
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Digit");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZerosToEnd(arr, n);
        sc.close();
    }
}