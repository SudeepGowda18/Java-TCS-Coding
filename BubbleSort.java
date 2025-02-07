public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        // code here
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String[] args) {
            int arr[] = { 14, 52, 78, 45, 2, 6, 59, 8 };
            bubbleSort(arr);
        }
}
