package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.anderdogs.Sound;

public class Map {
    private Picture map;
    private Picture start;



    public Map() {
         map = new Picture(10, 10, "resources/finalmapa5.png");


    }

    public void draw(){
        map.draw();
    }

    public int getX() {
        return map.getX();
    }

    public int getY() {
        return map.getY();
    }

    public int getMaxY() {
        return map.getMaxY();
    }

    public int getMaxX() {
        return map.getMaxX();
    }
}
