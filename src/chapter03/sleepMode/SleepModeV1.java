package chapter03.sleepMode;

public class SleepModeV1 {
    public static void main(String[] args) {

        System.out.println("main 스레드 시작");

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("thread1 실행중입니다..");
                    Thread.sleep(1000);
                    System.out.println("수면상태 해제");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("수면해제상태 실행중..");
                    }
                    System.out.println("thread1 종료");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("thread2 실행중입니다..");
            }
        }.start();

        System.out.println("main 스레드 종료");
    }
}
