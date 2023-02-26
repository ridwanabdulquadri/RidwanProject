package AllStudent;


public class StudentTest1 {
    public static void main(String[] args) {
        Student account1 = new Student("Wakila", 93.5);
        Student account2 = new Student("Samod", 72.75);

        System.out.printf("%s's letter Grade is: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter Grade is: %s%n ",
                account2.getName(), account2.getLetterGrade());
    }


}