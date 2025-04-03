package com.example.herosquard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HeroSquardApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("heroes.xml");


        Hero superman = (Hero) context.getBean(Superman.class);
        superman.action();

        Hero talkingCat = (Hero) context.getBean(TalkingCat.class);
        talkingCat.action();

        Hero wonderWoman1 = (Hero) context.getBean(WonderWoman.class);
        wonderWoman1.action();

        Hero wonderWoman2 = (Hero) context.getBean(WonderWoman.class);
        wonderWoman2.action();

        // Checking
        System.out.println("Are WonderWoman instances the same? " + (wonderWoman1 == wonderWoman2));
    }
}
