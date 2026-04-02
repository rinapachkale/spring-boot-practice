package com.example.SpringPrep.RestController;

import com.example.SpringPrep.dao.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;

    @Autowired
    CoachController(@Qualifier ("cricketCoach") Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/workout")
    String getDailyWorkout(){
        return myCoach.dailyWorkout();
    }

    @GetMapping("/rating")
    public String getRating(){
        return myCoach.giveRating();
    }
}
