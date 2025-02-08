import java.util.Scanner;
public class palindromeCheck {
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        if (isPalindrome(str)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
