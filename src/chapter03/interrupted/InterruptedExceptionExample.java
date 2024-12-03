package chapter03.interrupted;

public class InterruptedExceptionExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (!Thread.interrupted()){
                System.out.println("Thread is running");
            }
            System.out.println("Thread is interrupted");
        });
        thread.start();
        Thread.sleep(1000);

        thread.interrupt();
        thread.join();
    }
}
