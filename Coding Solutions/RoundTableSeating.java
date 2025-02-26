import java.util.Scanner;

public class RoundTableSeating  {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Members");
    int members = sc.nextInt();
    if (members < 2) {
        System.out.println("Invalid Input");
        return;
    }
    int result = factorial(members - 1) * 2;
    System.out.println(result);
}
}