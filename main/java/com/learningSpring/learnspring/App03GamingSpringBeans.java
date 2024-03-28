package com.learningSpring.learnspring;

import com.learningSpring.learnspring.game.GameConsole;
import com.learningSpring.learnspring.game.GameRunner;
import com.learningSpring.learnspring.game.PackManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfigration.class)) {
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

////		var game = new MarioGame();
//		var game = new PackManGame();
////		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	}

}
