// Enumeration in java can be defined inside the class.

public class EnumInsideClass {
    enum Apple{
        Jonathan, preeti,smiti,raghav,vineet,raman,sarvasva,souvik,priya
    }
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.raghav;
        System.out.println(ap);

        for(Apple a:Apple.values()){
            System.out.println(a);
            int i=0;
            System.out.println(": "+i);
            i++;
        }
    }
}
