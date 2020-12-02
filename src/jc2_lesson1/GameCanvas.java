package jc2_lesson1;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    long lastFrameTime;
    MainCircles controller;

    GameCanvas(MainCircles controller) {
        lastFrameTime = System.nanoTime();
        this.controller = controller;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime(); //создание таймера
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        controller.onDrawFrame(this, g, deltaTime); //отрисовка в данный момент времени
        try {
            Thread.sleep(17); // ~60 fps
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }



    public int getLeft() { return 0; } //границы холста
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
