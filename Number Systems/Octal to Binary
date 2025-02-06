public class octTobin {
    public static int octTodeci(int octal) {
        int i = 0;
        int decimal = 0;
        while (octal != 0) {
            int rem = octal % 10;
            decimal += rem * (int) Math.pow(10, i);
            i++;
            octal /= 10;
        }
        return decimal;
    }

    public static int decTobin(int bin) {
        int i = 0;
        int binary = 0;
        while (bin != 0) {
            int rem = bin % 2;
            binary += rem * (int) Math.pow(10, i);
            i++;
            bin /= 2;
        }
        return binary;
    }

    public static void main(String [] args) {
        int oct = 123;
        int decimal = octTodeci(oct);
        System.out.println(decTobin(decimal));
    }
}
