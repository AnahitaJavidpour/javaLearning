package oopExtraExercise;

import java.math.BigDecimal;

public abstract class Shape {

    private BigDecimal circumference;

    private BigDecimal area;


    public abstract BigDecimal getCircumference();


    public abstract void setCircumference(BigDecimal circumference);


    public abstract BigDecimal getArea();

    public abstract void setArea(BigDecimal area);

    public abstract BigDecimal calculateCircumference();

    public abstract BigDecimal calculateArea();
}
