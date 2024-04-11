import java.util.Scanner;

public class stringReverseOther {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String old=hello.next();
        String newT="";
        char ch;
        for (int i = 0; i < old.length(); i++) {
            ch = old.charAt(i);
            newT=ch+newT;
        }
        System.out.println(newT);
    }
}
