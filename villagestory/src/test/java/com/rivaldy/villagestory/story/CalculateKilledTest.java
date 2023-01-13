package com.rivaldy.villagestory.story;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateKilledTest {

    private static CalculateKilled calculateKilled;

    @BeforeEach
    void setUp(){
        this.calculateKilled = new CalculateKilled();
    }

    @Test
    @DisplayName("Calculate of People Killed => born on year 4")
    void calcVillagerKilledWhenBornIs4(){
        assertEquals(7, calculateKilled.getPeopleKilled(4));
    }

    @Test
    @DisplayName("Calculate of People Killed => born on year 5")
    void calcVillagerKilledWhenBornIs5(){
        assertEquals(12, calculateKilled.getPeopleKilled(5));
    }

    @Test
    @DisplayName("Calculate of People Killed => people was born before the witch take control")
    void calcVillagerKilledWhenBornIsInvalidInt(){
        assertEquals(-1, calculateKilled.getPeopleKilled(-3));
    }

}