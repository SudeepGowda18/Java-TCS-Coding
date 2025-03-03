import java.util.Scanner;

public class CurtainPacking {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string:");
        // String str = sc.nextLine();
        // System.out.println("Enter the value of L:");
        // int L = sc.nextInt();
        // sc.close();
        // int maxA = 0;
        // int n = str.length();
        // for (int i = 0; i < n; i += L) {
        //     int countA = 0;
        //     for (int j = i; j < Math.min(i + L, n); j++) {
        //         if (str.charAt(j) == 'a')
        //             countA++;
        //     }
        //     maxA = Math.max(maxA, countA);
        // }
        // System.out.println(maxA);
        // sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Enter the Value of L");
        int L = sc.nextInt();
        int n = str.length();
        int maxA = 0;
        for (int i = 0; i < n; i += L) {
            int countA = 0;
            for (int j = i; j < Math.min(i + L, n); j++) {
                if (str.charAt(j) == 'a') {
                    countA++;
                }
            }
            maxA = Math.max(maxA, countA);
        }
        System.out.println(maxA);
    }
}