import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSubArray {
    public static int[] findMaxSubArray(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[arr.length - k + 1]; //ee line equ same
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) { // ee line eq same
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            if (i >= k - 1) { 
                res[i - k + 1] = arr[dq.peekFirst()]; // ee line same
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 6, 3};
        int k = 3;
        System.out.println(Arrays.toString(findMaxSubArray(arr, k)));
    }
}
