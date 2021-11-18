package multithreading_byYT;

class S extends Thread {

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(n);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("e");
        }
    }
}

public class SleepMethod {

    public static void main(String[] args) {
        S t1 = new S();
        S t2 = new S();
        S t3 = new S();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
