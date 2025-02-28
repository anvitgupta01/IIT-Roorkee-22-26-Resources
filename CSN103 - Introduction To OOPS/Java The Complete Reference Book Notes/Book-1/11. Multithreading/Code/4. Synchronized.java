class Callme{
    synchronized public void call(int x,String msg){
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
        target.call(56,st);
    }
}

class Synchronized{
    public static void main(String[] args) {
        Callme d=new Callme();
        Ser s1=new Ser(d, "One");
        Ser s2=new Ser(d, "Two");
        Ser s3=new Ser(d, "Three");

        s1.t.start();
        s2.t.start();
        s3.t.start();

        try{
            s1.t.join();
            s2.t.join();
            s3.t.join();
        }
        catch(InterruptedException r){
            System.out.println(r.getMessage());
        }

        System.out.println("Main method completed successfully.");
    }
}

