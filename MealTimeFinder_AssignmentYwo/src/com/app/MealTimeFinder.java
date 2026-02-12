package com.app;

import java.time.LocalDateTime;

public class MealTimeFinder {

    private LocalDateTime dateTime;

    // Setter Injection
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String findMealTime() {

        int hour = dateTime.getHour();

        if (hour >= 6 && hour < 11)
            return "Breakfast Time";
        else if (hour >= 11 && hour < 15)
            return "Lunch Time";
        else if (hour >= 15 && hour < 19)
            return "Snacks Time";
        else if (hour >= 19 && hour < 23)
            return "Dinner Time";
        else
            return "Sleeping Time";
    }
}
