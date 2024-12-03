package chapter03.currentThread;

public class ThreadNamingExample {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " / Thread is running");
        }, "myThread");
        thread.start();
    }
}
