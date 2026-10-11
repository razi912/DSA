package p10_hashing;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> empID = new HashMap<>();

        empID.put("Razi", 25454);
        empID.put("Dhruv", 5654640);
        empID.put("Aditya", 255646);

        System.out.println(empID);

        System.out.println(empID.get("Razi"));

        System.out.println(empID.containsKey("Jay"));
        System.out.println(empID.containsKey("Aditya"));

        System.out.println(empID.containsValue(255646));

        empID.put("Razi",5987);
        System.out.println(empID);



    }
}
