package brickBreaker;

import javax.swing.*;
import javax.swing.plaf.SplitPaneUI;
import java.awt.*;

public class BrickBreaker extends JFrame {

    public BrickBreaker(){
        initUI();
    }

    public void initUI(){
        add(new Board());
        setTitle("Brick Breaker!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

}
