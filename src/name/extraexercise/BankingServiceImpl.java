package name.extraexercise;

import name.Human;
import oopexercise.Bank;

import java.math.BigDecimal;

public class BankingServiceImpl {


    public Human NewCustomers() {


        Human anaJavid = new Human();

        anaJavid.setName("Ana");

        anaJavid.setLastName("Javid");

        anaJavid.setNationalCode("03185");

        BaseAccount2 newAccount = new BaseAccount2();

        newAccount.setOwner(anaJavid);

        return newAccount.getOwner() ;
    }

    public Human[] bankCustomers() {

        Human[] customers = new Human[4];

        BaseAccount2[] customersAccount = new BaseAccount2[4];

        Human human1 = new Human();

        human1.setName("Ahmad");
        human1.setLastName("Ahmadi");
        human1.setNationalCode("947610");

        BaseAccount2 account1 = new BaseAccount2();
        account1.setAccountNumber(635487635428949860l);
        account1.setOwner(human1);
        account1.setBalance(BigDecimal.valueOf(3800000));

        customers[0] = human1;
        Human human2 = new Human();

        human2.setName("Elahe");
        human2.setLastName("Asgari");
        human2.setNationalCode("0278846");

        BaseAccount2 account2 = new BaseAccount2();
        account2.setAccountNumber(77590238434619552l);
        account2.setOwner(human2);
        account2.setBalance(BigDecimal.valueOf(1400000));

        customers[1] = human2;

        Human human3 = new Human();

        human3.setName("Kiana");
        human3.setLastName("Akbari");
        human3.setNationalCode("663852");

        BaseAccount2 account3 = new BaseAccount2();

        account3.setAccountNumber(7498209437613766l);
        account3.setOwner(human3);
        account3.setBalance(BigDecimal.valueOf(8200000l));

        customers[2] = human3;

        Human human4 = new Human();

        human4.setName("Naser");
        human4.setLastName("Naseri");
        human4.setNationalCode("597120");

        BaseAccount2 account4 = new BaseAccount2();
        account4.setAccountNumber(12653487902648l);
        account4.setOwner(human4);
        account4.setBalance(BigDecimal.valueOf(500000));

        customers[3] = human4;

        Bank bank = new Bank();

        Human[] allCustomers = new Human[bank.owners.length + 4];

        for (int i = 0; i < customers.length; i++) {

            allCustomers[i] = bank.owners[i];
        }

        for (int j = 0; j < customers.length; j++) {

            allCustomers[j + bank.owners.length] = customers[j];
        }


        return allCustomers;
    }


    public Human[] createAccount() {
        Bank bank = new Bank();

        Human[] customersPlusNewOne = new Human[bankCustomers().length +1];

        for (int i = 0; i < bankCustomers().length; i++) {

            customersPlusNewOne[i] = bankCustomers()[i];

        }
            customersPlusNewOne[customersPlusNewOne.length - 1] = NewCustomers();

        return customersPlusNewOne;
    }
}