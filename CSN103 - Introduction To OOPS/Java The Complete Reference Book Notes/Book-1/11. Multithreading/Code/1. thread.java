// Two methods can be used to implement runanble nd instantiating thread.

class B implements Runnable{
    Thread t; // Will create second thread.
    B(){
        t=new Thread(this,"Anvit Gupta");
    }
    public void run(){
        System.out.println("Anvi Jain.");
    }
}

class C implements Runnable{
    public void run()
    {
        System.out.println("Asertifyuy.");
    }
}

class thread{
    public static void main(String[] args) {
        B s=new B(); 
        C s1=new C(); 
        Thread t1=new Thread(s1,"Anurag Palika"); // Will create third thread.

        t1.start();
        s.t.start();

        System.out.println("Exited Main Function()");
    }
}