package arrays;

import java.util.Arrays;

public class ArrayGrade {
    public static void main(String[] args) {
        int[] grade = new int[10];
            grade[0] =15;
            grade[1] =26;
            grade[2] =65;
            grade[3] =36;
            grade[4] =75;
            grade[5] =76;

            int lowest = grade[0];
            Arrays.sort(grade);
          System.out.println("the lowest is"+ lowest);




            int total =0;
            for (int i = 0; i < grade.length;i++) {
                total += grade[i];
                System.out.println(grade[i]);
            }


//        System.out.println("minimum student grade is" + grade[0]);
//        System.out.println("maximum student grade is" + grade[5]);
        int average;
        average = total /grade.length;
        System.out.println("average of all student grade is" + average);

    }
    }

