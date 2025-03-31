import java.util.Scanner; 
 
public class AgencyComplaintss {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number"); 
        int N = sc.nextInt();
        System.out.println("Enter the Value R"); 
        int R = sc.nextInt();  
        sc.close(); 
        int sum = 0; 
        while (N > 0) { 
            int digit = N % 10; 
            sum += digit;  
            N /= 10;
        } 
        int result = sum * R;
        while (result >= 10) {
            int temp = 0;
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }
            result = temp; 
        }
        //Main Method
        System.out.println("Output : "+result);
    }
}
