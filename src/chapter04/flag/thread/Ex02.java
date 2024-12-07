package chapter04.flag.thread;

public class Ex02 {
    private static boolean running = true;
    public static void main(String[] args) {

        new Thread(()-> {
            while (running){

            }
            System.out.println("Thread1 is terminated");
        }).start();

        new Thread(()-> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            running = false;
        }).start();
    }
}
