import java.util.Scanner;

public class FindCentury {
    public static int getCentury(int year) {
        if (year % 100 == 0) {
            return year / 100;
        } else {
            return (year / 100) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("Given year belongs to : " + getCentury(year)+"th");
    }
}
