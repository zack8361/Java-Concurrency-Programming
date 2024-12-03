package chapter02.ex복습;

public class MultiThread {
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("1번");
            System.out.println("2번");
            System.out.println("3번");
        }).start();

        new Thread(() -> {
            System.out.println("4번");
            System.out.println("5번");
            System.out.println("6번");
        }).start();

    }
}
