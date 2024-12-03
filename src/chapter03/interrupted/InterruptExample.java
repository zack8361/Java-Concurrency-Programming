package chapter03.interrupted;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = startThread(1);
        Thread thread2 = startThread(2);

        thread2.start();
        thread1.interrupt();
        Thread.sleep(1000);
        thread1.start();

    }


    private static Thread startThread(int threadNumber) {
        return new Thread(() -> {
            System.out.println("스레드 " + threadNumber + " 시작");

            System.out.println("스레도 " + threadNumber + " 인터럽트 상태 = " + Thread.currentThread().isInterrupted());
        });
    }
}
