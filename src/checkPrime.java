public class checkPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(13));
    }

    public static boolean checkPrime(int wer) {
        if(wer==0 || wer ==1) return false;
        if (wer==2) return true;
        for (int i = 2; i <=wer/2 ; i++) {
            if (wer%i==0) return false;
        }
        return true;
    }
}
