package Strings;
public class removeBrackets {
    static String solve(String input) {
        return input.replaceAll("[(),{}]", "");
    }
    public static void main(String[] args) {
        String input = "a+((b-c)+d)";
        System.out.println(solve(input));
    }
}
