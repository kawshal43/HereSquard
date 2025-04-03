package com.example.herosquard;

import org.springframework.stereotype.Component;

public class Superman implements Hero {
    private  String powerLevel;
    private int experience;

    public Superman(String powerLevel, int experience) {
        this.powerLevel = powerLevel;
        this.experience = experience;
    }


    //GETTER AND SETTER
    public String getPowerLevel() {
        return powerLevel;
    }
    public int getExperience() {
        return experience;
    }
    public void setPowerLevel(String powerLevel) {
        this.powerLevel=powerLevel;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }



    @Override
    public void action() {
        System.out.println("Superman with power level "+powerLevel+" and "+experience+" years of experience is flying!");
    }
}
