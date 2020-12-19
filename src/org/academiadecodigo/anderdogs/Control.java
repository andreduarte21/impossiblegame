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


    private Keyboard keyboard;


    private final Picture start = new Picture(10,10, "resources/startsprites/frame_00.png");
    private final Picture blackScreen = new Picture(10,10, "resources/others/blackScreen.jpg");
    private final Picture anderdogs = new Picture(10,10, "resources/others/anderdog.png");
    private final Picture startButton = new Picture(630, 530, "resources/others/Pressanybutton.png");
    private static Picture gameName = new Picture(505, 280, "resources/others/impossible.png");
    private final Picture escaped = new Picture(10,10, "resources/youEscaped/you00.png");
    private static Picture gameEnding = new Picture(10,10, "resources/gameOver/gameover.png");

    Positions pos;
    private int triesCounter = 0;
    private static final Sound sound = new Sound("/resources/sound/Welcome2.wav");
    private static final Sound sound2 = new Sound("/resources/sound/background.wav");
    private static final Sound sound3 = new Sound("/resources/sound/Tension.wav");
    private final Sound sound4 = new Sound("/resources/sound/yay.wav");
    private static final Sound sound5 = new Sound("/resources/sound/boo.wav");


    private static Char charac;
    private static Map map;
    private final JigsawRun testing = new JigsawRun();
    private final TextRun text = new TextRun();
    private String source;
    private boolean changeStart;


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
        return escapePosition[random];

    }
    public static void loadGame(){
        map.draw();
        charac.draw();
        sound.stop();
        sound2.play(true);
        sound2.loopIndef();
        StartTimer.startTimer();
    }

    public static void drawGameOver(){
        Picture screen = new Picture(10,10, "resources/others/blackScreen.jpg");
        screen.draw();
        gameEnding.draw();
        sound2.stop();
        sound5.play(true);
        sound5.loopIndef();
    }



    public void init() {

        sound3.play(true);
        sound3.loopIndef();
        anderdogs.draw();
        try{
            Thread.sleep(3500);
        }
        catch (Exception e){}

        start.draw();
        gameName.draw();

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
                if (charac.getLeft() == pos.left() && charac.getRight() == pos.right() && charac.getTop() == pos.top() && charac.getBottom() == pos.bottom) {
                    escaped.draw();
                    sound2.stop();
                    StartTimer.stop();
                    sound4.play(true);
                    sound4.loopIndef();


                }
                if(triesCounter == 5 && (!(charac.getLeft() == pos.left() && charac.getRight() == pos.right() && charac.getTop() == pos.top() && charac.getBottom() == pos.bottom))){
                    drawGameOver();
                }

            }else{
                drawGameOver();
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

                    if(displayMinutes == 2){
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
