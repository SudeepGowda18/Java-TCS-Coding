public class findMinMaxWords {
    public static void findMinMaxWords(String str) {
        String[] words = str.split(" ");
        String minWord = words[0], maxWords = words[0];
        for (String word : words) {
            if (word.length() < minWord.length()) {
                minWord = word;
            } else if (word.length() > maxWords.length()) {
                maxWords = word;
            }
        }
        System.out.println("Minimun length word: " + minWord);
        System.out.println("Minimun length word: " + maxWords);
    }
    public static void main(String[] args) {
        String str = "Sudeep is a good boy";
        findMinMaxWords(str);
    }
}