import javax.xml.transform.Source;

public class Deadlock implements Runnable {
    A a=new A();
    B b =new B();
    Thread t;

    Deadlock(){
        Thread.currentThread().setName("Main Thread.");
        t=new Thread(this,"Racing thread");
    }

    void DeadlockStart(){
        t.start();
        System.out.println("Calling a.foo(b)");
        a.foo(b);
    }

    public void run(){
        System.out.println("Calling b.re(a)");
        b.re(a);
    }
    public static void main(String[] args) {
        Deadlock d=new Deadlock();
        d.DeadlockStart();
    }
}

class A{
    synchronized void foo(B b){
        System.out.println(Thread.currentThread().getName()+" entered foo() in A class");

        System.out.println("Trying to call b.last() in b class.");
        b.last();
    }

    synchronized void last(){
        System.out.println("In A.last()");
    }
}

class B{
    synchronized void re(A a){
        System.out.println(Thread.currentThread().getName()+" entered re() in B class.");

        System.out.println("Trying to call A.last()");
        a.last();
    }
    synchronized void last()
    {
        System.out.println("In b.last() in B class.");
    }
}