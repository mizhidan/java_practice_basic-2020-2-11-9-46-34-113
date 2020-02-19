package com.thoughtworks;

public class Card {
    private String[] pattern = {"红桃","黑桃","梅花","方片"};
    private String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public String[] getPattern() {
        return pattern;
    }

    public String[] getNumber() {
        return number;
    }
}
