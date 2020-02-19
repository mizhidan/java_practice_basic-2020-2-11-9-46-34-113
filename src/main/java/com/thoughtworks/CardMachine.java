package com.thoughtworks;

import java.util.HashSet;
import java.util.Random;

public class CardMachine {
    private Card cardSet;

    public CardMachine() {

    }

    public CardMachine(Card cardSet) {
        this.cardSet = cardSet;
    }


    public Card getCardSet() {
        return cardSet;
    }

    public void setCardSet(Card cardSet) {
        this.cardSet = cardSet;
    }

    public HashSet<String> drawCard(int numOfCard) {
        if(numOfCard <=0 || numOfCard > 52) {
            System.out.println("invalid range of card");
            return null;
        }
        HashSet<String> cardMap = new HashSet<>();
        Random r = new Random();
        while (numOfCard != cardMap.size()) {
            String[] pattern = cardSet.getPattern();
            String[] number = cardSet.getNumber();
            cardMap.add(pattern[r.nextInt(pattern.length)]
                    + number[r.nextInt(number.length)]);
        }
        return cardMap;
    }
}
