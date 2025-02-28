public class ThreeMethods {
    public static void main(String[] args) {
        Icecream i1;
        Icecream i2;
        Icecream i3;
        i1=Icecream.pineapple;
        i2=Icecream.kachabadam;
        i3=Icecream.butterscotch;

        for(Icecream j:Icecream.values())
        {
            System.out.println(j.ordinal());
        }

        // Will compare the ordinal value:
        System.out.println(i1.compareTo(i2));
        System.out.println(i2.compareTo(i1));

        i3=Icecream.pineapple;
        System.out.println(i1.compareTo(i3));

        if(i1==i3){
            System.out.println("YES");
        }
        if(i1.equals(i3)){
            System.out.println("YES");
        }
    }
}

enum Icecream{
    pineapple, kachabadam, mango, butterscotch
}