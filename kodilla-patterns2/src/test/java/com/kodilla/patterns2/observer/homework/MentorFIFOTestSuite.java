package com.kodilla.patterns2.observer.homework;

import javafx.beans.binding.When;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorFIFOTestSuite {

    @Test
    public void testUpdteQue() {
        // Given
        UserFIFO kursant1 = new UserFIFO("kursant1");
        UserFIFO kursant2 = new UserFIFO("kursant2");
        UserFIFO kursant3 = new UserFIFO("kursant3");
        Mentor jacek = new Mentor("Jacek");
        Mentor piotrek = new Mentor("Piotrek");
        kursant1.registerObserverFIFO(jacek);
        kursant1.registerObserverFIFO(piotrek);
        kursant2.registerObserverFIFO(jacek);
        kursant2.registerObserverFIFO(piotrek);
        kursant3.registerObserverFIFO(jacek);
        // When
        kursant1.addTask("task1");
        kursant1.addTask("task2");
        kursant2.addTask("task3");
        kursant2.addTask("task4");
        kursant2.addTask("task5");
        kursant2.addTask("task5");
        kursant3.addTask("task7");
        kursant3.addTask("task8");
        //Then
        assertEquals(8,jacek.getUpdateCount());
        assertEquals(6,piotrek.getUpdateCount());
    }
}