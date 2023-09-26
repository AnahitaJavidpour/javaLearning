package oopExtraExercise;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        square.setLength(BigDecimal.valueOf(5));
        square.setWidth(BigDecimal.valueOf(5));


        rectangle.setLength(BigDecimal.valueOf(4));
        rectangle.setWidth(BigDecimal.valueOf(6));

        rectangle.setCircumference(BigDecimal.valueOf(4), BigDecimal.valueOf(6));
        rectangle.setArea(BigDecimal.valueOf(4), BigDecimal.valueOf(6));


        triangle.setSideA(BigDecimal.valueOf(2));
        triangle.setSideB(BigDecimal.valueOf(3));
        triangle.setSideC(BigDecimal.valueOf(4));
        triangle.setHeight(BigDecimal.valueOf(5));


        circle.setRadius(BigDecimal.valueOf(4));
        circle.setDiameter(BigDecimal.valueOf(8));

        System.out.println("our square circumference is : " + "" + square.calculateCircumference());
        System.out.println("our square area is : " + "" + square.calculateArea());
        System.out.println("our rectangle area is : " + "" + rectangle.calculateArea());
        System.out.println("our rectangle circumference is : " + "" + rectangle.calculateCircumference());
        System.out.println("our triangle area is : " + "" + triangle.calculateArea());
        System.out.println("our triangle circumference is : " + "" + triangle.calculateCircumference());
        System.out.println("our circle area is :" + "" + circle.calculateArea());
        System.out.println("our circle circumference is :" + "" + circle.calculateCircumference());
    }

}
