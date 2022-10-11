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
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMg-yyyy");


    @Override
    public String displayTimeOfTheDay() {
        return "Time is "+timeFormat.format(Calendar.getInstance().getTime());

    }

    @Override
    public String displayDayOfTheWeek() {
        return "Day is "+dayFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String displayMonthOfTheYear() {
        return "Month is "+monthFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String displayDateAndTime() {
        return "Date and time is "+dateAndTimeFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String displayDateAlone() {
        return "Date is "+dateFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public String editTitle(String title) {
        return null;
    }

    @Override
    public void minimise() {

    }
}
