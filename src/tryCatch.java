public class tryCatch {
    public static void main(String[] args) {
        try{
            int[] inter={1,2,3};
            System.out.println(inter[10]);
        }
        catch(Exception e){
            System.out.println("Invalid index");
        }
//        finally {
//            System.out.println("The 'try catch' is finished.");
//        }
    }
}
