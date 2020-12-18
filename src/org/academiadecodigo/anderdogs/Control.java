package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.concurrent.TimeUnit;

public class Control implements KeyboardHandler {

    private final Positions [] escapePosition = {new Positions(663,715,718,760), new Positions(1001,1053,640,682),
            new Positions(637,689,562,604), new Positions(247,299,718,760), new Positions(117,169,432,474),
            new Positions(481,533,68,110), new Positions(611,663,380,422), new Positions(325,377,380,422),
            new Positions(793,845,276,318), new Positions(1053,1105,68,110), new Positions(1339,1391,198,240),
            new Positions(1313,1365,224,266), new Positions(1339,1391,450,500), new Positions(1313,1365,718,760),
            new Positions(1001,1053,250,292)};

    private final String[] dungeonArr = new String[] {"resources/startsprites/frame_00.png", "resources/startsprites/frame_01.png", "resources/startsprites/frame_02.png", "resources/startsprites/frame_03.png",
            "resources/startsprites/frame_04.png", "resources/startsprites/frame_05.png", "resources/startsprites/frame_06.png", "resources/startsprites/frame_07.png", "resources/startsprites/frame_08.png",
            "resources/startsprites/frame_09.png", "resources/startsprites/frame_10.png", "resources/startsprites/frame_11.png", "resources/startsprites/frame_12.png", "resources/startsprites/frame_13.png",
            "resources/startsprites/frame_14.png", "resources/startsprites/frame_15.png"};

//    private final String[] escapedArr = new String[]{"resources/youEscaped/you00.png","resources/youEscaped/you01.png","resources/youEscaped/you02.png","resources/youEscaped/you03.png",
//            "resources/youEscaped/you04.png","resources/youEscaped/you05.png","resources/youEscaped/you06.png","resources/youEscaped/you07.png","resources/youEscaped/you08.png",
//            "resources/youEscaped/you09.png", "resources/youEscaped/you10.png","resources/youEscaped/you11.png","resources/youEscaped/you12.png","resources/youEscaped/you13.png",
//            "resources/youEscaped/you14.png","resources/youEscaped/you15.png","resources/youEscaped/you16.png","resources/youEscaped/you17.png","resources/youEscaped/you18.png",
//            "resources/youEscaped/you19.png","resources/youEscaped/you20.png","resources/youEscaped/you21.png","resources/youEscaped/you22.png","resources/youEscaped/you23.png",
//            "resources/youEscaped/you24.png","resources/youEscaped/you25.png","resources/youEscaped/you26.png","resources/youEscaped/you27.png","resources/youEscaped/you28.png",
//            "resources/youEscaped/you29.png","resources/youEscaped/you30.png","resources/youEscaped/you31.png"};

    private Keyboard keyboard;


    private final Picture textBox = new Picture(550,270, "resources/Untitled.png");
    private final Picture start = new Picture(10,10, "resources/startsprites/frame_00.png");
    private final Picture blackScreen = new Picture(10,10, "resources/blackScreen.jpg");
    private final Picture anderdogs = new Picture(10,10, "resources/anderdog.png");
    private final Picture startButton = new Picture(630, 530, "resources/Pressanybutton.png");
    private final Picture escaped = new Picture(10,10, "resources/youEscaped/you00.png");
    private static Picture gameEnding = new Picture(10,10, "resources/gameOver/gameOver.png");

    Positions pos;
    private int triesCounter = 0;
    private static final Sound sound = new Sound("/resources/Welcome2.wav");
    private static final Sound sound2 = new Sound("/resources/background.wav");
    private static final Sound sound3 = new Sound("/resources/Tension.wav");




    private static Char charac;
    private static Map map;
    private final jigsawRun testing = new jigsawRun();
    private final TextRun text = new TextRun();
    private String source;
    private boolean changeStart;
    private boolean winAnim;

//    public void winAnim(){
//        int x = 0;
//
//        while(x<=31) {
//            if (x < 31) {
//                try {
//                    Thread.sleep(15);
//                } catch (InterruptedException e) {
//                    System.err.format("IOException: %s%n", e);
//                }
//                escaped.load(escapedArr[x]);
//                x++;
//            } else {
//                x = 0;
//            }
//        }
//    }



