import java.lang.annotation.*;
import java.lang.reflect.*;

class Repeatation1 {

    @A(st = "iugfbm fudvb", val = 78)
    @A(st = "Fyfmwgb", val = 9)
    public void display() {
        System.out.println("Afhffgvrb hyfufgb3");
    }

    public static void main(String[] args) {
        Repeatation1 r = new Repeatation1();

        try {
            Class<?> c = r.getClass();
            Method m = c.getMethod("display");
            Annotation[] ad = m.getAnnotationsByType(A.class);
            for (Annotation a : ad) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Myrepeat.class)
@interface A {
    String st();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Myrepeat {
    A[] value();
}