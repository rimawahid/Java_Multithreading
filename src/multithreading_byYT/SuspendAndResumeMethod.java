
package multithreading_byYT;

public class SuspendAndResumeMethod extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
        
    }
    
    public static void main(String[] args) {
        SuspendAndResumeMethod t1 = new SuspendAndResumeMethod();
        SuspendAndResumeMethod t2 = new SuspendAndResumeMethod();
        SuspendAndResumeMethod t3 = new SuspendAndResumeMethod();
        
        t1.setName("Raj");
        t2.setName("Ravi");
        t3.setName("Sen");
        
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        
        t2.resume();
    }
}
