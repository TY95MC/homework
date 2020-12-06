package jc2_lesson1;

import javax.swing.*;
import java.awt.*;

public class MainCircles extends JFrame {

    private static final int POS_X = 400; //начальные координаты верхнего левого угла
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;//ширина и длина окна
    private static final int WINDOW_HEIGHT = 600;

    Sprite[] sprites = new Sprite[10]; //количество шариков

    private final Background background;
    private final GameCanvas canvas;

    public static void main(String[] args) {
        new MainCircles();
    }

    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //закрытие окна на крестик
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT); //задание границ
        setTitle("Circles"); //задали название игры
        canvas = new GameCanvas(this); //создали холст
        background = new Background();
        initApplication(); //запуск приложения
        add(canvas); //добавили холст
        setVisible(true); //сделали видимым
    }

    private void initApplication() { //создаем шарики
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }
    }

    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {
        canvas.setBackground(background.getBackground());
        update(canvas, deltaTime); // обновление позиций шаров на холсте
        render(canvas, g); //перерисовка

    }

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) { //обновление текущего положения шароиков
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) { //отрисовка с учетом нового положения шариков
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }
 }
