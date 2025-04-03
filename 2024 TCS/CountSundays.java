import java.util.*;

public class CountSundays { 
    public static void main(String[] args) { 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the StartDay"); 
        // String startDay = sc.next().toLowerCase();  
        // System.out.println("Enter the Number of days left in a month");
        // int n = sc.nextInt();
        // Map<String, Integer> dayMap = new HashMap<>();
        // dayMap.put("sun", 0); 
        // dayMap.put("mon", 1);
        // dayMap.put("tue", 2); 
        // dayMap.put("wed", 3);
        // dayMap.put("thu", 4); 
        // dayMap.put("fri", 5); 
        // dayMap.put("sat", 6);
        // int startIndex = dayMap.get(startDay);
        // int firstSunday = (7 - startIndex) % 7;
        // int count = 0;
        // for (int i = firstSunday; i <= n; i += 7) {
        //     count++;
        // }
        // System.out.println("Number of days : " + count);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String str = sc.next();
        System.out.println("Enter the days remain");
        int n = sc.nextInt();
        String[] arr = { "mon", "tue", "wed", "thur", "fri", "sat", "sun" };
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                break;
            }
        }
        int res = 0;
        int rem = 6 - i;
        if (n >= rem) {
            res = 1;
            n -= rem;
        }
        if (n > 0) {
            res += n / 7;
        }
        System.out.println("Total Sundays is : " + res);
    }
}
