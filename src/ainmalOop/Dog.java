package ainmalOop;

public class Dog extends  Animal{
    private String tail;
    public void bites() {
        System.out.println("Make noise and I bite you!!!!!!");
    }
        @Override
        public  String makeSound(){
        return   "bark bark bark";

        }


    }

