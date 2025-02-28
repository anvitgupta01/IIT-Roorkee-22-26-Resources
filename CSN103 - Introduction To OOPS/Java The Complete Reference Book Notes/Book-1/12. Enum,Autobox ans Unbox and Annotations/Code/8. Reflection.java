import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Retentiomn policy should be runtime, if not then null reference given finally.
@Retention(RetentionPolicy.RUNTIME)
@interface A {
    String str();
    int valu();
}

class Reflection {

    // Method in which the method object will be called must be public, if npt method not found exception occur.
    // They may be static or not.
    
    // Annotation applied to the parametrised method:
    @A(str = "Hello My name is Tenaya Generation 7:", valu = 100)
    public int my(int x) {
        System.out.println("Inside the my() method in reflection.");
        return x;
    }

    // Annotation applied to the non-parametrised method:
    @A(str = "Hello my name is Anu Pareek Generation 7", valu = 98)
    public void display() {
        System.out.println("Anvit Gupta is very awesome and handsome.");
    }

    public static void main(String[] args) {
        Reflection r = new Reflection();

        // Obtain method object for both:
        // Remember that getMethod() will throw an exception if method not found:
        // It is necessary that the m1 and m2 are declared outside:
        try {
            Method m1 = r.getClass().getMethod("my",int.class);
            Method m2 = r.getClass().getMethod("display");

            // Now get reference to the annotation finally by using the class
            // literal-(A.class):
            A myanno1 = m1.getAnnotation(A.class);
            A myanno2 = m2.getAnnotation(A.class);

            // Now you have the refernce and you can use the variables to the annotations:
            System.out.println(myanno1.hashCode() + "  " + myanno2.hashCode());
            System.out.println(myanno1.str() + "  " + myanno2.str());
            System.out.println(myanno1.valu() + "  " + myanno2.valu());

        } catch (NoSuchMethodException e) {
            System.out.println("Exception Occured: Method name does not exists.");
        }
    }
}