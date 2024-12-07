package chapter03.joinMode;

public class JoinModeV1 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 실행중입니다.");
        });


        new Thread(()-> {
            try {
                thread1.join();
                System.out.println("Thread2 실행중입니다.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        thread1.start();

    }
}