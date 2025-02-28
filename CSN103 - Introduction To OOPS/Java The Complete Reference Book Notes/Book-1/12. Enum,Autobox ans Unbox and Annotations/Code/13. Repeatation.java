import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

class Repeatation{

    @A(st = "Pagal anvit",val = 56)
    @A(st = "Hello Pagal",val = 90)
    public void anvit(){
        System.out.println("Anvit Gupta is very handsome and very intelligent.");
    }
    public static void main(String[] args) {
        Repeatation r=new Repeatation();
        Class<?> c=r.getClass(); // Creating the class object of the class repeatation
        try{
            Method m=c.getMethod("anvit");
            Annotation ad=m.getAnnotation(MyRepeat.class);
            System.out.println(ad); // Just print the annotation reference
        } catch(NoSuchMethodException e){
            System.out.println("Exception occured.");
        }    
    }
}

// Repeating annotation:
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeat.class)
@interface A{
    String st();
    int val();
}


// Also called container annotation:
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeat{
    A[] value(); // Remember it must return the array of repeatable annotation and the name will be value only.
}