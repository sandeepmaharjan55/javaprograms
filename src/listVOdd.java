import java.util.ArrayList;
import java.util.List;

public class listVOdd {

        public static void main(String[] args) {

            Integer[] array={1,3,5,7,9};

            List<Integer> list=new ArrayList<Integer>();
            for (int f:array
                 ) {
                list.add(f);
            }
            System.out.println(fibo(list));
        }

        public static boolean fibo(List<Integer> hello) {
            for (int i: hello
                 ) {
               // System.out.println("j");
                if(i%2==0) return false;
                
            }
            return true;
        }


}
