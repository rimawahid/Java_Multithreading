package multithreading_byYT;

class B extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}

public class A {

    public static void main(String[] args) throws Exception {
        B t = new B();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            Thread.sleep(1000);
        }
    }
}
