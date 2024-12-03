package myExample;

public class Member implements Runnable{

    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " / Thread is running");
    }
}
