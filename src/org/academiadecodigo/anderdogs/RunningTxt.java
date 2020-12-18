package org.academiadecodigo.anderdogs;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
//import java.util.concurrent.TimeUnit;

public class RunningTxt {
    private String passText;
    private double x;
    private double y;
    private Rectangle rectangle;
    private Text text;
    private final String[] individualString;

    public RunningTxt(String passText,double x, double y){
        this.passText = passText;
        this.individualString = passText.split("\\s");
        this.x = x;
        this.y = y;
        this.text= new Text(x, y, passText);
        int size = text.getWidth();
        int height = text.getHeight();
        this.rectangle = new Rectangle(x,y,size,height);
        rectangle.setColor(Color.BLACK);
        text.setColor(Color.WHITE);
        text.draw();
        rectangle.fill();
    }
    public void roll(){
        while (!this.isFinished()) {
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            rectangle.translate(0.5, 0);
            rectangle.grow(-0.5,0);
        }
    }
    public boolean isFinished(){
        return rectangle.getX()>( text.getWidth() + text.getX());
    }
}