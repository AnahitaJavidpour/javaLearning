package oopexercise;

import name.Human;

public class Bank {
    public Human[] owners;
    public BaseAccount[] bankAccounts;

    public Human[] getOwners() {
        return owners;
    }

    public void setOwners(Human[] owners) {
        this.owners = owners;
    }

    public BaseAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BaseAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Bank() {

        Human khalilRezaee = new Human();

        khalilRezaee.setName("khalil");

        khalilRezaee.setLastName("Rezaee");

        khalilRezaee.setNationalCode("47521");


        Human fatemehHashemi = new Human();

        fatemehHashemi.setName("fatemeh");

        fatemehHashemi.setLastName("Hasihem");

        fatemehHashemi.setNationalCode("89703");

        Human asgharHosseini = new Human();

        asgharHosseini.setName("asghar");

        asgharHosseini.setLastName("Hosseini");

        asgharHosseini.setNationalCode("39265");

        Human mahsaKazemi = new Human();

        mahsaKazemi.setName ("mahsa");

        mahsaKazemi.setLastName ("Kazemi");

        mahsaKazemi.setNationalCode ("90274");

        BaseAccount num1 = new BaseAccount();
        num1.owner = khalilRezaee;
        num1.accountNumber = 9765874386492920L;
        BaseAccount num2 = new BaseAccount();
        num2.owner = fatemehHashemi;
        num2.accountNumber = 927640563476509875l;
        BaseAccount num3 = new BaseAccount();
        num3.owner = mahsaKazemi;
        num3.accountNumber = 65925502745729347L;
        BaseAccount num4 = new BaseAccount();
        num4.owner = asgharHosseini;
        num4.accountNumber = 8184905346672362l;

        owners = new Human[]{mahsaKazemi, khalilRezaee, fatemehHashemi, asgharHosseini};
        bankAccounts = new BaseAccount[]{num1, num2, num3, num4};
    }
}
