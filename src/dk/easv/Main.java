package dk.easv;

public class Main {

    public static void main(String[] args) {
        Thread t = new HelloThread();
        t.start();

        System.out.println("Main thread has completed");
    }
}

