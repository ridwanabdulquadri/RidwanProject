package chapter2;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        long currentWorldPopulation = 7_800_000_000L;
        double annualWorldPopulationGrowthRate = 67_000_000;

        double firstYear = currentWorldPopulation + annualWorldPopulationGrowthRate;
        double secondYear = firstYear + annualWorldPopulationGrowthRate;
        double thirdYear = secondYear + annualWorldPopulationGrowthRate;
        double fourthYear = thirdYear + annualWorldPopulationGrowthRate;
        double fifthYear = fourthYear + annualWorldPopulationGrowthRate;

        System.out.println("The total estimated world population after first year " + firstYear);
        System.out.println("The total estimated world population after second year " + secondYear );
        System.out.println("The total estimated world population after third year " + thirdYear);
        System.out.println("The total estimated world population after third year " + fourthYear);
        System.out.println("The total estimated world population after third year " + fifthYear);



    }
}
