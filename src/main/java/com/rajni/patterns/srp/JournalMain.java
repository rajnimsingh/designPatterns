package com.rajni.patterns.srp;

public class JournalMain {
    public static void main(String[] args) throws Exception{
        Journal journal = new Journal();
        journal.addEntry("My name is Rajni");
        journal.addEntry("I am learning DS today.");

        System.out.println(journal);

        Persistence persistence = new Persistence();
        persistence.save(journal, "src/main/resources/journal.txt", true);

        final Journal loadedJournal = persistence.load("src/main/resources/journal.txt");
        System.out.println(loadedJournal);

        System.out.println(loadedJournal.equals(journal));
    }
}
