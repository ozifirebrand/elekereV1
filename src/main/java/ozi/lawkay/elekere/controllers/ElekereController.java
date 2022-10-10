package ozi.lawkay.elekere.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ozi.lawkay.elekere.services.ElekereService;

@RestController
public class ElekereController {
    @Autowired
    private ElekereService elekereService;
    @GetMapping
    public ResponseEntity<?> displayTime(){
        try {
            return ResponseEntity.ok().body(elekereService.displayTimeOfTheDay());
        }catch (InterruptedException exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
