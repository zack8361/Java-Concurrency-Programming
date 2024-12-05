package chapter04.flag.thread;


/**
 * 스레드마다 캐시 메모리에 저장되는 변수를 동기화 하기 위해 Volatile 키워드를 사용함.
 * 사용하지 않으면 캐시 메모리에 저장되어 다른 스레드에서 값을 변경해도 반영되지 않음.
 * Sleep 사용하면 컨텍스트 스위칭이 일어나기 때문에 다른 스레드에서 값을 변경할 수 있음.
 */
public class Ex01 {

    private volatile static boolean running = true;
    public static void main(String[] args) {

        new Thread(() -> {
            int count = 0;
            while(running){
                count ++;
            }
            System.out.println("Thread1 is terminated. count: " + count);
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread2 is terminated");
            // Cpu 의 메모리 까지 가는게 아니라 캐시 메모리에만 저장되기 떄문에
            running = false;
        }).start();

    }
}
