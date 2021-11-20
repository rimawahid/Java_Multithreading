
package multithreading_byYT;
class D implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("My child Thread");
        }
    }
}
public class C {
    public static void main(String[] args) {
        D r = new D();
        Thread t = new Thread(r);
        //Thread t = new Thread(new D());
        t.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread");
        }
    }
}
