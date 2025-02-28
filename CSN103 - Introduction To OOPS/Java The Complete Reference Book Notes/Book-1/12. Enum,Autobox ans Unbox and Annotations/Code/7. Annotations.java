import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// Annotations can also be used with class:

@S(gert = 34)
class Annotations{
    @i(serpent = 45)
    public static void ter(){
        System.out.println("Ansh choudhary.");
    }


    // Annotations can also be used with main function:

    @A(der="Asertify",kio=90.8f) // if we remove f then lossy conversion error.
    public static void main(String[] args) {
        System.out.println("Deryfgjk");
        // System.out.println(A.kio); // Cannot do this.
    }
}

// Declaring annotation using interface:
@interface A{
    String der();
    float kio();
    int x=90;
}


// Retention policy is RUNTIME in below code:
@Retention(RetentionPolicy.RUNTIME)
@interface i{
    String s="Anvit Gupta";
    int serpent();
}

// Default retention policy is CLASS.
@Retention(RetentionPolicy.CLASS)
@interface S{
    int gert();
}

// In annotations, remember that void return type is not allowed, you may decalre local variables or string variables in an annotation.
// When using an annotation, then always default values should be provided for all functions in it according to the datatype, there is no type conversion.