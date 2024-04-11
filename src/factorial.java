public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static long factorial(int hello){
        if (hello>=1) return hello * factorial(hello-1);
        else return 1;
    }

}
