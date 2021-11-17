package basepackage;

public class Main {
    public static void main(String[] args){
        FikaSort sorter = new FikaSort();
        int [] intArgs = new int[args.length];

        for (int a = 0; a < args.length; a++) {
            intArgs[a] = Integer.parseInt(args[a]);
        }
        int[] sorted = sorter.sort(intArgs);
        for(int number : sorted){
            System.out.println(number);
        }
    }
}