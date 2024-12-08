package chapter04.daemon;

public class UserAndDaemonThreadExample {
    public static void main(String[] args) {
        new Thread(()-> {
            new Thread(()-> {
                System.out.println("사용자 자식 스레드의 데몬 상태 : " + Thread.currentThread().isDaemon());
            }).start();
            System.out.println("사용자 스레드의 데몬 상태 : " + Thread.currentThread().isDaemon());
        }).start();

        Thread thread = new Thread(() -> {
            new Thread(() -> {
                System.out.println("데몬 자식 스레드의 데몬 상태 : " + Thread.currentThread().isDaemon());
            }).start();
            System.out.println("데몬 스레드의 데몬 상태 : " + Thread.currentThread().isDaemon());
        });
        thread.setDaemon(true);
        thread.start();
    }
}
