package com.rivaldy.villagestory.story;

public class MainApp {

    public static void main(String[] args) {
        Village village = new Village();

        Person personA = new Person(10,12);
        village.addPerson(personA);

        Person personB = new Person(13, 17);
        village.addPerson(personB);

        Person personC = new Person(15, 20);
        village.addPerson(personC);

        Answer answer = new Answer();
        answer.logAnswer(village);
    }
}
