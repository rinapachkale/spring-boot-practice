package com.example.SpringPrep.DAOImpl;

import com.example.SpringPrep.dao.Coach;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "Practice cricket 3 hours a day!!!!";
    }

    @Override
    public String giveRating(){
        return "5 star rating for cricket coach!!";
    }
}
