package chapter02.ex복습;

public class ThreadV3 {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable 스레드 실행중입니다..");
    }
}