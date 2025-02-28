public class EnumAsClass {
    public static void main(String[] args) {
            Dirty d=Dirty.baddirty; // When the reference d created then the constructors to all the enumeration constant will get called.
            
            System.out.println(d);

            System.out.println(Dirty.gooddirty.getp());
            System.out.println(Dirty.verydirty.getq());

            Dirty.verydirty.setp(23);
            Dirty.verydirty.setq(90);
            System.out.println(Dirty.verydirty.getp());
            System.out.println(Dirty.verydirty.getq());
    }
}

enum Dirty{
    verydirty(90),gooddirty(90,67),baddirty,pagaldirtyl;

    private int p;
    private int q;

    Dirty(int x,int y){
        p=x;q=y;
        System.out.println("I am the double constructor.");
    }
    Dirty(int h){
        p=q=h;
        System.out.println("I am the single constructor.");
    }
    Dirty(){
        p=q=-1;
        System.out.println("I am the deparametrised constructor.");
    }

    int getp(){
        return p;
    }
    int getq(){
        return q;
    }
    void setp(int h){
        p=h;
    }
    void setq(int y){
        q=y;
    }
}