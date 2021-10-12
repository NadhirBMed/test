package com.technicalTest.cardgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    Hand hand;

    @BeforeEach
    void initialiseHand() {
        System.setOut(new PrintStream(outContent));
        hand = new Hand();
        hand.addCard(new Card(2,3));
        hand.addCard(new Card(13, 1));
    }

    @Test
    @DisplayName("test showHand")
    void testShowHand() {
        hand.showHand();
        assertEquals("2♣  K♦  ", outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }
}
