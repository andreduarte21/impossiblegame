package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class jigsawRun implements Runnable{

    private String[] jigsawFirst = new String[]{
            "resources/jigsaw/frame_06.png",
            "resources/jigsaw/frame_05.png",
            "resources/jigsaw/frame_04.png",
            "resources/jigsaw/frame_03.png",
            "resources/jigsaw/frame_02.png",
            "resources/jigsaw/frame_01.png",
            "resources/jigsaw/frame_00.png",
            "resources/jigsaw/frame_07.png",
            "resources/jigsaw/frame_08.png",
            "resources/jigsaw/frame_09.png",
            "resources/jigsaw/frame_10.png",
            "resources/jigsaw/frame_11.png",
            "resources/jigsaw/frame_12.png",
            "resources/jigsaw/frame_13.png",
            "resources/jigsaw/frame_14.png",
    };

    private int x = 0;
    private boolean stop = false;
    private Picture jigsaw = new Picture(850, 220, "resources/jigsaw/frame_06.png");

    public void run() {
        jigsaw.draw();
        try {
            while (!stop) {
                if (x < 15) {
                    try {
                        Thread.sleep(170);
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                    jigsaw.load(jigsawFirst[x]);
                    x++;
                } else {
                    x = 8;
                }
            }
        } catch (Exception e) {
        }

    }
}