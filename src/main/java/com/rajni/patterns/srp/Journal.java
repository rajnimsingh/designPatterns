package com.rajni.patterns.srp;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
public class Journal {
    private List<String> entries;
    private static int count;

    public Journal() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String text) {
        this.entries.add(" " + ++count + " : " + text);
    }

    public void removeEntry(int index) {
        this.entries.remove(index);
    }

    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
