package ozi.lawkay.elekere.services;

import org.springframework.stereotype.Service;
import ozi.lawkay.elekere.models.Elekere;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class ElekereServiceImpl implements ElekereService {
    private final Elekere elekere;
    private final SimpleDateFormat timeFormat = new SimpleDateFormat("hh-mm-ss");
    private final SimpleDateFormat dayFormat = new SimpleDateFormat("eeee-dd-MM-yyyy");
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");


    public ElekereServiceImpl(Elekere elekere){
        this.elekere = elekere;
    }

    @Override
    public JFrame displayTimeOfTheDay() {
        while (true){
            String time = timeFormat.format(Calendar.getInstance().getTime());
            JLabel label = elekere.getText();
            label.setText(time);
            elekere.getDisplay().add(label);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String displayDayOfTheWeek() {
        return null;
    }

    @Override
    public String displayMonthOfTheYear() {
        return null;
    }

    @Override
    public String displayDateAndTime() {
        return null;
    }

    @Override
    public String displayDateAlone() {
        return null;
    }

    @Override
    public String editTitle(String title) {
        return null;
    }

    @Override
    public void minimise() {

    }
}
