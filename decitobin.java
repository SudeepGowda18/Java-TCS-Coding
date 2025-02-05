public class decitobin {
    static String decToBinary(int n) {
        // code here
        int i = 0;
        int[] binary = new int[32];
        while (n > 0) {
            binary[i] = n % 2;
            i++;
            n /= 2;
        }
        StringBuilder binaryStr = new StringBuilder();
        for (int ind = i - 1; ind >= 0; ind--) {
            binaryStr.append(binary[ind]);
        }
        return binaryStr.toString();
    }

    public static void main(String args[]) {
        int n = 78;
        System.out.println(decToBinary(n));
        }
    }