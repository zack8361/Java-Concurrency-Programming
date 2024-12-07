package chapter03.joinMode;

public class BasicThreadJoinV1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 실행중입니다.");
        });

        thread1.start();
        System.out.println("main 쓰레드도 실행중");

    }
}
