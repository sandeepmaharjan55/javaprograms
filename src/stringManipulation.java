public class stringManipulation {
    public static void main(String[] args) {
        String s1="Sandy";
        String s2="Sandy";
        String s3= new String("Sandy");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
