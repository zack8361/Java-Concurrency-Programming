package chapter02.ex복습;

public class ThreadV1 {
    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run(){
                System.out.println("Thread 실행중입니다.");
            }
        }.start();
    }
}
