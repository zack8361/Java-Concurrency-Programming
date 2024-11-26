package chapter02;

public class LambdaThreadExample {
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "스레드 실행중입니다..");
        }).start();
    }
}

