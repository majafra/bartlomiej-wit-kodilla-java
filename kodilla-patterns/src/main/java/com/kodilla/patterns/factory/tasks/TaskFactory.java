package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "London", "Mercedes");
            case PAINTING:
                return new PaintingTask("Painting", "WHITE", "Apartment");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Milk", 4.0);
            default:
                return null;
        }

    }
}

