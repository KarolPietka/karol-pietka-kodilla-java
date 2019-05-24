package com.kodilla.testing.shape;

import org.junit.*;

import java.sql.SQLOutput;

public class ShapeCollectorTestSiute {
    private static int testCounter = 0;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test //1
    public void testAddFigure() {
        //Given
        ShapeCollector figureCollections = new ShapeCollector();
        Circle figure = new Circle(5);

        //When
        figureCollections.addFigure(figure);

        //Than
        Assert.assertEquals(1, figureCollections.getFiguresQuantity());
    }

    @Test //2
    public void testRemoveFigure() {
        //Given
        ShapeCollector figureCollections = new ShapeCollector();
        Circle figure = new Circle(5);
        figureCollections.addFigure(figure);

        //When
        figureCollections.removeFigure(figure);

        //Than
        Assert.assertEquals(0, figureCollections.getFiguresQuantity());
    }

    @Test //3
    public void testGetFigure() {
        //Given
        ShapeCollector figureCollections = new ShapeCollector();

        figureCollections.addFigure(new Circle(5.0));
        figureCollections.addFigure(new Triangle(3,4));
        figureCollections.addFigure(new Square(5));

        //When
        String actual = figureCollections.showFigures();

        //Than
        Assert.assertEquals("Figure: Circle - field: 78.53981633974483\n" +
        "Figure: Triangle - field: 6.0\n" + "Figure: Square - field: 25.0", actual);
    }

    @Test //4
    public void testShowFigure() {
        //Given
        ShapeCollector figureCollections = new ShapeCollector();
        Circle figure = new Circle(5);
        figureCollections.addFigure(figure);

        //When
        String show = figureCollections.showFigures();

        //Than
        Assert.assertEquals("Figure: Circle - field: 78.53981633974483", show);
    }
}