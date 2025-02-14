public class bitDifference {
    public static int countBitsFlip(int a, int b) {
        // Your code here
        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(countBitsFlip(a, b));
    }
}
