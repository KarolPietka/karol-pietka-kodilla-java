package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTaskFactory() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task shoppingTask = factory.makeTask(TasksFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy car.",shoppingTask.getTaskName());
        Assert.assertEquals("Audi R8", shoppingTask.executeTask());
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());
    }
    @Test
    public void testPaintingTaskFactory() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task paintingTask = factory.makeTask(TasksFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint wall in room",paintingTask.getTaskName());
        Assert.assertEquals("Silver", paintingTask.executeTask());
        Assert.assertEquals(true,paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTaskFactory() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task drivingTask = factory.makeTask(TasksFactory.DRIVING);
        //Then
        Assert.assertEquals("Drive", drivingTask.getTaskName());
        Assert.assertEquals("Olkusz", drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
