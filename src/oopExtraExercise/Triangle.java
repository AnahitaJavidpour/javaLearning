package oopExtraExercise;

import java.math.BigDecimal;

public class Triangle extends Shape {

    private BigDecimal sideA;
    private BigDecimal sideB;
    private BigDecimal sideC;

    private BigDecimal height;
    private BigDecimal circumference;

    private BigDecimal area;





    public BigDecimal getSideA() {
        return sideA;
    }

    public void setSideA(BigDecimal sideA) {
        this.sideA = sideA;
    }

    public BigDecimal getSideB() {
        return sideB;
    }

    public void setSideB(BigDecimal sideB) {
        this.sideB = sideB;
    }

    public BigDecimal getSideC() {
        return sideC;
    }

    public void setSideC(BigDecimal sideC) {
        this.sideC = sideC;
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
        circumference=( sideA.add(sideB)).add(sideC);
        return circumference;
    }

    @Override
    public BigDecimal calculateArea() {
        area= (sideB.multiply(height)).divide(BigDecimal.valueOf(2));
        return area;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }
}
