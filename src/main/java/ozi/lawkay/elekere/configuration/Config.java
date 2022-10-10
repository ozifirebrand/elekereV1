package ozi.lawkay.elekere.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.time.Clock;

@Configuration
public class Config {

    @Bean
    public JFrame jFrame (){
        return new JFrame();
    }
}
