import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        Lists lists = new Lists();

        List<String> list = List.of("akbar", "mammad", "asghar");
        list.forEach(element -> {
            System.out.println(element);
        });

        for (String d : list) {
            System.out.println("d");
        }
    }
}
