package threadtest_first;

class NewThread2 extends Thread {

    NewThread2() {
        super("Demo Thread");
        System.out.println("Child thread : " + this);
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread : " + i);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ExtendThread {

    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
