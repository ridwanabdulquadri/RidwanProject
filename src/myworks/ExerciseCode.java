package myworks;

public class ExerciseCode {
    public static void main(String[] args) {
        checkNumber(5);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("position");
        }else if( number < 0){
            System.out.println("negative");
        }else if( number == 0){
            System.out.println("zero");
        }
    }
}
