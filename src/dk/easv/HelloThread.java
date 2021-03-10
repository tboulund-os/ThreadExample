package dk.easv;

public class HelloThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello, I'm a thread and I will say hello every second");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
