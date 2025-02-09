public class mostFreqChar {
   static char maxOccurringChar(String str) {
      char ans = 'z';
      int[] freq = new int[256];
      int maxfreq = 0;
      for (int i = 0; i < str.length(); i++) {
         freq[str.charAt(i)]++;
         if (freq[str.charAt(i)] > maxfreq || (freq[str.charAt(i)] == maxfreq && str.charAt(i) < ans)) {
            maxfreq = freq[str.charAt(i)];
            ans = str.charAt(i);
         }
      }
      return ans;
   }
       
    public static void main(String[] args) {
       String str = "testsample";
       System.out.println("Maximum occurring character is " + maxOccurringChar(str));
    }
 } 