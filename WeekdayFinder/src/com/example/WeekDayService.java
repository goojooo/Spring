package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.format.TextStyle;
import java.util.Locale;

@Component
public class WeekDayService {

    @Autowired   // Autowiring (Field Injection)
    private DateProvider dateProvider;

    public String getCurrentWeekDay() {

        return dateProvider.getCurrentDate()
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
