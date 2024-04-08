public class checkPalin {

        public static void main(String args[]) {
            String gar= "madam";
            System.out.println("String palindrome? "+reverseString(gar));
        }
        public static boolean reverseString(String hawa){

            int lengthOfString= hawa.length();
            for (int i = 0; i < lengthOfString/2; i++) {

                if (hawa.charAt(i)!=hawa.charAt(lengthOfString-i-1)) return false;
            }
            return true;
        }

}
