package AllStudent;

public class Iphones {
    private static double balance;
    private static int age;
    private static String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
//    public Iphones(){} // no arg constructor;
    public Iphones(int age,double balance,String name){//all args contructor
        this(age);
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
    public Iphones(int age){ // required arg
        if (age<150){
        this.age = age;}
    }

    public static void main(String[] args) {
        Iphones sheriff = new Iphones(16,100,"jhfhfhfj");
        System.out.println(Iphones.balance);
    }


}
