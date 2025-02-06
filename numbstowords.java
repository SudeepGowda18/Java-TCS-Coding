public class numbstowords {
    private static final String[] units = {"","one","two","three","four","five","six","seven","eight","nine"};
    private static final String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static final String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety" };
    
    public static String convertToWords(int num) {
        if (num == 0) {
            return "zero";
        }
        return convert(num).trim();
    }

    public static String convert(int num) {
        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + convert(num % 10);
        } else if (num < 1000) {
            return units[num / 100] + " hundred " + convert(num % 100);
        } else if (num < 1000000) {
            return convert(num / 1000) + " thousand " + convert(num % 1000);
        } else if (num < 1000000000) {
            return convert(num / 1000000) + " million " + convert(num % 1000000);
        } else {
            return "Number is too large (max 9 digit)";
        }
    }

    public static void main(String[] args) {
        int num = 1234451216;
        System.out.println(convertToWords(num));
    }
}
