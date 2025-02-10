public class reverseString {
    static String revWords(String str) {
        String[] words = str.trim().split("\\s+");
        int n = words.length;
        reverse(words, 0, n - 1);
        return String.join(" ", words);
    }

    static void reverse(String[] str, int left, int right) {
        while (left < right) {
            String temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }
    public static void main(String[] args) {
        String str = "Sudeep is a bad coder";
        System.out.println(revWords(str));
    }
}
