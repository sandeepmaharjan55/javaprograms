public class stringRevTest {
    public static void main(String[] args) {
     String tetst="palindrome";
     System.out.println(StrringRev(tetst));
    }

    private static String StrringRev(String tetst) {
        //method 1
       // StringBuilder newRevString =new StringBuilder();
        //or this
        String newRevString ="";
        //changes to array
        char[] newChar = tetst.toCharArray();
        for (int i = newChar.length-1; i >=0 ; i--) {
           // newRevString.append(newChar[i]);
            //or this
            newRevString=newRevString + newChar[i];

        }
        //method 2
        String newRevStringNew ="";
        for (int i = 0; i < tetst.length()-1; i++) {
            newRevStringNew= tetst.charAt(i)+newRevStringNew;
            //newRevStringNew= newChar[i]+newRevStringNew;

        }
        System.out.println("Naya test gareko hai yo chai "+newRevString);
        return newRevString;
    }
}

