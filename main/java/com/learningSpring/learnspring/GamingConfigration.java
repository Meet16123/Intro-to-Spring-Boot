package com.learningSpring.learnspring;

import com.learningSpring.learnspring.game.GameConsole;
import com.learningSpring.learnspring.game.GameRunner;
import com.learningSpring.learnspring.game.PackManGame;
import com.learningSpring.learnspring.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfigration {

    //PackMan Bean
    @Bean
    public GameConsole game() {
        var packman = new PackManGame();
        return packman;
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

//    //		var game = new MarioGame();
//    var game = new PackManGame();
//    //		var game = new SuperContraGame();
//    var gameRunner = new GameRunner(game);
//        gameRunner.run();

}
