import java.util.Scanner;

public class MaxEfficiency { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Number of Employees"); 
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.println("Enter employee efficiency"); 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;  
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        int option1 = max1 * max2 * max3;
        int option2 = min1 * min2 * max1;
        System.out.println("Max Efficiency is : "+Math.max(option1, option2));
        sc.close();
    }
}
