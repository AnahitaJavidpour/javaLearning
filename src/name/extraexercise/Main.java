package name.extraexercise;

import name.Human;
import oopexercise.Bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        BankingServiceImpl bankingServiceimpl = new BankingServiceImpl();

        BaseAccount2 baseAccount2 = new BaseAccount2();

        baseAccount2.setBalance(BigDecimal.valueOf(0));

        baseAccount2.setAccountNumber(3755190843261078l);

        System.out.println("new customer" + "");

        System.out.print("name & last name : " + "");

        System.out.println(bankingServiceimpl.NewCustomers().name());

        System.out.print("account number :" + "");

        System.out.println(baseAccount2.getAccountNumber());

        System.out.print("balance : " + "");

        System.out.println(baseAccount2.increasingBalance(BigDecimal.valueOf(500000)));

        System.out.println("...........................................");

        System.out.println("bank customer's list : ");

        for (Human customer : bankingServiceimpl.createAccount()) {

            System.out.println(customer.name());

        }

        LocalDateTime now = LocalDateTime.now();
        SavingAccount2 savingAccount2 = new SavingAccount2();
        savingAccount2.setBalance(BigDecimal.valueOf(1));
        savingAccount2.setProfitRate(BigDecimal.valueOf(0.01));
        savingAccount2.setCreationDate(now);
        if (now.isAfter(savingAccount2.getCreationDate().minusDays(30))) {
            savingAccount2.givingProfit();
        }

        System.out.println(savingAccount2.getBalance());



    }
}
