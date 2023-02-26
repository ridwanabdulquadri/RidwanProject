package Calculation;

public class Terminator {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true,800,5 ,100);

        score = 800;
        levelCompleted = 5;
        bonus = 100;

        calculateScore(true,10000,8,200);

    }
            public static void calculateScore (boolean gameOver,int score,int levelCompleted,int bonus) {
            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("final score is  =" + finalScore);
            }
        }

}