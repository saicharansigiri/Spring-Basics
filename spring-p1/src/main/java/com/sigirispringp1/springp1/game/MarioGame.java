package com.sigirispringp1.springp1.game;
import org.springframework.stereotype.Controller;

@Controller
public class MarioGame implements GameConsole {


    @Override
    public void up(){ System.out.println("UP");}
    @Override
    public void down(){
        System.out.println("down");
    }
    @Override
    public void left(){
        System.out.println("left");
    }
    @Override
    public void right(){
        System.out.println("right");
    }

}
