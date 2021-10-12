package com.technicalTest.cardgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CardTests {

    Card card;

    @BeforeEach
    void initialiseCard() {
        card = new Card(11, 3);
    }

    @Test
    @DisplayName("set value out of range throw exception")
    void testSetIllegalValueThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> card.setValue(14));
    }

    @Test
    @DisplayName("set type out of range throw exception")
    void testSetIllegalTypeThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> card.setType(0));
    }

    @Test
    @DisplayName("initialise card with illegal value and type throw exception")
    void testCreateCardWithIllegalTypeAndValueThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> new Card(0, 5));
    }

    @Test
    @DisplayName("test getName")
    void testGetName() {
        assertEquals("J♣", card.getName());
    }
}
