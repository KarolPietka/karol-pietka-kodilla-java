package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify (String text, PoemDecorator poemDecorator) {
        String newText = poemDecorator.decorate(text);
        return newText;
    }
}
