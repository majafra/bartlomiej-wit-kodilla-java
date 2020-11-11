package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface ObservableFIFO {
    void registerObserverFIFO(ObserverFIFO observerFIFO);
    void notifyObserversFIFO();
    void removeObserver(ObserverFIFO observerFIFO);
}
