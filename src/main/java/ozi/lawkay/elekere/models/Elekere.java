package ozi.lawkay.elekere.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
@Getter
@Setter
public class Elekere {
    private String title;
    private String date;
    private String time;
    private JFrame display;
    private JLabel text;

    public JFrame getDisplay() {
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setTitle("Clock By Ozi");
        display.setLayout(new FlowLayout());
        display.setResizable(true);
        display.setVisible(true);
        display.setSize(50, 20);
        return display;
    }
}
