public class SynchronizedBlock {
    public static void main(String[] args) {
        Callme d=new Callme();
        Ser s1=new Ser(d, "ONe");
        Ser s2=new Ser(d, null);
        Ser s3=new Ser(d, "Nulla");
        
        s1.run();
        s2.run();
        s3.run();
        
        try{
            s1.t.join();
            s2.t.join();
            s3.t.join();
        }
        catch(InterruptedException r){
            System.out.println(r.getMessage());
        }

        System.out.println("Main function success.");
    }
}

class Callme{
    public void call(int x,String msg){
        for(int i=0;i<5;i++)
        {
            System.out.println("Asertify: "+x+" String is "+msg);
            try{Thread.sleep(1000);}
            catch(InterruptedException r){
                System.out.println(r.getMessage());
            }
        }
    }
}

class Ser implements Runnable{
    Thread t;
    String st;
    Callme target;
    Ser(Callme c,String s){
        target=c;
        st=s;
        t=new Thread(this,"Anvit Gupta");
    }

    public void run(){
        synchronized(target){
        target.call(56,st);
        }
    }
}