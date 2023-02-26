import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String>items = new ArrayList<>();

        items.add("kinzy,taye,ik");
        items.add("kinzy");
        items.add("john");
        items.add("zaza");
        System.out.println(items);
        System.out.println();
        for (int ite = 0; ite < items.size() ; ite++) {
            System.out.println(items.get(ite));


        }
    }
}
