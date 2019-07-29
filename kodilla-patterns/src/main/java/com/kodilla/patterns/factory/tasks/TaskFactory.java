package com.kodilla.patterns.factory.tasks;

final class TasksFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final  String PAINTING = "PAINTING";
    public static final  String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("Buy car.", "Audi R8", 1);
            case PAINTING:
                return new PaintingTask("Paint wall in room", "Silver", "Kitchen");
            case DRIVING:
                return new DrivingTask("Drive", "Olkusz", "bike");
            default:
                return null;
        }
    }
}