    public void changeStart() {
        int x = 0;
        while(!changeStart) {
            if (x <= 15) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
                start.load(dungeonArr[x]);
                x++;
            } else {
                changeStart = true;
                startButton.draw();
            }
        }

    }




    public Positions positionRandomizer(){
        int random = (int) Math.floor(Math.random()*escapePosition.length);
        return escapePosition[/*random*/0];

    }
    public static void loadGame(){
        map.draw();
        charac.draw();
        sound.stop();
        sound2.play(true);
        StartTimer.startTimer();



    }

    public static void drawGameOver(){
        Picture screen = new Picture(10,10, "resources/blackScreen.jpg");
        screen.draw();
        gameEnding.draw();
    }



    public void init() {
      //        new TimerClock();
        sound3.play(true);
        sound3.loopIndef();
        anderdogs.draw();
        try{
            Thread.sleep(3500);
        }
        catch (Exception e){}

        start.draw();

        changeStart();


        source = start.getSource();
        pos = positionRandomizer();


        keyboard = new Keyboard(this);


        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);


        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);


        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);


        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);


        KeyboardEvent k = new KeyboardEvent();
        k.setKey(KeyboardEvent.KEY_K);
        k.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(k);

        KeyboardEvent y = new KeyboardEvent();
        y.setKey(KeyboardEvent.KEY_X);
        y.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(y);

    }

    public void setChar(Char charac) {
        this.charac = charac;
    }

    public void setMap(Map map) {
        this.map = map;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == 38) {
            charac.load(charac.getUpArr()[1]);
            charac.moveUp();
            charac.changePictureUP();

        } else if (keyboardEvent.getKey() == 39) {
            charac.load(charac.getRightArr()[1]);
            charac.moveRight();
            charac.changePictureRight();

        } else if (keyboardEvent.getKey() == 40) {
            charac.load(charac.getDownArr()[1]);
            charac.moveDown();
            charac.changePictureDown();

        } else if (keyboardEvent.getKey() == 37) {
            charac.load(charac.getLeftArr()[1]);
            charac.moveLeft();
            charac.changePictureLeft();

        } else if (keyboardEvent.getKey() == 75/*K*/) {

            System.out.println("left: " + pos.left + " right: " + pos.right + " top: " + pos.top + " bottom: " +pos.bottom);
            charac.getPosition();


        } else if (keyboardEvent.getKey() == 32 && source.equals((start.getSource()))/*Space*/) {
            changeStart = true;
            blackScreen.draw();
            source = blackScreen.getSource();
            new Thread(testing, "thread1").start();
            new Thread(text, "thread2").start();
            sound3.stop();
            this.sound.play(true);



        } else if(keyboardEvent.getKey() == 88 /*X*/){
            if (triesCounter <= 5) {
                triesCounter++;
                System.out.println(triesCounter);
                if (charac.getLeft() == pos.left() && charac.getRight() == pos.right() && charac.getTop() == pos.top() && charac.getBottom() == pos.bottom) {
                    escaped.draw();
                    sound2.stop();
                    StartTimer.stop();
//                    winAnim();


                }
                if(triesCounter == 5 && (!(charac.getLeft() == pos.left() && charac.getRight() == pos.right() && charac.getTop() == pos.top() && charac.getBottom() == pos.bottom))){
                    gameEnding.draw();
                }

            }else{
                gameEnding.draw();
            }

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private class Positions{
        private int left;
        private int right;
        private int top;
        private int bottom;

        public Positions(int left, int right, int top, int bottom){
            this.left = left;
            this.right = right;
            this.top = top;
            this.bottom = bottom;
        }

        public int left(){
            return left;
        }
        public int right(){
            return right;
        }
        public int top(){
            return top;
        }
        public int bottom(){
            return bottom;
        }

    }



    private static class StartTimer {
        public static boolean x=true;

        public static boolean startTimer() {

            long displayMinutes=0;
            long starttime=System.currentTimeMillis();
            System.out.println("Timer:");
            try {

                while (x) {
                    TimeUnit.SECONDS.sleep(1);
                    long timepassed = System.currentTimeMillis() - starttime;
                    long secondspassed = timepassed / 1000;
                    if (secondspassed == 60) {
                        secondspassed = 0;
                        starttime = System.currentTimeMillis();
                    }
                    if ((secondspassed % 60) == 0)
                        displayMinutes++;

                    System.out.println(displayMinutes + ":" + secondspassed);
                    if(displayMinutes == 1){
                        x=false;
                        Control.drawGameOver();
                    }
                }
            }
            catch (InterruptedException e){}
            return x;
        }

        public static void stop(){
            x = false;
        }


    }
}
