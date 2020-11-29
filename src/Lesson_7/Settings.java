package Lesson_7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {


    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 270;

    private static final int MIN_WIN_LENGTH = 3;// мин длина выигрыша
    private static final int MIN_FIELD_SIZE = 3;//мин длина поля
    private static final int MAX_FIELD_SIZE = 10;//макс длина поля
    private static final String FIELD_SIZE_PREFIX = "Field size is: ";
    private static final String WIN_LENGTH_PREFIX = "Win length is: ";

    private MainWindow mainWindow;

    private JRadioButton humVSAI; //кнопка выбора режима
    private JRadioButton humVSHum;//кнопка выбора режима
    private JSlider slideWinLen;
    private JSlider slideFieldSize;

    Settings(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = mainWindow.getBounds(); //
        int posX = (int)/*инт в скобках делает числа целыми*/ gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;  // вычисляем расположение окна настроек относительно текущего положения основного окна и по центру
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Creating new game.");
        setLayout(new GridLayout(10, 1)); //установка компоновщика табличного расположения элементов окна

        addGameModeSetup();
        addFieldMapControl();

        JButton btnPlay = new JButton("Play new game!");
        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPlayGameClick();
            }
        });
        add(btnPlay);
        setVisible(false); //чтобы при старте программы окно не отображалось тоже


    }

    private void addGameModeSetup(){

        add(new JLabel("Choose game mode: ")); //Добавили надпись выбери вид игры
        humVSAI =  new JRadioButton("Human VS AI.", true); //создали кнопку и задали ее выбранной по умолчанию(тру)
        humVSHum =  new JRadioButton("Human VS Human."); //создали кнопку

        ButtonGroup gameMode = new ButtonGroup(); //создали группу, чтобы объединить кнопки humvsai и humvshum(иначе их можно обе сразу выбрать )
        gameMode.add(humVSAI); //добавили кнопки в эту группу
        gameMode.add(humVSHum);
        add(humVSAI); //добавили кнопки в окно
        add(humVSHum);
    }
    private void addFieldMapControl(){
      JLabel lbFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE); //выдает текст о длине поля
      JLabel lbWInLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH); //выдает текст о победной длине

      slideFieldSize = new JSlider(MAX_FIELD_SIZE/*начальная точка бегунка*/, MAX_FIELD_SIZE/*конечное положение бегунка*/, MIN_FIELD_SIZE/*текущее положение этого бегунка(в данном случае начинается с минимального значения*/);// создали "бегунок" ____"треугольник"___________ отвечает за размер поля
      slideFieldSize.addChangeListener(new ChangeListener() { // добавляем кнопке реакцию на действия пользователя
          @Override
          public void stateChanged(ChangeEvent e) {
            int currentValue = slideFieldSize.getValue(); //задали новую перменную равную текущему значению ползунка
            lbFieldSize.setText(FIELD_SIZE_PREFIX + currentValue); //задается текст с текущим значением ползунка
            slideWinLen.setMaximum(currentValue); //передаем ползунку победы максимальное значение равное текущему значени. этого ползунка
          }
      });

      slideWinLen = new JSlider(MIN_WIN_LENGTH/*минимальная длина победной серии*/, MIN_FIELD_SIZE/*максимальная длина победной серии ограничена текущим положением бегунка из кнопки выше*/, MIN_FIELD_SIZE/*текущее положение этого бегунка*/);//бегунок определяет выигрышную серию
      slideWinLen.addChangeListener(new ChangeListener() { //добавляем кнопке реакцию на действия пользователя
          @Override
          public void stateChanged(ChangeEvent e) {
              lbWInLength.setText(WIN_LENGTH_PREFIX + slideWinLen.getValue());//значение текущего положения ползунка); задали текст ползунка
          }
      });


      add(new JLabel("Choose field map size."));
      add(lbFieldSize);// добавили кнопки
      add(slideFieldSize);
      add(new JLabel("Choose field win length."));
      add(lbWInLength);
      add(slideWinLen);
    }

    private void btnPlayGameClick(){
        int gameMode;
        if(humVSAI.isSelected()){
        gameMode = GameMap.MODE_HVA;
        }else if(humVSHum.isSelected()){
gameMode = GameMap.MODE_HVH;
        }
        else{
         throw new RuntimeException("Unexpected game mode!");
        }

        int fieldSize = slideFieldSize.getValue();
        int winLength = slideWinLen.getValue();

        mainWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength);

    }
}
