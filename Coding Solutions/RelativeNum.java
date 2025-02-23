import java.util.Scanner;

public class RelativeNum{

    public static int factorial(int num){
        if(num == 0 || num == 1) return 1;
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact *= num;
        }
        return fact;
    }

    public static boolean isRelativeBlood(int num){
        int sum = 0;
        int originalNum = num;
        while(num > 0){
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }
    
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        if(isRelativeBlood(num)){
            System.out.println("Number is Relative Blood");
        }else{
            System.out.println("Number is not a Relative Blood");
        }
    }
}
