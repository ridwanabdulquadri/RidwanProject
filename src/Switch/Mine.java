package Switch;

public class Mine {
    public static void main(String[] args) {
        String muhammed = "Dec" ;

        switch(muhammed){
            case "Jan":
            System.out.println("i love is islam");
            break;
            case "Feb":
                System.out.println("i love him but i hate islam");
                break;
            case "march": case "April": case "June":
                System.out.println("i love and i love islam");
                System.out.printf("Actually it was " + muhammed);
                break;
            default:
                System.out.println("i surrender myself for islam");
                break;


        }
    }
}