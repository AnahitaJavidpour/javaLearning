package mapsExercise;

import java.util.HashMap;

public class MyMaps {
    public static void main(String[] args) {


        HashMap<String, Integer> myH = new HashMap<>();
        myH.put("ahmad", 99);
        myH.put("karim", 85);
        System.out.println(myH);
        System.out.println(myH.get("karim"));
        myH.replace("ahmad",99,77);
        System.out.println(myH);

        System.out.println(myH.containsValue(66));
    }
}
