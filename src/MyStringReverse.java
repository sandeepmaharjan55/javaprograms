import java.util.Scanner;


public class MyStringReverse {
    public static void main(String args[]) {
        String gar= "palindrome";
        System.out.println(reverseString(gar));
    }
    public static String reverseString(String hawa){

       StringBuilder newD = new StringBuilder();
       char[] newe = hawa.toCharArray();
        for (int i = newe.length-1; i >=0; i--) {
            newD.append(newe[i]);
        }
        return newD.toString();
    }
}