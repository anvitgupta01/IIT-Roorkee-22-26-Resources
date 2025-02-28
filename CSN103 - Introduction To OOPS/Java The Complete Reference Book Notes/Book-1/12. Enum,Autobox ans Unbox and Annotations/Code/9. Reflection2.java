//  When annotation applied to the class then:

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface yt {
    String str();

    int cval();

    int y = 77659;
}

@yt(str = "Hello my name Tenaya 15.0", cval = 100)
class Reflection2 {

    public void display() {
        System.out.println("Anvit Gupta loves....");
        System.out.println("However she may or may not...");
    }

    public static void main(String[] args) {
   
        // Method-1 cannot be performed:
        
        // // Method-1:
        // Reflection2 w=new Reflection2();
        // yt r=w.getClass().getMethod("display").getAnnotation(yt.class);
        // System.out.println(r.str()+" "+r.cval()+" "+r.y);// Note that variable can also be accessed.

        System.out.println();
        System.out.println();
        System.out.println();

        // Method-2:
        yt e=Reflection2.class.getAnnotation(yt.class);
        System.out.println(e.str()+" "+e.cval()+" "+e.y);// Note that variable can also be accessed.

        System.out.println("Main completed.");

    }
}