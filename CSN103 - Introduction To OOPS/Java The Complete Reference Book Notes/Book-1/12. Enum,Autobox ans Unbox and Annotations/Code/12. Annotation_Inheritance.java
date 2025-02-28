import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Annotation_Inheritance {
    public static void main(String[] args) {
        Sub s=new Sub();
        s.display();
    }
}

// The @Inherited annotation in Java is used to indicate that a certain annotation should be automatically inherited by all subclasses of the annotated class. This means that if a class is annotated with the @Inherited annotation, then any annotation applied to that class will also be inherited by all of its subclasses.
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface a{
    String value();
}

@a("anvit")
class Superclass{
    void display(){
        System.out.println("Setjhbfmesjwrhafmwg dgjfg j");
    }
}

class Sub extends Superclass{
    void display(){
        Sub s=new Sub();
        Class<?> c=s.getClass();
        if(c.isAnnotationPresent(a.class)){
            System.out.println("PRESENT yes"); // will be printed.
        }
        if(c.isAnnotationPresent(Inherited.class)){
            System.out.println("PRESENT"); // will not be printed.
        }
    }
}
