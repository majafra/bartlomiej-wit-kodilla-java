package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public class Mentor implements ObserverFIFO {

    private String mentorName;
    private int updateCount;


    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    public int getUpdateCount() {
        return updateCount;
    }
    public void update (UserFIFO userFIFO){
        updateCount++;
    }
    public String getMentorName() {
        return mentorName;
    }
}