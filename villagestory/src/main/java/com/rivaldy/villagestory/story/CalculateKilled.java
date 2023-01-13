package com.rivaldy.villagestory.story;

import java.text.DecimalFormat;

public class CalculateKilled {

    public int getPeopleKilled(int age) {
        if(age < 0){
            return -1;
        }
        if(age == 0){
            return 0;
        }
        if(age == 1){
            return 1;
        }
        return getPeopleKilled(age - 1) +
                getPeopleKilled(age - 2) + 1;
    }

    public double getAverageDeath(Village village){
        DecimalFormat df = new DecimalFormat("#.##");
        double totalDeath = (double) village.getVillagers().stream()
                .mapToInt(n -> n.getNumberOfDeaths())
                .sum() / village.getVillagers().size();
        return Double.valueOf(df.format(totalDeath));
    }

    public int setNumberOfDeaths(Person person){
        return getPeopleKilled(person.getYearOfDeath() - person.getAgeOfDeath());
    }
}
