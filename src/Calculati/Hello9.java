package Calculation;

public class Hello9 {
    public static void main(String[] args){
    boolean gameOver = true;
    int score = 5000;
    int completed = 5;
    int bonus = 100;

    if (score == 4000) {
        System.out.println("Your score was  5000");
        System.out.println("this was executed");
    }

    if (score == 5000) {
        System.out.println("Your score was less than 5000");
    } else {
        System.out.println("Got here");
    }

//    if(score < 5000 && score > 1000) {
//        System.out.println("Your score was less than 5000 but greater than 1000");
//    }else if(score < 1000) {
//        System.out.println("Your score wass less than 1000");
//    }else {
//        System.out.println("Got here");
//    }
    }
}
