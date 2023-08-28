package snakepackage;

public class Notification {
    private Thread[] threads;
    public Notification(Thread[] threads){
        this.threads=threads;
    }

    public void displayThreadsStatus() {
        System.out.println("== Game Completion ==");
        System.out.println("Thread Status Overview:");

        int threadNumber = 1;
        for (Thread thread : threads) {
            System.out.println("Thread " + threadNumber + " Status: " + thread.getState());
            threadNumber++;
        }
    }
}
