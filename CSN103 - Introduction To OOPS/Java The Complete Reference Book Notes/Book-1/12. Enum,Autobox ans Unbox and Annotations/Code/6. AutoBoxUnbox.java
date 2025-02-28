class AutoBoxUnbox{
    static int meta(Integer i)
    {
        return i;
    }
    public static void main(String[] args) {
        // Auto boxing and unboxing in variables:

        Integer io=100; // int primitive datatype autoboxed to  object io directly.
        int i=io; // object auto-unboxed to int primitive type directly.
        System.out.println(io);
        System.out.println(i);
        
        // Autoboxing and unboxing in methods:
        Integer h1=AutoBoxUnbox.meta(145); // passing int value will autobox to integer object and the return value also.
        int h2=h1; // object unbox to primitive.
        System.out.println(h2);

        // Autoboxing and Auto-unboxing in expressions:
        Integer i1,i2;
        i1=100; // boxing auto.
        i2=i1+67; // unboxing and then boxing auto.
        
        Double d1;
        d1=67.8;// boxing auto.

        d1=d1+i2;// unbox and then rebox auto;

        int i=i1+i2; // only unboxing auto.
    }
}

