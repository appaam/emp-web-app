package com.sapient.aem.model;
public class Game {
	private Player player;
	public Game(Player player) {
		this.player = player;
	}
	public String attack() {
		return "Player attack with: " + player.getWeapon();
	}
}