package votersApp;

public class Voters {
    Party party;
    private String name;
    private int age;
    private boolean isEligible;

    public Voters(String name, int age) {
        this.name = name;
        this.age = age;

        if (age >= 18) {
            this.isEligible = true;
        } else {
            this.isEligible = false;
        }
    }
}
