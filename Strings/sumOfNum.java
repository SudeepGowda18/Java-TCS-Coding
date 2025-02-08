package Strings;
import java.util.Scanner;

public class sumOfNum {
    static int sumOfNumbers(String str) {
        int sum = 0, num = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                sum += num;
                num = 0;
            }
        }
            sum += num;
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(sumOfNumbers(str));
    }
}
