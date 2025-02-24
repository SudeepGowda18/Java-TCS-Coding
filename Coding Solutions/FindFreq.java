import java.util.Arrays;
import java.util.HashMap;

public class FindFreq {
    public static void findFreq(int[] arr) {
        // int n = arr.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // int[] freqArr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     freqArr[i] = freqMap.get(arr[i]); ----> for int return
        // }
        // return freqArr;
        for (int key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6 };
        // int[] finalArr = findFreq(arr);
        findFreq(arr);
    }
}
