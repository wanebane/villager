package com.rivaldy.villagestory.story;

import java.util.ArrayList;
import java.util.List;

public class Village {

    private List<Person> villagers = new ArrayList<>();

    public List<Person> getVillagers(){
        return villagers;
    }

    public void addPerson(Person person){
        person.setNumberOfDeaths(setNumberOfDeath(person));
        villagers.add(person);
    }

    public int setNumberOfDeath(Person person){
        return new CalculateKilled().setNumberOfDeaths(person);
    }
}
