public class Tamrin1 {

    public static void main(String[] args) {
        Tamrin1 tamrin1 = new Tamrin1();
        tamrin1.tamrin1(13,true);
        tamrin1.tamrin1(37 ,false,true);
    }

    public void tamrin1(int age, boolean hasIdCard, boolean hasDriversLicence) {
        if (age >= 18) {
            System.out.println(hasIdCard = true);
        System.out.println(hasDriversLicence = true);}
        else{
            System.out.println(hasIdCard=false);
            System.out.println(hasDriversLicence=false);
        }
    }

    public void tamrin1(int age, boolean hasIdCard) {
        if (age >= 18) {
            System.out.println(hasIdCard = true);
        }
        else{
            System.out.println(hasIdCard=false);
        }
    }

}
