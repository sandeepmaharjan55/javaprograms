
public class MyStringReverse {
    public static void main(String args[]) {
        String gar= "madam";

        String newRev=reverseString(gar);
        if (gar.compareTo(newRev)==0) System.out.println("Palindrome");
        System.out.println(newRev);
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