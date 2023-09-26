import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {

        String name = null;
        Optional<String> s = Optional.ofNullable(name);
        System.out.println(s);

}
}