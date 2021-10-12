package com.technicalTest.cardgame;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Getter
@NoArgsConstructor
public class Hand {
    private List<Card> cardList = new ArrayList<>();

    public void addCard(Card card) {
        cardList.add(card);
    }

    // random constructor
    public Hand(Integer size) {
        for (int i = 0; i < size; i++) {
            this.addCard(new Card(ThreadLocalRandom.current().nextInt(1, 14),
                    ThreadLocalRandom.current().nextInt(1, 5)));
        }
    }

    public void showHand() {
        for (Card card : cardList) {
            System.out.print(card.getName() + "  ");
        }
        System.out.println();
    }

    public void sortWithValue (List<Integer> valueOrder) {
        this.cardList.sort(Comparator.comparingInt(card -> valueOrder.indexOf(card.getValue())));
    }

    public void sortWithType (List<Integer> typeOrder) {
        this.cardList.sort(Comparator.comparingInt(card -> typeOrder.indexOf(card.getType())));
    }
}
