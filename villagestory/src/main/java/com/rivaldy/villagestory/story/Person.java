package com.rivaldy.villagestory.story;

public class Person {

    private int ageOfDeath;
    private int yearOfDeath;
    private int numberOfDeaths;

    public Person(int ageOfDeath, int yearOfDeath) {
        this.ageOfDeath = ageOfDeath;
        this.yearOfDeath = yearOfDeath;
    }

    public int getAgeOfDeath() {
        return ageOfDeath;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public int getNumberOfDeaths() {
        return numberOfDeaths;
    }

    public void setNumberOfDeaths(int numberOfDeaths) {
        this.numberOfDeaths = numberOfDeaths;
    }

    @Override
    public String toString() {
        return "Person : " +
                "Age of death = " + ageOfDeath +
                ", Year of Death = " + yearOfDeath;
    }
}
