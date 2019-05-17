package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public List<Shape> figureCollections = new ArrayList<>();

    public void addFigure(Shape shape){
        figureCollections.add(shape);
    }
    public void removeFigure(Shape shape){
       figureCollections.remove(shape);
    }
    public int getFigure(int n){
       return figureCollections.size();
    }
    public String showFigures(int n){
        String showF = "Figure: " + figureCollections.get(n).getShapeName() + "- field: " + figureCollections.get(n).getField();
        return showF;
        }
    public int getFiguresQuantity(){
        return  figureCollections.size();
    }
}
