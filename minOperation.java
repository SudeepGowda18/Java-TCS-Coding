import java.util.Scanner;

public class minOperation {
    public static int minOperation(int p, int q, int r) {
        int totalSum = p + q + r;
        if (totalSum % 3 != 0) {
            return -1;
        }
        int target = totalSum / 3;
        int increase = 0, decrease = 0;
        if (p > target)
            decrease += (p - target);
        else
            increase += (target - p);
        if (q > target)
            decrease += (q - target);
        else
            increase += (target - q); 
        if (r > target)
            decrease += (r - target);
        else
            increase += (target - r);

        if (increase == decrease) {
            return increase; 
        } else {
            return -1; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(minOperation(p, q, r));
        }
        sc.close();
    }
}
