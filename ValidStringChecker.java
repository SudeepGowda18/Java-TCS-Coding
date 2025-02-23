import java.util.Scanner;

public class ValidStringChecker {
    public static int validChecker(String str) {
        int quoteCount = 0;
        int hashCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '"') {
                quoteCount++;
            } else if (ch == '#') {
                hashCount++;
            }
        }
        return quoteCount - hashCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println(validChecker(str));
        sc.close();
    }
}
