public class CaseConverter {
    public static String convertToOppo(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "HelLo WoRlD";
        System.out.println("Original String : " + input);
        System.out.println("Converted String : " + convertToOppo(input));
    }
}
