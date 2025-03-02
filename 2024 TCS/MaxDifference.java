import java.util.*;

public class MaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        // int[] arr = new int[n];

        // System.out.println("Enter the values:");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // Arrays.sort(arr); 
        // int diff = arr[n - 1] - arr[0]; 

        // System.out.println("Maximum difference is: " + diff + " with pair (" + arr[0] + ", " + arr[n - 1] + ")");
        // sc.close();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("Enter the Values");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        int diff = max - min;
        System.out.println("Maximum difference is : " + diff + " with pair (" + min + ", " + max + ")");
        sc.close();
    }
}
