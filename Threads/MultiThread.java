package Threads;

class Task extends Thread {
    private final String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread Exception");
            }
        }
    }

}

public class MultiThread {
    public static void main(String[] args) {
        Task task1 = new Task("Thread A");
        Task task2 = new Task("Thread B");

        task1.start();
        task2.start();

        System.out.println("Main Method Executed");

    }
}
