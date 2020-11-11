package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class UserFIFO implements ObservableFIFO{
    private final List<ObserverFIFO> observersFIFO;
    private final String name;
    private final ArrayDeque<String> taskQue;

    public UserFIFO(String name) {
        observersFIFO = new ArrayList<>();
        taskQue = new ArrayDeque<String>();
        this.name = name;
    }

    public void addTask(String task) {
        taskQue.offer(task);
        notifyObserversFIFO();
    }

    public List<ObserverFIFO> getObserversFIFO() {
        return observersFIFO;
    }

    public String getName() {
        return name;
    }

    public ArrayDeque<String> getTaskQue() {
        return taskQue;
    }

    @Override
    public void registerObserverFIFO(ObserverFIFO observerFIFO) {
        observersFIFO.add(observerFIFO);
    }

    @Override
    public void notifyObserversFIFO() {
        for (ObserverFIFO observerFIFO : observersFIFO) {
            observerFIFO.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverFIFO observerFIFO) {
        observersFIFO.remove(observerFIFO);
    }
}

