import java.util.Deque;
import java.util.LinkedList;

public class MaxInSubArray {
    public static void findMaxInSubarrays(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()]);
                if (i != arr.length - 1) {
                    System.out.print(" ");
                }
            }
        }
            System.out.print("]");
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 1, 6, 3 };
        int k = 3;
        findMaxInSubarrays(arr, k);
    }
}
