import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class MarkerAnnotation {

    // No brackets are used:
    @turbidity
    public static void display() {
        System.out.println("Anvit Gupta is present.");
    }

    public static void main(String[] args) {
        // We will use isAnnotationPresent() function to detect it's presence:
        try {
            MarkerAnnotation mk = new MarkerAnnotation();
            Method m = mk.getClass().getMethod("display");

            if (m.isAnnotationPresent(turbidity.class)) {
                System.out.println("YES, it is present:.");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Exception occured.");
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface turbidity {
}
