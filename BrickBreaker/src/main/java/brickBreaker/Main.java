package brickBreaker;

import javax.swing.*;
import java.awt.*;
import java.util.EventListener;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var game = new BrickBreaker();
            game.setVisible(true);
        });
    }
}