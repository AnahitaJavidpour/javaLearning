package name.extraexercise;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class SavingAccount2 extends BaseAccount2 {

    private BigDecimal profitRate;

    private LocalDateTime creationDate;

    public BigDecimal getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(BigDecimal profitRate) {
        this.profitRate = profitRate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void givingProfit() {

        setBalance(getBalance().add(getBalance().multiply(profitRate) ));

    }





}
