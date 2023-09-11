package oopexercise;

import name.Human;

import java.math.BigDecimal;

public class Main {

    public void createAccount() {

        BaseAccount newAccount = new BaseAccount();

        Human customer = new Human();

        customer.setName("Hasan");

        customer.setLastName("Ahmadi");

        customer.setNationalCode("12345");

        newAccount.owner = customer;
        newAccount.balance = BigDecimal.valueOf(120000L);
        newAccount.accountNumber = 1353341400000000003L;

        Bank bank = new Bank();

        Human[] owners = new Human[bank.owners.length + 1];
        Human[] formerOwners = bank.owners;
        for (int i = 0; i< formerOwners.length; i++) {
            owners[i] = formerOwners[i];
        }

        owners[owners.length - 1] = newAccount.owner;

        BaseAccount[] accounts = new BaseAccount[bank.bankAccounts.length + 1];
        BaseAccount[] formerAccounts = bank.bankAccounts;
        for (int i = 0; i< formerAccounts.length; i++) {
            accounts[i] = formerAccounts[i];
        }

        accounts[accounts.length - 1] = newAccount;

        bank.bankAccounts = accounts;
        bank.owners = owners;

        for (BaseAccount account: bank.bankAccounts) {
            System.out.println(account.accountNumber + " |||||||||| "+ account.owner.name());
        }
    }

    public static void main(String[] args) {

        Main main = new Main();

        main.createAccount();
    }

}
