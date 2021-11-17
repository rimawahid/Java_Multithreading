package multithreading_byYT;

class Person extends Thread {

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

public class ThreadSchduler {

    public static void main(String[] args) {
        Person t1 = new Person();
        Person t2 = new Person();
        Person t3 = new Person();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n); 
        }
    }
}
