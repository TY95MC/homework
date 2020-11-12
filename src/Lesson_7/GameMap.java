package Lesson_7;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int MODE_HVA = 0;//обозначаем режим игры человек версус бот и человек версус человек
    public static final int MODE_HVH = 1;

    GameMap(){
        setBackground(Color.BLACK);// задали цвет панели черный(задний план)



    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        System.out.println("mode = " + mode + "\n fieldSizeX" + fieldSizeX + "\n fieldSizeY" + fieldSizeY + "\n winLength" + winLength);

    }

}
