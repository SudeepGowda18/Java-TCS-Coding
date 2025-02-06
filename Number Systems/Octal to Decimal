import java.util.Scanner;
public class octodeci {
    public static int octtodeci(int oct) {
        int decimal = 0;
        int i = 0;
        while (oct != 0) {
            int rem = oct % 10;
            decimal += rem * (int) Math.pow(8, i);
            i++;
            oct /= 10;
        }
        return decimal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the octal number: ");
        int oct = sc.nextInt();
        sc.close();
        System.out.println(octtodeci(oct));
    }
}
