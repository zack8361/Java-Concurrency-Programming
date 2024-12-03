package myExample;

public class ThreadMain {

    public static void main(String[] args) {

        new Thread(new Member("이찬호")).start();
    }
}
