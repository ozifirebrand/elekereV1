package ozi.lawkay.elekere.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.Clock;

@Component
@Getter
@Setter
public class Elekere {
    private Clock clock;
}
