public class countWords {
    static int countWords(String S) {
        // int count = 1;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == ' ') {
        //         count++;
        //     }
        // }
        // return count;
        S = S.replace("\t", " ");
        S = S.replace("\n", " ");
        S = S.replaceAll("[ ]+", " ");
        S = S.trim();
        if(S.isEmpty())
        return 0;
        return S.split(" ").length;
    }
    public static void main(String[] args) {
        String S = "a\nhjpfo";
        System.out.println(countWords(S));
    }
}
