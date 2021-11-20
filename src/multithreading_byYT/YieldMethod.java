
package multithreading_byYT;
class Thread1 extends Thread{
    @Override
    public void run(){
       String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
            yield();
        }
    }
}

class Thread2 extends Thread{
   @Override
   public void run(){
       String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    } 
}
public class YieldMethod {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
    }
}
