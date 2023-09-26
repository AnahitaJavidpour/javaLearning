package exceptionAndError;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

public class TryCatch {
    public static void main(String[] args) {



        try {
            BigDecimal num = BigDecimal.valueOf(7 / 0);
            System.out.println(num);
        } catch (Exception e){

            System.out.println("out of response");
    }

}
        }