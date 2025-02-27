import java.util.Scanner;

public class SumOfCubes {
    public static int sumOfCubes(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += (i * i * i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter value of m : ");
        int m = sc.nextInt();
        sc.close();
        int result = sumOfCubes(n, m);
        System.out.println("Output : " + result);
        sc.close();
    }
}
