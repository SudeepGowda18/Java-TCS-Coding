public class printPalindrome {
    public static boolean isPalindrome(int num) {
        int original = num, rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return original == rev;
    }

    public static void printNums(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        printNums(min, max);
    }
}
