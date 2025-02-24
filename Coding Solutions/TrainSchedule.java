import java.util.Scanner;

public class TrainSchedule {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : Eg. In 24 format : 12.00");
        String input = sc.next();

        if (!input.matches("\\d{1,2}\\.\\d{2}")) {
            System.out.println("Invalid Input");
            return;
        }

        String[] parts = input.split("\\.");
        int startHour = Integer.parseInt(parts[0]);
        int startMinute = Integer.parseInt(parts[1]);

        if (startHour < 0 || startHour > 23 || startMinute < 0 || startMinute > 59) {
            System.out.println("Input Invalid");
            return;
        }

        int minIntervals[] = { 0, 4, 9, 13, 15, 18 };

        for (int minutes : minIntervals) {
            int newMinute = startMinute + minutes;
            int newHour = startHour;

            if (newMinute >= 60) {
                newMinute -= 60;
                newHour += 1;
            }

            if (newHour > 23) {
                System.out.println("Invalid Input");
                return;
            }

            System.out.printf("%d.%02d ", newHour, newMinute);
        }
        sc.close();
    }
}