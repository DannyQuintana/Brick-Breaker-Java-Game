package brickBreaker;

import javax.swing.*;

public class Ball extends Sprite {
    private int xdir;
    private int ydir;

    public Ball(){
        initBall();
    }

    private void initBall() {
        xdir = 1;
        ydir = -1;

        loadImage();
        getImageDimensions();
        resetState();
    }

    private void loadImage() {
        var ii = new ImageIcon("src/main/resources/images/ball.png");
        image = ii.getImage();
    }

    private void resetState() {
        x = Commons.INIT_BALL_X;
        y = Commons.INIT_BALL_Y;
    }

    void move(){
        x += xdir;
        y += ydir;

        if(x == 0){
            setXdir(1);
        }

        if(x == Commons.WIDTH - imageWidth){
            setXdir(-1);
        }
        if(y == 0){
            setYdir(1);
        }
    }

    public void setXdir(int xdir) {
        this.xdir = xdir;
    }

    public void setYdir(int ydir) {
        this.ydir = ydir;
    }

    public int getXdir() {
        return xdir;
    }

    public int getYdir() {
        return ydir;
    }
}
