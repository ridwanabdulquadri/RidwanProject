package heartRates;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int yearOfBirth, int day, int month) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        this.day = day;
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {

        this.month = month;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {

        this.yearOfBirth = yearOfBirth;
    }
}
