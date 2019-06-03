package com.skilldistillery.projects.blackjack.src.commoncards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Program.Rank;
import Program.Suit;

public class Deck {
	private List<Card> cards;

	public Deck() {
		createDeck();
	}
	public void createDeck() {
		cards = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards.add(new Card(r, s));
			}
		}

	}
	public Deck(List<Card> cards) {
		super();
		this.cards = cards;
	}
	public int checkDeckSize() {
		return cards.size();
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card dealCard() {
		return cards.remove(0);
	}
	public List<Card> getCards() {
		return cards;
	}
	@Override
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}

}
