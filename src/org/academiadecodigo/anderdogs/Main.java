package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(0, 0, 2500, 2500);
//        rect.setColor(Color.BLACK);
//        rect.fill();


        Map map = new Map();
        Char character = new Char();



        Control control = new Control();
        control.init();
        control.setChar(character);
        control.setMap(map);
    }
}
