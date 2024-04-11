
public class multiThread {

    public static void main(String[] args) {
        multiThreadExtras new1=new multiThreadExtras();
        multiThreadExtras new2 = new multiThreadExtras();

//        new1.run();
//        new2.run();
        new1.start();
        new2.start();
    }
}
class multiThreadExtras extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
