public class Barca {
    public static int sumNumber(int ... numbers){// multi - dimensional array
        int total = 0;
       for(int number : numbers){
           total += number;
       }
       return  total;
    }
    public static void main(String[] args) {
        System.out.println(sumNumber(1,2,3,4,5,5,6,7,9,6,7,7,9,5,78));
    }
    }
