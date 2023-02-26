package starCom;

import java.util.Scanner;

public class StarCom {
    public String displayMenu() {
        return ("""
                Welcome!!!
                Enter 1 -> for phonebook
                2 -> for Messages
                3 ->for Call register
                4 ->for Setting
                5 ->for Game
                6 ->for Extras
                """);
    }

    public void messageMenu() {
        System.out.println("""
                1 -> To Create messages
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                """);
    }

    public void callRegisterMenu() {
        System.out.println("""
                1 -> Dialled Calls
                2 -> Missed Calls
                3 -> Recent Calls
                """);
    }

    public void settingsMenu() {
        System.out.println("""
                1 -> Tone setting
                2 ->Incoming Call Alert
                3 => Keypad Tones
                4 -> Screen Saver
                5 -> Composer
                """);
    }
    public void gamesMenu(){
        System.out.println("""
                i -> Games""");
    }
    public void decideUserInput(){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1: displayMenu();
            break;
            case 2: messageMenu();
            break;
            case 3:callRegisterMenu();
            break;
            case 4: settingsMenu();
            break;
            case 5: gamesMenu();
            default:
                System.out.println("invalid input!!!");
                break;
        }
    }



}