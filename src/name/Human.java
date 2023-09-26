package name;

public class Human {
    private String name;
    private String lastName;

    private String nationalCode;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }


    public static void main(String[] args) {
        Mammad mammad = new Mammad();

        mammad.name = "hossein";
    }

    public String name() {
        return name + " " + lastName;
    }


}
