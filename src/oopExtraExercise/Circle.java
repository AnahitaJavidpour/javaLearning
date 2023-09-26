package oopExtraExercise;

import java.math.BigDecimal;

public class Circle extends Shape {

    private BigDecimal radius;

    final static BigDecimal PI  = BigDecimal.valueOf(3);

    private BigDecimal diameter;

    private BigDecimal circumference;

    private BigDecimal area;


    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }


    public BigDecimal getDiameter() {
        return diameter;
    }

    public void setDiameter(BigDecimal diameter) {
        this.diameter = diameter;
    }

    @Override
    public BigDecimal getCircumference() {
        return circumference;
    }

    @Override
    public void setCircumference(BigDecimal circumference) {
        this.circumference = circumference;
    }

    @Override
    public BigDecimal getArea() {
        return area;
    }

    @Override
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Override
    public BigDecimal calculateCircumference() {
        circumference=PI.multiply(radius).multiply(BigDecimal.valueOf(2));
        return circumference;
    }

    @Override
    public BigDecimal calculateArea() {
        area= PI.multiply(radius).multiply(radius);
        return area;
    }
}
