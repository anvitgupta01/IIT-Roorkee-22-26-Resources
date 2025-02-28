// getAnnotations() applied to class, method and then fields (Instance variables):

import java.lang.annotation.*;
import java.lang.reflect.*;

// Make sure that runtime used, if not then annoations() will only contain the runtime annotation elements in the array:
@Retention(RetentionPolicy.RUNTIME)
@interface what {
    String str();

    int u = 67;
}

@Retention(RetentionPolicy.RUNTIME)
@interface whata {
    String fer();

    int ter();

    int y = 90;
}

@Retention(RetentionPolicy.RUNTIME)
@interface whatea {
    float f();

    double d = 45;
}

@what(str = "terytuigfb")
@whata(fer = "Hello ertr", ter = 90)
class AllAnnotations {

    // Instance variable must be public in order that getAnnotation and getfield():
    @whata(fer = "Hello partner", ter = 67)
    public int y;

    @whatea(f = 90.89f)
    public void met() {
        System.out.println("Pani Pata Nahi....");
    }

    public static void main(String[] args) {
        AllAnnotations q = new AllAnnotations();

        try {
            Class<?> c = q.getClass();
            Method m = c.getMethod("met");
            Field f = c.getField("y");

            Annotation ann[] = c.getAnnotations(); // Will give all the rumtime annotation applied to class qwerty.
            Annotation ann1[] = m.getAnnotations(); // will give all the runtime annotations applied to the method met.
            Annotation ann2[] = f.getAnnotations(); // will give all runtime annotations to instance variables;

            for (Annotation a : ann) {
                System.out.println(a);
            }

            System.out.println();
            System.out.println();
            System.out.println();

            for (Annotation b : ann1) {
                System.out.println(b);
            }

            System.out.println();
            System.out.println();
            System.out.println();

            for (Annotation cr : ann2) {
                System.out.println(cr);
            }

            // Annotation overrides toString() of object class:
            System.out.println(ann);
        } catch (Exception e) {
            System.out.println("Exception occured.");
        }
    }
}