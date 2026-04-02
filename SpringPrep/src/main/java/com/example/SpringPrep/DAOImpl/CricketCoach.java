package com.example.SpringPrep.DAOImpl;

import com.example.SpringPrep.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "Practice cricket 3 hours a day!!";
    }

    @Override
    public String giveRating(){
        return "5 star rating for cricket coach!!";
    }
}
