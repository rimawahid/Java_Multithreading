package multithreading_byYT;

class J extends Thread {

    @Override
    public void run() {
        String n = Thread.currentThread().getName();

        for (int i = 0; i < 3; i++) {
            System.out.println(n);

        }

    }
}

public class JoinMethod {

    public static void main(String[] args) {
        J t1 = new J();
        J t2 = new J();
        J t3 = new J();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t1.start();
        t3.start();
        
        String m = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(m);

        }

    }
}
