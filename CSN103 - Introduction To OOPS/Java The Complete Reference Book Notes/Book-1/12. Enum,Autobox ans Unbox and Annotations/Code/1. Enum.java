class Enum{
    public static void main(String[] args) {
        Men m; // No need to use the new keyword.
        // System.out.println(m); // have to be initilaized first.

        m=Men.polite;
        System.out.println(m);

        if(m==Men.handsome){
            System.out.println("Person is handsome.");
        }
        else{
            System.out.println("Person is not handsome.");
        }

        switch(m){
            case cute:System.out.println("Cute");break;
            case pagal:System.out.println("pagal");break;
            case crunchy:System.out.println("crunchy");break;
            default:System.out.println("Defaut case applied => "+m);
        }

        // valueOf method in enum:
        m=Men.valueOf("polite");
        System.out.println(m); // or we can write Men h=m.valueOf("polite");
        try{
        m=Men.valueOf("Aser"); // will generate illegal argument exception.
        System.out.println(m);
        }
        catch(IllegalArgumentException w){
            System.out.println(w.getMessage());
            System.out.println(w);
        }

        // values method in enum:
        Men s[]=Men.values(); // will store in the same order as written.

        for(Men e:s){ // remember here auto keyword cannot be used.
            System.out.println(e); // 
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        // alternate way:
        for(Men e:Men.values()){
            System.out.println(e);
        }
    }
}

enum Men{
    Rude,polite,crunchy,handsome,pagal,baba,lal,cute,hairy,bearded,thumus
}