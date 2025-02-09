public class duplicatesRemoval {
        static String removeDuplicates(String s) {
            int[] freq = new int[256];
            StringBuilder res = new StringBuilder();
            for(char ch : s.toCharArray()){
                if(freq[ch] == 0)
                res.append(ch);
                freq[ch]++;
            }
            return res.toString();
        }

        public static void main(String[] args) {
            String s = "Sudeep gowda";
            removeDuplicates(s);
        }
}
