import javax.print.attribute.IntegerSyntax;

public class SuspendResumeStop {
    public static void main(String[] args) {
        Ex e1 = new Ex();
        Ex e2 = new Ex();
        System.out.println("Starting the second thread.");
        e1.t.start();
        System.out.println("Starting the third thread.");
        e2.t.start();
        try {
            Thread.sleep(100);
            e1.suspendThread();
            System.out.println("Suspending thread1.");
            Thread.sleep(100);
            e1.resumeThread();
            System.out.println("Resuming the thread1.");
            Thread.sleep(100);
            e2.suspendThread();
            System.out.println("Suspending thread2.");
            Thread.sleep(100);
            e2.resumeThread();
            System.out.println("Resuming the thread2.");
        } catch (InterruptedException r) {
            System.out.println(r.getMessage());
        }

        try {
            e1.t.join();
            e2.t.join();
            System.out.println("Joining with the main thread");
        } catch (InterruptedException r) {
            System.out.println(r.getMessage());
        }

        System.out.println("Main thread completed.");
    }
}

class Ex implements Runnable {
    Thread t;
    boolean suspendflag;

    Ex() {
        t = new Thread(this, "Example Thread");
        suspendflag = false;
    }

    synchronized void suspendThread() {
        suspendflag = true;
    }

    synchronized void resumeThread() {
        suspendflag = false;
        notify();
    }

    public void run() {
        while (suspendflag) {
            try {
                wait();
            } catch (InterruptedException r) {

            }
        }
        for (int i = 0; i < 17; i++) {
            System.out.println("Anvi Jain" + i);
        }
    }
}
