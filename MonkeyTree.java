import java.util.Scanner;

public class MonkeyTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Total Monkeys
        int k = sc.nextInt();  // Bananas per Monkey
        int j = sc.nextInt();  // Peanuts per Monkey
        int m = sc.nextInt();  // Total Bananas
        int p = sc.nextInt();  // Total Peanuts

        if (n <= 0 || k <= 0 || j <= 0 || m <= 0 || p <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int monkeyEatingBananas = m / k;
        int monkeyEatingPeanuts = p / j;
        if (m % k != 0) {
            monkeyEatingBananas++;
        }
        if (p % j != 0) {
            monkeyEatingPeanuts++;
        }
        int totalEaten = monkeyEatingBananas + monkeyEatingPeanuts;
        int remainingMonkeys = n - totalEaten;
        
        System.out.println("Number of monkeys left on tree : " + remainingMonkeys);
        sc.close();
    }
}
