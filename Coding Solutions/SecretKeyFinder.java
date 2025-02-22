import java.util.*;

public class SecretKeyFinder {
    public static String findSecretKey(String str1, String str2){
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();
        for(char ch : str1.toCharArray()){
            set1.add(ch);
        }
        for(char ch : str2.toCharArray()){
            set2.add(ch);
        }
        set1.retainAll(set2);
        StringBuilder key = new StringBuilder();
        for(char ch : set1){
            key.append(ch);
        }
        return key.toString();
    }
    //Main Method
    public static void main(String[] args) {
        String str1 = "Sudeep";
        String str2 = "gowda";
        System.out.println(findSecretKey(str1, str2)); 
    }
}
