package org.academiadecodigo.anderdogs;

/*
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Sound {

    private static Clip clip;
    private URL soundURL;

    public Sound(String path) {
        initClip(path);
    }
    /**
     * Plays the clip from the point it was stopped or from start if passed with the fromStart argument false or true
     *
     * @param fromStart should be true if want to replay the sound from the start or false otherwise

    public static void play(boolean fromStart) {
        if (fromStart) {
            clip.setFramePosition(0);
        }
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    public void close() {
        clip.close();
    }

    public int getLength() {
        return clip.getFrameLength();
    }

    public void loopIndef() {
        //sets loop points at start and end of track
        clip.setLoopPoints(0, (int) (getLength() * 0.94));
        //activates loop
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void reOpen() {
        AudioInputStream inputStream = null;
        try {
            inputStream = AudioSystem.getAudioInputStream(soundURL);
            clip.open(inputStream);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void initClip(String path) {
        soundURL = Sound.class.getResource(path); //if loading from jar
        AudioInputStream inputStream = null;
        try {
            if (soundURL == null) {
                path = path.substring(1);
                File file = new File(path);
                soundURL = file.toURI().toURL(); //if executing on intellij
            }
            inputStream = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(inputStream);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
    private Clip clip;
    private URL soundURL;

    public Sound(String var1) {
        this.initClip(var1);
    }

    public void play(boolean var1) {
        if (var1) {
            this.clip.setFramePosition(0);
        }

        this.clip.start();
    }

    public void stop() {
        this.clip.stop();
    }

    public void close() {
        this.clip.close();
    }

    public int getLength() {
        return this.clip.getFrameLength();
    }

    public void loopIndef() {
        this.clip.setLoopPoints(0, (int)((double)this.getLength() * 0.94D));
        this.clip.loop(-1);
    }

    public void reOpen() {
        try {
            AudioInputStream var1 = AudioSystem.getAudioInputStream(this.soundURL);
            this.clip.open(var1);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException var3) {
            System.out.println(var3.getMessage());
        }

    }

    private void initClip(String var1) {
        this.soundURL = Sound.class.getResource(var1);

        try {
            if (this.soundURL == null) {
                var1 = var1.substring(1);
                File var3 = new File(var1);
                this.soundURL = var3.toURI().toURL();
            }

            AudioInputStream var2 = AudioSystem.getAudioInputStream(this.soundURL);
            this.clip = AudioSystem.getClip();
            this.clip.open(var2);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException var4) {
            System.out.println(var4.getMessage());
        }

    }
}
