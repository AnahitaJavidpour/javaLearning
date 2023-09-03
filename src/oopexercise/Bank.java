package oopexercise;

import name.Human;

public class Bank {
    Human[] owners;
    BaseAccount[] bankAccounts;

    public Bank() {

        Human khalilRezaee = new Human();

        khalilRezaee.name = "khalil";

        khalilRezaee.lastName = "Rezaee";

        khalilRezaee.nationalCode = "47521";


        Human fatemehHashemi = new Human();

        fatemehHashemi.name = "fatemeh";

        fatemehHashemi.lastName = "Hashemi";

        fatemehHashemi.nationalCode = "89703";

        Human asgharHosseini = new Human();

        asgharHosseini.name = "asghar";

        asgharHosseini.lastName = "Hosseini";

        asgharHosseini.nationalCode = "39265";

        Human mahsaKazemi = new Human();

        mahsaKazemi.name = "mahsa";

        mahsaKazemi.lastName = "Kazemi";

        mahsaKazemi.nationalCode = "90274";

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
