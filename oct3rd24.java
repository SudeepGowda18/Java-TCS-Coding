import java.util.Scanner;

public class oct3rd24 {
    public static void main(String[] args) {
        int[] exerciseDuration = { 25 ,26 ,23 ,15 ,14 ,38 ,44 };
        int totalMin = 0;
        for (int duration : exerciseDuration) {
            totalMin += duration;
        }
        double avg = (double)totalMin / exerciseDuration.length;
        System.out.println("Total Minutes exercised is : " + totalMin + " and the Avg is : " + avg);
        // Scanner sc = new Scanner(System.in);
        // int sum = 0, duration;
        // for (int i = 0; i < 7; i++) {
        //     System.out.println(" day" +String.format("%02d", (i + 1)));
        //     duration = sc.nextInt();
        //     sum += duration;
        // }
        // double avg = (double) sum / 7;
        // System.out.println("sum" + sum);
        // System.out.println("avg" + avg);
        // sc.close();
    }
}
