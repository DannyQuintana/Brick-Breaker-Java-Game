package brickBreaker;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Paddle extends Sprite{
    private int dx;

    public Paddle(){
        initPaddle();
    }

    private void initPaddle() {
        loadImage();
        getImageDimensions();

        resetState();
    }

    private void resetState() {
        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }

    private void loadImage() {
        var ii = new ImageIcon("src/main/resources/images/paddle.png");
        image = ii.getImage();
    }

    void move(){
        x += dx;

        if(x <= 0){
            x = 0;
        }

        if(x >= Commons.WIDTH - imageWidth) {
            x = Commons.WIDTH - imageWidth;
        }
    }

    void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT){
            dx = -1;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx = 1;
        }
    }

    void keyRelease(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx = 0;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx = 0;
        }
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }
}
