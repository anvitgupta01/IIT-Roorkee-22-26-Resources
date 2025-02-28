public class TypeWrappers {
    public static void main(String[] args) {
        
        // will encapsulate the value of the char primitive type. Don't use constructor as it has been deprecated.
        Character c=Character.valueOf('A');
        System.out.println(c.charValue());
        // As all the type wrappers will override toString() method, println can be directly called.
        System.out.println(c); // Autounboxing occurs.

        // In valueOf for boolean wrapper, string with true in upper or lower case is considered as true, otherwise all false:
        Boolean b=Boolean.valueOf("TRUE");
        Boolean b2=Boolean.valueOf("TRue");
        Boolean b1=Boolean.valueOf(true);
        Boolean v=Boolean.valueOf("Fasrtgbfd");
        System.out.println(b+" "+b1+" "+v+" "+b2);
        System.out.println(b1.booleanValue());
        // As all the type wrappers will override toString() method, println can be directly called.
        System.out.println(b);// autounboxing occurs.

        Integer i1=Integer.valueOf(234);
        Integer i2=Integer.valueOf("234", 8);// (string value of int,radix); Radix means number system or which base using.
        System.out.println(i1.intValue());
        System.out.println(i2); // autounboxing occurs.

        // Same all for the float, double, byte, short, long.
    }   
}
