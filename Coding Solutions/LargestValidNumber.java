import java.util.*;

public class LargestValidNumber {
    public static int findValidNumber(String str){
        String[] words = str.split("[^\\d+]");
        List<Integer> validNumbers = new ArrayList<>();
        for(String word : words){
            if(!word.isEmpty() && !word.contains("9")){
                validNumbers.add(Integer.parseInt(word));
            }
        }
        return validNumbers.isEmpty() ? -1 : Collections.max(validNumbers);
    }
    //Main Method
    public static void main(String[] args) {
        String str = "My name is Sudeep@ 54,88, 99 and sudeep@90";
        System.out.println(findValidNumber(str));
    }
}
