package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.Shape;
import dk.kea.examples.logic.ShapeFactory;

public class FactoryExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demonstrate the factory pattern";
    }

    @Override
    public String getName()
    {
        return "Factory pattern";
    }

    @Override
    public void runExample()
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }
}
