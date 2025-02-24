import java.util.*;;

public class ArrayRank {
    public static int[] assignRank(int[] arr) {

        int n = arr.length;
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sortedArray) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        int[] rankedArr = new int[n];

        for (int i = 0; i < n; i++) {
            rankedArr[i] = rankMap.get(arr[i]);
        }

        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));

        return rankedArr;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, -1, 8, 5, 9, 7, 45, 12, 68 };
        System.out.println("Given Array : " + Arrays.toString(arr));
        int[] rankedArr = assignRank(arr);
        System.out.println("Assigned Rank : " + Arrays.toString(rankedArr));
    }
}