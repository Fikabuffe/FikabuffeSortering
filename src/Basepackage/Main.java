package Basepackage;

import java.util.Arrays;

public class Main {
    public static void main(String[] names){
        int[] numbers = {7,3,4,1,8,5,-1,-4};//Sätt in här för test
        var sorter = new FikaSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
}
