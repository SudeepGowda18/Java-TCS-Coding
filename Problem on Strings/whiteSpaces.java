public class whiteSpaces {
    static String modify(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ') {
                res.append(s.charAt(i));
            } else {
                count++;
            }
        }
        return res.toString();
    }
        public static void main(String[] args) {
            String s = "su dee p g o wd a";
            System.out.println(modify(s));
        }
    }

    //alternative
    // str = str.replaceAll("\\s", "");
    // return str;
