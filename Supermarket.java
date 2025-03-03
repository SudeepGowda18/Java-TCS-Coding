import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of N");
        int n = sc.nextInt();
        int res = 1;
        while (n > 0) {
            int digit = n % 10;
            res *= digit;
            n /= 10;
        }
        System.out.println("Final Price is : " + res);
    }
}
