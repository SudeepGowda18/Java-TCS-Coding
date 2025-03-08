import java.util.Scanner;

public class SumOfCubess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++){
        sum += i * i * i;
        }
        System.out.println(sum);
        sc.close();
    }
}
