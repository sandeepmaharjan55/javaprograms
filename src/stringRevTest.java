public class stringRevTest {
    public static void main(String[] args) {
     String tetst="palindrome";
     System.out.println(StrringRev(tetst));
    }

    private static String StrringRev(String tetst) {
        StringBuilder newRevString =new StringBuilder();

        //changes to array
        char[] newChar = tetst.toCharArray();
        for (int i = newChar.length-1; i >=0 ; i--) {
            newRevString.append(newChar[i]);

        }
        return newRevString.toString();
    }
}

