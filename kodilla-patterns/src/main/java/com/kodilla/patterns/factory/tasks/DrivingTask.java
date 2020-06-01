package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;
    private Boolean yesOrNot;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    public void executeTask(){
        System.out.println("Executing Driving");
    }
    public String getTaskName(){
        return taskName;
    };
    public Boolean isTaskExecuted(){
        return yesOrNot;
    };
}
