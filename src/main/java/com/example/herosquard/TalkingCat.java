package com.example.herosquard;

import org.springframework.stereotype.Component;

@Component
public class TalkingCat implements Hero{
    @Override
    public void action() {
        System.out.println("Meow! I'm the Talking Cat, saving the world with cuteness!");
    }
}
