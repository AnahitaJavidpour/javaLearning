package oopExtraExercise;

import java.math.BigDecimal;

public class Rectangle extends Shape {

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal circumference;

    private BigDecimal area;


    @Override
    public BigDecimal getCircumference() {
        return circumference;
    }

    @Override
    public void setCircumference(BigDecimal circumference) {

    }

    public void setCircumference(BigDecimal width, BigDecimal length) {
    }

    @Override
    public BigDecimal getArea() {
        return area;
    }

    @Override
    public void setArea(BigDecimal area) {

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


    public void setArea(BigDecimal length,BigDecimal width) {

    }

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
}
