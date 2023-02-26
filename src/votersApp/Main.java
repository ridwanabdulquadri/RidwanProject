package votersApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> voters = new ArrayList<>();
        ArrayList<Party> parties = new ArrayList<>();
        voters.add("Ridwan");
        voters.add("tunde");
        voters.add("ik");
        voters.add("Ayo");
        voters.add("John");
        voters.add("Sunday");
        System.out.println(voters);
        System.out.println("we have " + voters.size() + " total number of voters");

        parties.add(Party.LPC);
        parties.add(Party.PDP);
        parties.add(Party.APC);
        System.out.println(parties);
        System.out.println("we have " + parties.size() + " parties registered");


    }

}
