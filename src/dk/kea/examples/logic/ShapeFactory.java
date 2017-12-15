package dk.kea.examples.logic;

public class ShapeFactory
{
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType)
    {
        if (shapeType == null) {
            return null;
        }

        shapeType = shapeType.toUpperCase();

        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}