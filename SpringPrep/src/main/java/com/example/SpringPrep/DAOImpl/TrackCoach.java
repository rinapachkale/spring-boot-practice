package com.example.SpringPrep.DAOImpl;

import com.example.SpringPrep.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String dailyWorkout() {
        return "Run hard 10k on track!!";
    }

    @Override
    public String giveRating() {
        return "4.5 star rating for track coach!!";
    }
}
