package arraylist;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("jerry");
        items.add("inem");
        items.add("zaza, dami");
        items.add("kinzy");
        items.add("dami");
        items.add(2,"cephas");

        System.out.println(items);
        System.out.println("we have " + items.size() + "people in our list");
        System.out.println("let's remove some whimps!!!");
        //System.out.println(items.size());

        items.remove("jerry");
        System.out.println(items);
        System.out.println("we have " +  items.size()  + " people in our list");

        items.remove(2);
        System.out.println(items);
        System.out.println("we have " +  items.size()  + " people in our list");

        items.clear();
        System.out.println("we have " +  items.size()  + " people in our list");
        //System.out.println(items.toString());
        System.out.println("before cloning");
        System.out.println(items.clone());
        System.out.println("we have " +  items.size()  + " people in our list");
        System.out.println(items.contains("inem"));
        System.out.println(items.contains("zaza"));
        System.out.println(items.lastIndexOf("kinzy"));
        items.add("kinzy");
        System.out.println(items);
        System.out.println(items.lastIndexOf("kinzy"));





    }
}