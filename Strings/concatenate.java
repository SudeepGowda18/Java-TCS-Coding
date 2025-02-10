public class concatenate {
    public static void main(String[] args) {
        //Method - 1
        // String str1 = "Sudeep";
        // String str2 = " Gowda";
        // String str = str1 + str2;

        //Method - 2
        String str1 = "Sudeep";
        String str2 = "Gowda";
        StringBuilder str = new StringBuilder(str1);
        str.append(" ").append(str2);
        System.out.println(str);
    }
}
