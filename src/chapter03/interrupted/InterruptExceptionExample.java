package chapter03.interrupted;

/**
 * 스레드가 수면 중에 인터럽트 될 경우 InterruptedException이 발생한다.
 * 이때 스레드의 인터럽트 상태는 false로 초기화된다.
 * 이후 스레드의 인터럽트 상태를 확인하면 true가 반환된다.
 */
public class InterruptExceptionExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            System.out.println("인터럽트 상태 1: " + Thread.currentThread().isInterrupted());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("스레드가 인터럽트 되었습니다");
                System.out.println(Thread.currentThread().isInterrupted());
            }
        });

        thread.start();
        Thread.sleep(2000);


    }
}
