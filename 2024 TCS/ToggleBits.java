import java.util.Scanner;

public class ToggleBits {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Decimal");
        // int n = sc.nextInt();
        // int msb = 1;
        // while (msb <= n) {
        //     msb <<= 1;
        // }
        // int mask = msb - 1;
        // int result = n ^ mask;
        // System.out.println("Output : " + result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int msb = 1;
        while (msb <= n) {
            msb <<= 1;
        }
        int mask = msb - 1;
        System.out.println("Output : " + (n ^ mask));
    }
}