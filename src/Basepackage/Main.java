package Basepackage;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] a = new int[args.length];
        // Parase int [] From striing []
        for (int i = 0; i <args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }
    
        for (int i = 0; i < args.length; i++){
            System.out.print(a[i]);
        }
    }
}
