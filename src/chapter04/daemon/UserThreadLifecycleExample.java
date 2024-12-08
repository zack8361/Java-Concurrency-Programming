package chapter04.daemon;

/**
 * main thread 와 별도의 쓰레드는 사용자 쓰레드이다.
 * 그리고 독립적으로 실행된다.
 */
public class UserThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("사용자 스레드 1번 실행중..");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("사용자 스레드 1번 종료");
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("사용자 스레드 2번 실행중..");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("사용자 스레드 2번 종료");
        });

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println("모든 사용자 쓰레드가 종료되었습니다.");

    }
}
