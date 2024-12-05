package chapter04;

/**
 * 스레드 외부에서 에러를 처리하기가 힘들다.
 * 그래서 별도의 방법이 필요하다.
 */
public class UncaughtExceptionHandler {
    public static void main(String[] args) {

        try {
            new Thread(() -> {
                throw new RuntimeException("예외 발생");
            }).start();
        }
        catch (RuntimeException e) {
            notify(e);
        }

    }

    private static void notify(RuntimeException e) {
        System.out.println("관리자에게 알림 : "  + e);
    }
}
