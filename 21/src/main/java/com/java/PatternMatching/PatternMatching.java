package com.java.PatternMatching;

import com.java.PatternMatching.forms.Circle;
import com.java.PatternMatching.forms.Rectangle;
import com.java.PatternMatching.forms.Shape;
import com.java.PatternMatching.forms.Triangle;

public class PatternMatching {



    public static void main(String[] args) {

        System.out.println(getResult(42));
        System.out.println(getResult("Hello"));
        System.out.println(getResult(new nonPrimitive()));

        System.out.println(getArea(new Circle(5.1)));
        System.out.println(getArea(new Triangle(5.1, 5.1)));
        System.out.println(getArea(new Rectangle(5.1, 5.1)));

    }

    private static String getResult(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer value: " + i;
            case String s -> "String value: " + s;
            case Double d -> "Double value: " + d;
            case null -> "null value";
            default -> "unknown value";
        };
    }

    private static Object getArea(Shape shape) {
        return switch (shape) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
            case Triangle t -> 0.5 * t.base() * t.height();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }


}

class nonPrimitive {
}
