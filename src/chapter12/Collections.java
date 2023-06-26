package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String args[]){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");

        System.out.println(fruit.get(1));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

}
