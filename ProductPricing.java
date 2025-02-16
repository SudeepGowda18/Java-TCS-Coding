import java.util.Scanner;

public class ProductPricing {
    public static int calculatePrice(int N) {
        int sum = 0, product = 1;
        while(N > 0){
            int digit = N % 10;
            sum += digit;
            product *= digit;
            N /= 10;
        }
        return Math.abs(product - sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product Code(N)");
        int N = sc.nextInt();
        System.out.println("The price of Items is : " + calculatePrice(N));
        sc.close();
    }
}
