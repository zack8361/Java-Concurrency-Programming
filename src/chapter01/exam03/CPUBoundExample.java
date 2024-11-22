package chapter01.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CPUBoundExample {
    public static void main(String[] args) {

        // 내 컴퓨터에 있는 CPU 코어의 개수를 알아낸다.
        int numThreads = Runtime.getRuntime().availableProcessors();
        // CPU 코어의 개수만큼 스레드 풀을 생성한다.
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        long startTime = System.currentTimeMillis();
        List<Future<?>> futures = new ArrayList<>();


        for (int i = 0; i < numThreads; i++) {
            Future<?> future = executorService.submit(() -> {
                long result = 0;
                for (int j = 0; j < 1000000L; j++) {
                    result += j;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("스레드: " + Thread.currentThread().getName() + ", 결과: " + result);
            });
            futures.add(future);
        }

        long endTime = System.currentTimeMillis();
    }
}
