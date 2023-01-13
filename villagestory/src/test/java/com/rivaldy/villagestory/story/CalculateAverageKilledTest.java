package com.rivaldy.villagestory.story;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAverageKilledTest {

    private static Village village;
    private static Person person;
    private static CalculateKilled calc;

    @BeforeEach
    void setUp(){
        village = new Village();

        person = new Person(10, 12);
        village.addPerson(person);

        person = new Person(13, 17);
        village.addPerson(person);

        calc = new CalculateKilled();
    }

    @Test
    @DisplayName("Get Average Death using Input from Scenario Test")
    void getAverageDeathUsingScenarioInputTest(){
        assertEquals(4.5, calc.getAverageDeath(village));
    }

    @Test
    @DisplayName("Get Average Death when Add Person to Village Existing")
    void getAverageDeathWhenAddPersonAge14AndYear21(){
        person = new Person(15, 20);
        village.addPerson(person);
        assertEquals(7.0, calc.getAverageDeath(village));
        village.getVillagers().clear();
    }

    @Test
    @DisplayName("Get Average Death when Add Person When Age is more than Year to Village Existing")
    void getAverageDeathWhenAddPersonAgeIsMoreThanYear(){
        person = new Person(15, 13);
        village.addPerson(person);
        assertEquals(2.67, calc.getAverageDeath(village));
        village.getVillagers().clear();
    }
}
