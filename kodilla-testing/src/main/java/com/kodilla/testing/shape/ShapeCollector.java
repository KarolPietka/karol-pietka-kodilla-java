package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public String showFigures(){
       return figureCollections.stream()
               .map(shape -> "Figure: " + shape.getShapeName()+ " - field: " + shape.getField())
               .collect(Collectors.joining("\n"));

        }
    public int getFiguresQuantity(){
        return  figureCollections.size();
    }
}
