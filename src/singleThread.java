public class singleThread {
    public static void main(String[] args) {
        ThreadHeram hhr= new ThreadHeram();
        ThreadHeram hhr1= new ThreadHeram();
        hhr.start();
        hhr1.start();
    }
}

class ThreadHeram extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
               throw new RuntimeException();
            }
        }
    }

}
