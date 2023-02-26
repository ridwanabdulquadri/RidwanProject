package myworks;

public class Engine {
    public static void main(String[] args) {
        int days = 1;

        switch (days) {
            case 1:
                System.out.println("i love u");
                break;
            case 2:
                System.out.println("i hate u");
                break;
            case 3:
                System.out.println("i dislike you");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("i can");
                System.out.println("it is case " + days);
                break;

            default:
                System.out.println("invalid number");
                break;

        }
            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;
            int f = 6;

            System.out.println(a + b + c + d + e + f);
            int[] number;
            number = new int[10];

            number[0] = 9;
            number[1] = 10;
            number[2] = 13;
            number[3] = 8;
            int i = 0;
            for (int ola : number) {
                System.out.println(number[i]);
                i++;

            }
        }
    }
