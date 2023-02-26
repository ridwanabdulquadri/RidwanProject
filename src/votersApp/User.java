package votersApp;

public class User {
    private String surname;
    private String name;
    private String otherName;
    private String address;
    private String DateOfBirth;
    private String Photo;
    private String statOfOrigin;
    private String nationality;
    private String cardNumber;

    public User(String surname, String name, String otherName, String address, String dateOfBirth, String photo, String statOfOrigin, String nationality, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.otherName = otherName;
        this.address = address;
        DateOfBirth = dateOfBirth;
        Photo = photo;
        this.statOfOrigin = statOfOrigin;
        this.nationality = nationality;
        this.cardNumber = cardNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getStatOfOrigin() {
        return statOfOrigin;
    }

    public void setStatOfOrigin(String statOfOrigin) {
        this.statOfOrigin = statOfOrigin;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}