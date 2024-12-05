package chapter04.flag;

public class InterruptedExample01 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (!Thread.interrupted()) {
            }
            System.out.println("Thread is interrupted");
            System.out.println(Thread.currentThread().isInterrupted());
        });
        thread.start();
        Thread.sleep(500);
        thread.interrupt();


        Thread thread1 = new Thread(() -> {
            try {
                thread.join();                
                while (!Thread.currentThread().isInterrupted()) {
                }
                System.out.println("Thread2 is interrupted");
                System.out.println(Thread.currentThread().isInterrupted());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        Thread.sleep(500);
        thread1.interrupt();
    }
}

