package jc2_lesson1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Background {
//   public Background(){
//        getBackground();
//    }
    private static final Random RANDOM = new Random();
   public Color getBackground() {
        return new Color(RANDOM.nextInt(256), RANDOM.nextInt(256), RANDOM.nextInt(256));
    }
}

