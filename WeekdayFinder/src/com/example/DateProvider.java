package com.example;

import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class DateProvider {

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}
