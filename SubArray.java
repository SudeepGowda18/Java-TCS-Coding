public class SubArray {
    public static void findSubArray(int[] arr, int target) {
        int count = 0;
        // System.out.println("Output : ");
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == target) {
                    count++;
                    printSubArray(arr, start, end);
                }
            }
        }
        System.out.println("Total subarrays with sum " + target + " = " + count);
    }

    public static void printSubArray(int[] arr, int start, int end) {
        System.out.print("[" + start + "..." + end + "] - {");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i != end)
                System.out.print(", ");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;
        findSubArray(arr, target);
    }
}
