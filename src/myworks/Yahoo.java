package myworks;

public class Yahoo {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true,800,5,100);

//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score =" + finalScore);
//        }

//        if(score < 5000 & score >1000) {
//            System.out.println("your score was 5000 is lesser than 5000 and sore greater than 1000");
//        }else if(score < 1000){
//            System.out.println("your score is less than 1000");
//        }else {
//            System.out.println("Got here");
//        }
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(gameOver == true){
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score =" + finalScore);
//        }
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(gameOver == true){
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score =" + finalScore);
//        }
        calculateScore(true,10000,8,200);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score =" + finalScore);
//        }
    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score =" + finalScore);
        }
    }
}
