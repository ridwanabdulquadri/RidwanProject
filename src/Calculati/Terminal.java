package Calculation;

public class Terminal {
    public static void main(String[] args) {
        boolean laptop = true;
        int studentGrade = 90;
        int grade = 60;
        int score = 50;
        if (studentGrade >= 90) {
            System.out.println("A");
        } else {
            if (studentGrade >= 80) {
                System.out.println("B");
            } else {
                if (studentGrade <= 70) {
                    System.out.println("C");
                } else {
                    if (studentGrade != 60) {
                        System.out.println("D");
                    }
                }
            }
        }
        if (grade >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            System.out.println("You must take this course again.");

        }
        System.out.println(score > 50 ? "True" : "Failed");

    }
}

