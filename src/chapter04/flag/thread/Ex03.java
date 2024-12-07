package chapter04.flag.thread;

public class Ex03 {

    private static volatile boolean running = true;
    public static void main(String[] args) {
        new Thread(() -> {
            while (running) {

            }
            try {
                Thread.sleep(500);
                System.out.println("Thread1 종료");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()-> {
            try {
                Thread.sleep(500);
                System.out.println("Thread2 종료");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            running = false;
        }).start();
    }
}
