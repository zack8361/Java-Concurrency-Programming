package chapter02.ex복습;

public class ThreadV2 {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("Thread 실행중입니다.");
    }
}
