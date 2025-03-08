import java.util.Scanner;

public class SumOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i * n;
        }
        System.out.println(sum);
        sc.close();
    }
}
