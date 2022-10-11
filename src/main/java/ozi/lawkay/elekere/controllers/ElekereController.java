package ozi.lawkay.elekere.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ozi.lawkay.elekere.services.ElekereService;

@RestController
@RequestMapping("elekere/")
public class ElekereController {
    @Autowired
    private ElekereService elekereService;
    @GetMapping("time")
    public ResponseEntity<?> displayTime(){
        try {
            return ResponseEntity.ok().body(elekereService.displayTimeOfTheDay());
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }@GetMapping("day")
    public ResponseEntity<?> displayDay() {
        try {
            return ResponseEntity.ok().body(elekereService.displayDayOfTheWeek());
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
    @GetMapping("month")
    public ResponseEntity<?> displayMonth(){
        try {
            return ResponseEntity.ok().body(elekereService.displayMonthOfTheYear());
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
    @GetMapping("date-time")
    public ResponseEntity<?> displayDateAndTime(){
        try {
            return ResponseEntity.ok().body(elekereService.displayDateAndTime());
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
    @GetMapping("date")
    public ResponseEntity<?> displayDateAlone(){
        try {
            return ResponseEntity.ok().body(elekereService.displayDateAlone());
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
