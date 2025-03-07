import java.util.Scanner;

public class SortRiskLevel {
    public static void sortRisk(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Digits");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortRisk(arr);
    }
}