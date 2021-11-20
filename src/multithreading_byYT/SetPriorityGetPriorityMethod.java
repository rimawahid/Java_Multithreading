package multithreading_byYT;

public class SetPriorityGetPriorityMethod extends Thread {

    public void run() {
        // for (int i = 0; i < 3; i++) {
        System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getPriority());
        // }
    }

    public static void main(String[] args) {
        SetPriorityGetPriorityMethod t1 = new SetPriorityGetPriorityMethod();
        SetPriorityGetPriorityMethod t2 = new SetPriorityGetPriorityMethod();
        SetPriorityGetPriorityMethod t3 = new SetPriorityGetPriorityMethod();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();

    }
}
