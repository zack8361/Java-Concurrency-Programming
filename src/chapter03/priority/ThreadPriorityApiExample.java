package chapter03.priority;
import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;


public class ThreadPriorityApiExample {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println("기본 우선순위: " + thread.getPriority());
        thread.start();

        Thread minThread = new Thread(() -> {
            System.out.println("최소 우선순위: " + Thread.currentThread().getPriority());
        });

        minThread.setPriority(MIN_PRIORITY);
        minThread.start();

        Thread maxThread = new Thread(() -> {
            System.out.println("최대 우선순위: " + Thread.currentThread().getPriority());
        });
        maxThread.setPriority(MAX_PRIORITY);
        maxThread.start();



    }
}
