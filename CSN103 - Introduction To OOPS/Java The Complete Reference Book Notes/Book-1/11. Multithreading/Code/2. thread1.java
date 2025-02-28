// Showing the extending thread model:

public class thread1 {
    public static void main(String[] args) {
        A s=new A();
        s.start();
        for(int i=0;i<13;i++)
        {
            System.out.println("Anushka Sharma.");
            try{Thread.sleep(1000);}
            catch(InterruptedException e){System.out.println("Asertify."+e);}
        }
    }
}


class A extends Thread{
    A(){
        super("Anvit Gupoiygvhbcvuwbdj.");
        System.out.println(this);
    }
    public void run(){
        for(int i=0;i<17;i++)
        {
            System.out.println("Anvit Gupta");
            try{Thread.sleep(500);}
            catch(InterruptedException y){System.out.println(y);}
        }
    }
}