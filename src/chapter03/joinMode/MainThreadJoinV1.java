package chapter03.joinMode;

public class MainThreadJoinV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 실행중입니다.");
        });

        thread1.start();

        try{
            thread1.join();
            System.out.println("MainThread 실행중입니다.");
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main 종료");
    }
}