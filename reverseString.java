public class reverseString {
    public static void main(String[] args) {
        String str = "sudeep gowda";
        char[] ch = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(ch));
    }
}


// Alternative

// public class reverseString {
//     public static void main(String[] args) {
//         String str = "Sudeep Gowda";
//         StringBuilder sb = new StringBuilder();
//         System.out.println(sb.reverse().toString);
//     }
// }