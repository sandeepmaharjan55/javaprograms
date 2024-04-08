public class fiborecursive {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                System.out.print(fibo(i) + " ");
            }
        }

        public static int fibo(int wer) {
           if (wer<=1) return wer;
           return fibo(wer-1)+fibo(wer-2);
        }

}
