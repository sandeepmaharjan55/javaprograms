public class fibonacci {
        public static void main(String[] args) {
           fibo(10);
        }

        public static void fibo(int wer) {
            int a =0;
            int b=1;
            int c=1;

            for (int i = 0; i < wer; i++) {
                System.out.println(a);
                a=b;
                b=c;
                c=a+b;
            }
        }

}
