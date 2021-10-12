package com.technicalTest.cardgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class CardGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardGameApplication.class, args);
		playGame();
	}

	public static void playGame() {
		// create random order with types
		List<Integer> typeOrder = new ArrayList<>(List.of(1, 2, 3, 4));
		Collections.shuffle(typeOrder);

		// create random order with Values
		List<Integer> valueOrder = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));
		Collections.shuffle(valueOrder);

		// create random hand
		Hand hand = new Hand(10);
		hand.showHand();

		// sort hand with type
		hand.sortWithType(typeOrder);		;
		System.out.println(typeOrder.stream().map(Card::typeName).collect(Collectors.toList()).toString());
		hand.showHand();

		// sort hand with order
		hand.sortWithValue(valueOrder);
		System.out.println(valueOrder.stream().map(Card::valueName).collect(Collectors.toList()).toString());
		hand.showHand();
	}

}
