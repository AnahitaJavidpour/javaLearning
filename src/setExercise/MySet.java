package setExercise;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("pool");
        set.add("money");

        System.out.println(set.size());
    }
}