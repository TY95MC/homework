package Lesson_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 650;
    private static final int WINDOW_POSY = 270;

    private Settings settingsWindow;//объявление класса настроек
    private GameMap gameMap;

    MainWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //задали функцию закрытия окна игры
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //задали параметры окна
        setLocation(WINDOW_POSX, WINDOW_POSY); //задали стартовое положение окна
        setTitle("Игра: Крестики-нолики.");

        settingsWindow = new Settings(this); // создание окна настроек
        gameMap = new GameMap();

        JButton btnStart = new JButton("Create new game."); //создали кнопку старта с надписью
        btnStart.addActionListener(new ActionListener() {   //реакция кода на действия с кнопкой, старт игры
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true); //при нажатии кнопки старт отображается окно настроек
            }
        });

        JButton btnClose = new JButton("Close."); // создали кнопку выхода из розыгрыша партии

        btnClose.addActionListener(new ActionListener() { // реакция кода на действия с кнопкой, выход из партии
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);//выход иг программы
            }
        });

        JPanel panelBottom = new JPanel(); // панель для кнопок
        panelBottom.setLayout(new GridLayout(1, 2)); //задали фрейм для кнопок гридлейаут в панели(1 ряд, 2 столбца)
        panelBottom.add(btnStart); //установка кнопок в панель
        panelBottom.add(btnClose);

        add(panelBottom, BorderLayout.SOUTH); //добавили панель в окно игры в нижнюю часть фрейма


        add(btnStart);//добавили кнопки
        add(btnClose);

        setResizable(false);
        setVisible(true); //сделали окно активным(видимым) для пользователя
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        gameMap.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }
}
