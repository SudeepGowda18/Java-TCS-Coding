public class toggleBits {
    public static String toggleBit(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder res = new StringBuilder();
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                res.append(0);
            } else {
                res.append(1);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int num = 75;
        System.out.println("Original "+ Integer.toBinaryString(num));
        System.out.println("Toggled  " + toggleBit(num));
    }
}
