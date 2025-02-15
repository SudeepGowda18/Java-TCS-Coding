public class SortRiskLevels {
    public static void sortRisk(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
    }

    public static void printValues(int[] arr) {
        sortRisk(arr);
        System.out.print("Output is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
   public static void main (String[] args){
       int[] arr = { 1,0,2,0,1,0,2};
       printValues(arr);
   }
}

// import java.util.*;

//public class SortRiskLevels {
//     public static void sortRisks(int[] arr) {
//         int low = 0, mid = 0, high = arr.length - 1;

//         while (mid <= high) {
//             if (arr[mid] == 0) {
//                 // Swap arr[low] and arr[mid]
//                 int temp = arr[low];
//                 arr[low] = arr[mid];
//                 arr[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (arr[mid] == 1) {
//                 mid++;
//             } else {
//                 // Swap arr[mid] and arr[high]
//                 int temp = arr[mid];
//                 arr[mid] = arr[high];
//                 arr[high] = temp;
//                 high--;
//             }
//         }
//     }

//     public static void printValue(int[] arr) {
//         sortRisks(arr);
//         System.out.print("Your output is : ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Input the Size of Array");
//         // int N = sc.nextInt(); // Input size of array
//         // int[] arr = new int[N];
//         // System.out.println("Input the elements");
//         // for (int i = 0; i < N; i++) {
//         //     arr[i] = sc.nextInt(); // Input elements
//         // }

//         //sortRisks(arr);

//         // // Print sorted array
//         // System.out.print("Your output is : ");
//         // for (int num : arr) {
//         //     System.out.print(num + " ");
//         // }
//         int[] arr = { 1, 0, 2, 1, 1, 2, 0 };
//         printValue(arr);
//     }
// }