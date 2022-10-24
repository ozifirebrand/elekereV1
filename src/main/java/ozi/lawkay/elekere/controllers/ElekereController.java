package ozi.lawkay.elekere.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import ozi.lawkay.elekere.services.ElekereService;

@Controller
@RequestMapping("elekere/")
public class ElekereController {
    @Autowired
    private ElekereService elekereService;
    @GetMapping("/time")
    public String displayTime(Model model) throws InterruptedException {
        String time = elekereService.displayTimeOfTheDay();
        model.addAttribute("time", time);
        return "elekere";
    }
    @GetMapping("day")
    public String displayDay(Model model) throws InterruptedException {
        String day = elekereService.displayDayOfTheWeek();
        String time = elekereService.displayTimeOfTheDay();
        model.addAttribute("day", day);
        model.addAttribute("time", time);
        return "elekere";
    }
    @GetMapping("month")
    public String displayMonth(){
        try {
            return elekereService.displayMonthOfTheYear();
        }catch (Exception exception){
            return exception.getMessage();
        }
    }
    @GetMapping("date-time")
    public String displayDateAndTime(){
        try {
            return elekereService.displayDateAndTime();
        }catch (Exception exception){
            return exception.getMessage();
        }
    }
    @GetMapping("date")
    public String displayDateAlone(){
        try {
            return elekereService.displayDateAlone();
        }catch (Exception exception){
            return exception.getMessage();
        }
    }
}
