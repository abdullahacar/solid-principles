package com.solidPrinciples.singleResponsibility;

public class BadBook {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    public String replaceWordInText(String word, String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    // This code violates the single responsibility principle.
    void printTextToConsole() {
    }

    // To fix the mess, we have created a BookPrinter
    public class BookPrinter {

        void printTextToConsole(String text) {
        }

    }

}


