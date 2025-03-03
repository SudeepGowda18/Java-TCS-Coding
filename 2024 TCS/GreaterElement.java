import java.util.*;

public class GreaterElement {
    public static void countGreaterElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println("Final output is : " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Value of Digits");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countGreaterElements(arr);
    }
}
