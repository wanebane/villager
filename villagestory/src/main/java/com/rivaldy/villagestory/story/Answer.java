package com.rivaldy.villagestory.story;

import java.util.stream.Collectors;

public class Answer {

    private CalculateKilled calc = new CalculateKilled();

    public void logAnswer(Village village){
        System.out.println("\nAnswer:");
        logAnswerPerson(village);
        logAverage(village);
    }

    private String strSumOfDeaths(Village village){
        return village.getVillagers().stream()
                .map(person -> Integer.toString(person.getNumberOfDeaths()))
                .collect(Collectors.joining(" + "));
    }

    private void logAnswerPerson(Village village){
        final String message = "Person who born on Year = %s - %s = %s, number of people killed on year %s is %s.";
        village.getVillagers().stream()
                .forEach(person -> {
                    int diff = person.getYearOfDeath() - person.getAgeOfDeath();
                    System.out.println(String.format(message, person.getYearOfDeath(), person.getAgeOfDeath(),
                            diff, diff, person.getNumberOfDeaths()));
                });
    }

    private void logAverage(Village village){
        final String message = "So the average is ( %s )/%s = %s";
        System.out.println(String.format(message, strSumOfDeaths(village),
                village.getVillagers().size(), calc.getAverageDeath(village)));
    }

}
