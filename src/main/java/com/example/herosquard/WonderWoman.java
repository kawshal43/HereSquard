package com.example.herosquard;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WonderWoman implements Hero {
    @Override
    public void action() {
        System.out.println("Wonder Woman is defending the innocent!");
    }
}
