public class insertionSort {
    public class InsertionSort {
        static void insertionSort(int[] arr, int n) {
            for (int i = 1; i < arr.length; i++) {
                int j = i;
                while (j > 0 && arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
    
            // Print sorted array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int arr[] = {5, 4, 8, 1, 2, 6};
            insertionSort(arr, 6);
        }
    }
    
}
