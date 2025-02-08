import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<>();
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp.add(arr[l]);
                l++;
            } else {
                temp.add(arr[r]);
                r++;
            }
        }
        while (l <= mid) {
            temp.add(arr[l]);
            l++;
        }
        while (r <= right) {
            temp.add(arr[r]);
            r++;
        }
        for (int i = left; i <= right; i++) {
            arr[i] = temp.get(i );
        }
    }
    public static void main(String[] args) {
        int arr[] = { 11, 45, 84, 2, 3, 9, 7, 458, 64, 28 };
        System.out.println("Before Sorting Array:" + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting Array:" + Arrays.toString(arr));
    }
}
