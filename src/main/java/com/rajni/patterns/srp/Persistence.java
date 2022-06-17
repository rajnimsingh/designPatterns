package com.rajni.patterns.srp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persistence {

    public void save(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)){
            if(overwrite || new File(fileName).exists()) {
                out.println(journal);
            }
        }
    }

    public Journal load(String fileName) throws IOException {
        Journal journal = new Journal();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            List<String> entries = new ArrayList<>();
            String entry;
            while ((entry = reader.readLine()) != null) {
                entries.add(entry);
            }
            journal.setEntries(entries);
        }
        return journal;
    }
}
