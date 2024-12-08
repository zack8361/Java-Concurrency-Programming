package chapter04.daemon;

public class DaemonThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException {

        Thread userThread = new Thread(() -> {
            try {
                System.out.println("User Thread is running");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread daemonThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println("Daemon Thread is running");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        userThread.join();
        System.out.println("main Thread is finished");
    }
}
