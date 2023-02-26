package starCom;

import java.util.Scanner;

public class StarComMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StarCom starCom = new StarCom();
        System.out.println(starCom.displayMenu());
        starCom.decideUserInput();

//        int userInput = scanner.nextInt();
//        switch (userInput) {
//            case 2:
//               starCom.messageMenu();
//                break;
//        1    case 3:
//                starCom.callRegisterMenu();
//                break;
//            case 4:
//                starCom.settingsMenu();
//                break;
//            case 5:
//                starCom.gamesMenu();
//            default:
//                System.out.println("invalid input");
//                break;
//        }
        String userChoice;
        do {
            System.out.println("Do wish to continue? yes/no");

            userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("yes")){
                System.out.println(starCom.displayMenu());
                starCom.decideUserInput();

        }
    }while (userChoice.equalsIgnoreCase("yes"));

        System.out.println("Thank you");

        }
}

