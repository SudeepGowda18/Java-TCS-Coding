import java.util.Scanner;

public class SumOfValues {
    public static int sumOfValues(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n * i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Output : " + sumOfValues(n));
    }
}
