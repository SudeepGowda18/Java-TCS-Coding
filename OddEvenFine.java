import java.util.Scanner;

public class OddEvenFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Vehicles");
        int N = sc.nextInt();
        int[] a = new int[N];
        System.out.println("Enter the last digit number of Vehicle ");
        for (int i = 0; i < N; i++) {
        // System.out.println("Enter the last digit number of Vehicle "+ (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Date");
        int D = sc.nextInt();
        System.out.println("Enter the fine amount");
        int x = sc.nextInt();
        sc.close();
        int totalFine = 0;
        boolean isEvenDate = D % 2 == 0;
        for (int i = 0; i < N; i++) {
            boolean isEvenVehicle = (a[i] % 2 == 0);
            if(isEvenDate && !isEvenVehicle || !isEvenDate && isEvenVehicle){
                totalFine += x;
            }
        }
        System.out.println("Total fine is : " + totalFine);
    }
}