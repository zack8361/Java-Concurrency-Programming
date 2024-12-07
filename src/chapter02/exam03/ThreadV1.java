package chapter02.exam03;

public class ThreadV1 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread 실행중입니다.");
            }
        };
        thread.start();


        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("coreCount = " + coreCount);
    }
}
