package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    Boolean yesOrNot;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {
        System.out.println("Executing Shopping");
    }

    public String getTaskName() {
        return taskName;
    }

    public Boolean isTaskExecuted() {
        return yesOrNot;
    }
}

