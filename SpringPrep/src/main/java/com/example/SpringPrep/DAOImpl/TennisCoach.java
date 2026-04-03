package com.example.SpringPrep.DAOImpl;

import com.example.SpringPrep.dao.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout(){
        return "Practice tennis three times a day!!!";
    }

    @Override
    public String giveRating() {
        return "4 start rating for tennis coach!!";
    }
}
