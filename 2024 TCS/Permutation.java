import java.util.Scanner;
 
public class Permutation { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits"); 
        int n = sc.nextInt();
        int[] p_inverse = new int[n + 1];
        System.out.println("Enter the values");
        for (int i = 1; i <= n; i++) {
            int px = sc.nextInt(); 
            p_inverse[px] = i;
        } 
        sc.close();
        for (int i = 1; i <= n; i++) {
            int y = p_inverse[p_inverse[i]];
            System.out.println(y);
        }
    }
}

