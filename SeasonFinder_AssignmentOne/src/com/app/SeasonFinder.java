package com.app;

import java.time.LocalDate;

public class SeasonFinder {

    private LocalDate date;

    // Setter Injection
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String findSeason() {
        int month = date.getMonthValue();

        if (month >= 3 && month <= 5)
            return "Summer Season";
        else if (month >= 6 && month <= 9)
            return "Monsoon Season";
        else if (month >= 10 && month <= 11)
            return "Autumn Season";
        else
            return "Winter Season";
    }
}
