package name.extraexercise;

import name.Human;

import java.math.BigDecimal;

public class BaseAccount2 {

    private long accountNumber;

    private Human owner;

    private BigDecimal balance;


    public long getAccountNumber() {
        return accountNumber;
    }

    public Human getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(Human owner) {

        this.owner = owner;
    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance;
    }

    public BigDecimal increasingBalance(BigDecimal depositMoney) {

        this.balance = this.balance.add(depositMoney);
        return this.balance;
    }

    public BigDecimal decreasingBalance(BigDecimal takingOutMoney) {

        this.balance = balance.add(takingOutMoney);
        return this.balance;
    }
}
