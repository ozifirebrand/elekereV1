package ozi.lawkay.elekere.services;

import javax.swing.*;

public interface ElekereService {
    String displayTimeOfTheDay() throws InterruptedException;
    String displayDayOfTheWeek();
    String displayMonthOfTheYear();
    String displayDateAndTime();
    String displayDateAlone();
    String editTitle(String title);
    void minimise();
}
