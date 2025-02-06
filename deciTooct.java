import java.util.*;
class GFG {
    static int deciTooct(int deciNum)
    {
      int i = 0;
      int octal = 0;
      while(deciNum != 0){
        int remain = deciNum % 8;
        octal += remain * (int)Math.pow(10, i);
        i++;
        deciNum /= 8;
      }
      return octal;
    }
    public static void main(String[] args)
    {
        int n = 33;
        System.out.println("Octal equivalent of " + n + " is: " + deciTooct(n));
    }
}
