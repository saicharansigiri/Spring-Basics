package com.sigirispringp1.springp1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GameRunner {

    @Qualifier("testGame")
    @Autowired
    private GameConsole gameConsole;

    public GameRunner(@Qualifier("testGame") GameConsole gameConsole){
        this.gameConsole = gameConsole;
    }

    public void run(){
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }
}
