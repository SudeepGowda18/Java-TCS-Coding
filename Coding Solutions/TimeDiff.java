import java.util.Scanner;

public class TimeDiff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the correct time");
        int h = sc.nextInt();
        System.out.println("Input the correct minute");
        int m = sc.nextInt();
        System.out.println("Input the correct watch hour");
        int h1 = sc.nextInt();
        System.out.println("Input the correct watch minute");
        int m1 = sc.nextInt();
        System.out.println("Input the correct X");
        int x = sc.nextInt();

        int correctHour = h + x;
        int correctMin = m;

        int correctTotalHour = (correctHour * 60) + correctMin;
        int correctWatchHour = (h1 * 60) + m1;

        int difference = correctTotalHour - correctWatchHour;

        System.out.println("The delay in Watch in Minutes is : ");
        System.out.println(difference);
    }
}
