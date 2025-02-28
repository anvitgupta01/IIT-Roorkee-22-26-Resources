import java.lang.management.RuntimeMXBean;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Q q=new Q();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Main function continuity.");
    }
}

class Q{
    int n;
    boolean valueSet=false; // No value has been set now;

    synchronized int get(){
        while(!valueSet){
            try{
                wait();
            }
            catch(InterruptedException r){

            }
        }
        System.out.println("Get :"+n);
        valueSet=false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while(valueSet){
            try{
                wait();
            }
            catch(InterruptedException r){

            }
        }

        this.n=n;
        valueSet=true;
        System.out.println("Put"+n);
        notify();

    }
}

class Producer implements Runnable{
    Thread t;
    Q q;

    Producer(Q q){
        this.q=q;
        t=new Thread(this,"Producer");
    }
    public void run(){
    int i=0;
        while(true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q=q;
        t=new Thread(this,"Consumer");
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}