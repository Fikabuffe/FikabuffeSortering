package Basepackage;

import java.util.Arrays;

public class Main {
    public static void main(String[] names){
        int[] numbers = {};
        var sorter = new FikaSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers))
    }
    
}
