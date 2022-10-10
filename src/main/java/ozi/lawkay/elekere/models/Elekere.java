package ozi.lawkay.elekere.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
@Getter
@Setter
public class Elekere {
    private String title;
    private String date;
    private String time;
    private JFrame display;
}
