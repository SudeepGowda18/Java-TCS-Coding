public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "cat";
        String t = "act";
        System.out.println(isAnagram(s, t));
    }
}

// For both Capital and lowercase
// int[] freq = new int[26];
// for(int i = 0;i<s.length();i++){
//     char ch = s.charAt(i);
//     if(Character.isLowerCase(ch)){
//         freq[ch - 'a']++;
//     }else{
//         freq[ch - 'A' + 26]++;
//     }
// }
// for(int i = 0;i<t.length();i++){
//     char ch = t.charAt(i);
//     if(Character.isLowerCase(ch)){
//         freq[ch - 'a']++;
//     }else{
//         freq[ch - 'A' + 26]++;
//     }
// }
// for(
// int i = 0;i<52;i++){
//     if(freq[i] != 0){
//         return false;
//     }
// }
// return true;