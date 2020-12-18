package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class TextRun implements Runnable {




    public void run() {

        try {
            int initX = 50;
            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            String introLine1 = "Greetings... and welcome.";
            RunningTxt rtIntroLine1 = new RunningTxt(introLine1, initX, 200);
            rtIntroLine1.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine2 = "I trust that you are all wondering where you are.";
//            RunningTxt rtIntroLine2 = new RunningTxt(introLine2, initX, 225);
//            rtIntroLine2.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine3 = "I can assure you that while your location is not important, what these walls offer for your IS important...";
//            RunningTxt rtIntroLine3 = new RunningTxt(introLine3, initX, 240);
//            rtIntroLine3.roll();
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine4 = "Salvation, if you earn it. 3 hours from now the door to this house will open.";
//            RunningTxt rtIntroLine4 = new RunningTxt(introLine4, initX, 255);
//            rtIntroLine4.roll();
//            try {
//                Thread.sleep(600);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine5 = "Unfortunately, you only have 2 hours to live. Right now, you are breathing in a deadly nerve agent.";
//            RunningTxt rtIntroLine5 = new RunningTxt(introLine5, initX, 270);
//            rtIntroLine5.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine6 = "You've been breathing it since you've arrived here.";
//            RunningTxt rtIntroLine6 = new RunningTxt(introLine6, initX, 285);
//            rtIntroLine6.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine7 = "Those of you familiar with the Tokyo subway attacks will know its devastating effects on the human body.";
//            RunningTxt rtIntroLine7 = new RunningTxt(introLine7, initX, 300);
//            rtIntroLine7.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine8 = "The only way to overcome it is to walk out that door.";
//            RunningTxt rtIntroLine8 = new RunningTxt(introLine8, initX, 315);
//            rtIntroLine8.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine9 = "X MARKS THE SPOT, so look carefully.";
//            RunningTxt rtIntroLine9 = new RunningTxt(introLine9, initX, 330);
//            rtIntroLine9.roll();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//            String introLine10 = "Let the game begin.";
//            RunningTxt rtIntroLine10 = new RunningTxt(introLine10, initX, 345);
//            rtIntroLine10.roll();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.err.format("IOException: %s%n", e);
//            }
            Control.loadGame();

        } catch (Exception e) {}
    }

}
