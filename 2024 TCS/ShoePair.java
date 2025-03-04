import java.util.*;

public class ShoePair {
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Pairs");
        int n = sc.nextInt();
        // sc.nextLine();
        Map<Integer, Integer> leftShoe = new HashMap<>(); 
        Map<Integer, Integer> rightShoe = new HashMap<>();
        System.out.println("Enter Shoe size in pair. Eg. 7R, 8R");
        for (int i = 0; i < n; i++) {
            String shoe = sc.next();
            int size = Integer.parseInt(shoe.substring(0, shoe.length() - 1));
            char type = shoe.charAt(shoe.length() - 1);
            if (type == 'L') {
                leftShoe.put(size, leftShoe.getOrDefault(shoe, 0) + 1);
            } else {
                rightShoe.put(size, rightShoe.getOrDefault(shoe, 0) + 1);
            }
        }
        int pairs = 0;
        for (int size : leftShoe.keySet()) {
            if(rightShoe.containsKey(size)){
                pairs += Math.min(leftShoe.get(size), rightShoe.get(size));
            }
        }
        System.out.println("Total number available pairs are : "+pairs);
        sc.close();
    }
}
