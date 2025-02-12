import java.util.*;

public class EvenFrequencyElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2};  // Example input
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Print elements with even frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
