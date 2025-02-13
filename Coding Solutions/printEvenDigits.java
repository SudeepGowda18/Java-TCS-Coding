import java.util.*;

public class printEvenDigits {
    public static void evenFrequency(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (HashMap.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() % 2 == 0)
                System.out.print(entry.getKey() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,4,1,2,6,7};
        evenFrequency(arr);
    }
}
