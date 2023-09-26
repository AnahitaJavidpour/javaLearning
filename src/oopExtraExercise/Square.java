package oopExtraExercise;

import java.math.BigDecimal;

public class Square extends Shape {

    public static Object get;
    private BigDecimal length;
    private BigDecimal width;

    private BigDecimal circumference;

    private BigDecimal area;


    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    @Override
    public BigDecimal getCircumference() {
        return circumference;
    }

    @Override
    public void setCircumference(BigDecimal length) {

    }

    @Override
    public BigDecimal getArea() {
        return area;
    }

    @Override
    public void setArea(BigDecimal length) {

    }

    @Override
    public BigDecimal calculateCircumference() {
       circumference= (this.length.add(this.width)).multiply(BigDecimal.valueOf(2));
       return circumference;
    }

    @Override
    public BigDecimal calculateArea() {
        area= this.length.multiply(this.width);
        return area;
    }
}