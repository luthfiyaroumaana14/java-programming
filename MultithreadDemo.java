class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyThread: count = " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyRunnable: count = " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class MultithreadDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads completed.");
    }
}