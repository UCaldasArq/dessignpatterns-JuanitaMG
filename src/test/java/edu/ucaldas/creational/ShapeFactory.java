package edu.ucaldas.creational;

public class ShapeFactory {

    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
