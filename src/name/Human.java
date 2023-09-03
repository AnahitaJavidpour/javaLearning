package name;

public class Human {
    public String name;
    public String lastName;

    public String nationalCode;
    public static void main(String[] args) {
        Mammad mammad = new Mammad();

        mammad.name = "hossein";
    }

    public String name() {
        return name + " " + lastName;
    }
}
