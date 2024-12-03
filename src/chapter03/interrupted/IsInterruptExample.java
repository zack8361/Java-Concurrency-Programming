package chapter03.interrupted;

public class IsInterruptExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (!Thread.interrupted()){
                System.out.println("Thread is running");
            }
            System.out.println("Thread is interrupted");
            System.out.println(Thread.currentThread().isInterrupted());
        });

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
