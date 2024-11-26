package chapter02.ex복습;

/**
 * 하나의 스레드를 생성하면 메인 스레드와 별개로 작동함.
 */
public class ThreadMV {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            threadStart(i);
        }

        System.out.println("메인 스레드 종료");
    }

    private static void threadStart(int seq) {
        new Thread(() -> System.out.println("Thread-" + seq + " 실행중입니다.")).start();
    }
}
