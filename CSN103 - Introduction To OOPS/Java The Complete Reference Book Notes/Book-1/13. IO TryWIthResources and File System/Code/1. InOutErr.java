import java.util.Scanner;
import java.lang.System;

public class InOutErr {
    public static void main(String[] args) {

        // System.in use:
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        
        // System.out use:
        System.out.println(x+" Anvit Pagla is Great in this immortality.");

        // System.err use:
        System.err.println(x);
    }
}
