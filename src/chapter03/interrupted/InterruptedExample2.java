package chapter03.interrupted;

public class InterruptedExample2 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (!Thread.interrupted()){
                System.out.println("Thread is running!!!");
            }
            System.out.println("Thread is interrupted !!");
            System.out.println(Thread.currentThread().isInterrupted());
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                if(i == 2){
                    thread.interrupt();
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread1.start();

    }
}
