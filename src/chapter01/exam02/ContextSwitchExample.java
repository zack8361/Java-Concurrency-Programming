package chapter01.exam02;

/**
 * thread context switch example
 */
public class ContextSwitchExample {
    public static void main(String[] args) {

        makeThread("thread1").start();
        makeThread("thread2").start();
        makeThread("thread3").start();
    }

    private static Thread makeThread(String name){
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}