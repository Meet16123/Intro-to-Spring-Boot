package com.learningSpring.learnspring;

import com.learningSpring.learnspring.game.GameRunner;
import com.learningSpring.learnspring.game.PackManGame;

public class App01GamingBasic {

	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new PackManGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
