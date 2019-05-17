package com.kodilla.testing.shape;

import org.junit.*;

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
        Circle figure = new Circle("circle");

        //When
        figureCollections.addFigure(figure);

        //Than
        Assert.assertEquals(1, figureCollections.getFiguresQuantity());
    }

    @Test //2
    public void testRemoveFigure() {
        //Given
        ShapeCollector figureCollections = new ShapeCollector();
        Circle figure = new Circle("circle");
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
        Circle figure = new Circle("circle");
        figureCollections.addFigure(figure);

        //When
       int figures = figureCollections.getFigure(0);

        //Than
        Assert.assertEquals(1, figures);
    }

    @Test //4
    public void testShowFigure() {
        //Given
        ShapeCollector figureCollections = new ShapeCollector();
        Circle figure = new Circle("Circle");
        figureCollections.addFigure(figure);
        String expexted = "Figure:" + figure + "- field:" + figureCollections.showFigures(1);


        //When
         String show = figureCollections.showFigures(0);

        //Than
        Assert.assertEquals(expexted, show);
    }
}