import java.util.Scanner;

public class checkDivi3 {
    public static void checkDivisbleOrNot(String N) {
        int sum = 0;
        for (char digit : N.toCharArray()) {
            sum += digit - '0';
        }
        if (sum % 3 == 0) {
            System.out.println("Yes, it is divisible by 3");
        } else {
            System.out.println("No, it is not divisible by 3");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a large number");
        String N = sc.next();
        checkDivisbleOrNot(N);
        sc.close();
    }
}