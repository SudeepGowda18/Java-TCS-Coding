import java.util.Scanner;

public class WareHouse { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt(); 
        sc.close();
        int sum = 0;  ;
        while (n > 0) { 
            int digit = n % 10;
            sum += digit;
            n /= 10; 
        }
        if (sum % 9 == 0) {
            System.out.println("Number is divisible by 9");
        } else {
            System.out.println("Number is not divisible by 9");
        }
    }
} 
