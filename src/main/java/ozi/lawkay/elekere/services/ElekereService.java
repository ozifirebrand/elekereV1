package ozi.lawkay.elekere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ozi.lawkay.elekere.models.Elekere;

import javax.swing.*;

@Service
public class ElekereService {
    @Autowired
    private JFrame jFrame;
    @Autowired
    private Elekere elekere;

    public void getTime(){

    }
}
