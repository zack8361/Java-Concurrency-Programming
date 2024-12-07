package chapter03.ex;

public class MainThreadTest {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("thread1 실행중입니다..")).start();
        System.out.println("main 스레드 시작");
    }
}
