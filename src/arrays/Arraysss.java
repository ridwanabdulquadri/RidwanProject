package arrays;

public class Arraysss {
    public static void main(String[] args) {
        int total = 0;
        int[] array = {10, 10, 20, 30, 40, 50};
//        int[] array =  new int [15];
//        System.out.printf("%s%8s%n","Value","Index");
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("%d%9d%n",i,array[i]);
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            System.out.printf("%d%n",total);
        }
        System.out.println();

    }
}
