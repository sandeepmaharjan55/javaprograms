import java.util.Scanner;

public class stringRevTry {
    public static void main(String[] args) {
        System.out.println("Type the string to reverse: ");
        Scanner newS=new Scanner(System.in);
        String newSString = newS.next();
        String revString = "";
        for (int  i= 0;  i< newSString.length(); i++) {

            revString = newSString.charAt(i)+revString;
        }
        System.out.println("Reversed string is: "+revString);

    }
}
