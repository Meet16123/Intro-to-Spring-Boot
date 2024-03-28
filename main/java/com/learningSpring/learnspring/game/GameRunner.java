package com.learningSpring.learnspring.game;

public class GameRunner {
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;	
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.right();
		game.down();
		game.up();
		game.left();
		
	}
}
