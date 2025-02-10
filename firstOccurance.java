public class firstOccurance {
        // Function to locate the occurrence of the string x in the string s.
        static int firstOccurence(String txt, String pat) {
            int foundIdx = txt.indexOf(pat);
            if (foundIdx != -1) {
                return foundIdx;
            } else {
                return -1;
            }
        }
        public static void main(String[] args) {
            String txt = "sudeep";
            String pat = "gowda";
            System.out.println(firstOccurence(txt, pat));
        }
}
