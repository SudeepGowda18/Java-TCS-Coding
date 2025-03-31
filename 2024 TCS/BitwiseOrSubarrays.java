import java.util.HashSet;
import java.util.Set;

public class BitwiseOrSubarrays {
    public static int subarrayBitwiseOr(int[] arr) {
        Set<Integer> uniqueOr = new HashSet<>();
        Set<Integer> current = new HashSet<>();
        for (int num : arr) { 
            Set<Integer> next = new HashSet<>();
            next.add(num);
            for (int val : current) {
                next.add(val | num);
            }
            current = next;
            uniqueOr.addAll(current);
        }
        return uniqueOr.size();
    }
    //Main Method 
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2 };
        System.out.println(subarrayBitwiseOr(arr));
    }
}
