import java.util.*;

public class Swapping {
    public static void finalArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 5) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 6) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 5, 7, 6, 7, 7, 5, 7, 6, 6 };
        finalArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
