public class mostRepeated {
    static String mostRepeated(String str) {

        str = str.toLowerCase();

        String[] words = str.split(" ");

        int maxRepeated = 1;

        String result = "-1";

        for (String word : words) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
                maxFreq = Math.max(maxFreq, freq[ch - 'a']);
            }

            if (maxFreq > maxRepeated) {
                maxRepeated = maxFreq;
                result = word;
            }

        }

        return (maxRepeated == 1) ? "-1" : result;

    }
    public static void main(String[] args) {
        String str = "Sudep gowda";
        System.out.println(mostRepeated(str));
    }
}
