package bigyahoos;

public class BigYahoo {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was =" + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//         highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was =" + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ned", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ayo", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Frank", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("New ", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Tom ", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " manage to get into position " + highScorePosition + " on the high on the table ");
    }

    public static int calculateHighScorePosition(int playScore) {
//        if (playScore >= 1000) {
//            return 1;
//        } else if (playScore >= 500) {
//            return 2;
//        } else if (playScore >= 100) {
//            return 3;
//        }
//            return 4;
//        }
        int position = 4;
        if (playScore >= 1000) {
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        } else if (playScore >= 100) {
            position = 3;
        }
        return position;
    }
}



//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//
//        }
//            return -1;
//    }
//}
