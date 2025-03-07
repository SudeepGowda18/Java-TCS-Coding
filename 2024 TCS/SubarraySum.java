import java.util.*;

public class SubarraySum {
    public static List<List<Integer>> findSubarraySum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                temp.add(arr[j]);
                if (sum == target) {
                    result.add(new ArrayList<>(temp));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 3;
        System.out.println(findSubarraySum(arr, target));
    }
}