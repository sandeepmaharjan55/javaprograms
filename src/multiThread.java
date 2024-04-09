public class multiThread {

    public static void main(String[] args) {
        multiThreadExtra new1=new multiThreadExtra();
        multiThreadExtra new2 = new multiThreadExtra();

//        new1.run();
//        new2.run();
        new1.start();
        new2.start();
    }
}
