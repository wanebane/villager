package com.rivaldy.villagestory.story;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VillageTest {

    private static Village village;
    private static Person person;

    @BeforeEach
    void setUp(){
        village = new Village();
    }

    @Test
    @DisplayName("Get Number of Death if Person Age < Year")
    void getNumberOfDeathIfPersonAgeIsLessThanYear(){
        person = new Person(15, 20);
        assertEquals(12, village.setNumberOfDeath(person));
    }

    @Test
    @DisplayName("Get Number of Death if Person Age == Year")
    void getNumberOfDeathIfPersonAgeIsEqualYear(){
        person = new Person(15, 15);
        assertEquals(0, village.setNumberOfDeath(person));
    }

    @Test
    @DisplayName("Get Number of Death if Person Age > Year")
    void getNumberOfDeathIfPersonAgeIsMoreThanEqualYear(){
        person = new Person(22, 15);
        assertEquals(-1, village.setNumberOfDeath(person));
    }
}