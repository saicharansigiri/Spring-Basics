package com.sigirispringp1.springp1.game;
import org.springframework.stereotype.Controller;

@Controller
public class TestGame implements GameConsole {


    @Override
    public void up(){ System.out.println("T UP");}
    @Override
    public void down(){
        System.out.println("T down");
    }
    @Override
    public void left(){
        System.out.println("T left");
    }
    @Override
    public void right(){
        System.out.println("T right");
    }

}
