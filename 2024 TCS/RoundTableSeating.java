import java.util.Scanner;

public class RoundTableSeating {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n - 1; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n) * 2;
        System.out.println(result);
    }
}