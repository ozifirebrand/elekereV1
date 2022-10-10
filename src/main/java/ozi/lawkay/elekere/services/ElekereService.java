package ozi.lawkay.elekere.services;

import org.springframework.stereotype.Service;

public interface ElekereService {
    String displayTimeOfTheDay();
    String displayDayOfTheWeek();
    String displayMonthOfTheYear();
    String displayDateAndTime();
    String displayDateAlone();
    String editTitle(String title);
    void minimise();
}
