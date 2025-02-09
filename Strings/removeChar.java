public class removeChar {
    static String removeSpecialCharacter(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "ascvbert#@$y23^*456$%";
        System.out.println(removeSpecialCharacter(str));
    }
}

/*  class Solution{
    static String removeSpecialCharacter(String s) {
        // code here
        String str = "";
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                str += ch;
            }
        }
        return str;
    }
}  sc : O(n) */

/* class Solution{
    static String removeSpecialCharacter(String s) {
        // code here
        char[] ch = s.toCharArray();
        int index = 0;
        for(int i =0;i<s.length();i++){
            if(Character.isLetter(ch[i])){
                ch[index++] = ch[i];
            }
        }
        return index == 0 ? "-1" : new String(ch, 0, index);
    }
}  sc : O(1) */
