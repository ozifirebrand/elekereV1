package ozi.lawkay.elekere.services;

import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class ElekereServiceImpl implements ElekereService {

    private final SimpleDateFormat timeFormat = new SimpleDateFormat("hh-mm-ss a");
    private final SimpleDateFormat dayFormat = new SimpleDateFormat("EEEEE");
    private final SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
    private final SimpleDateFormat dateAndTimeFormat = new SimpleDateFormat("EEEEE dd-MMMM-yyyy hh-mm-ss a");
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


    @Override
    public String displayTimeOfTheDay() {
        return "Time is "+timeFormat.format(Calendar.getInstance().getTime());

    }

    @Override
    public String displayDayOfTheWeek() {
        return dayFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String displayMonthOfTheYear() {
        return monthFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String displayDateAndTime() {
        return dateAndTimeFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String displayDateAlone() {
        return dateFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String editTitle(String title) {
        return null;
    }

    @Override
    public void minimise() {

    }
}
