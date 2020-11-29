package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {

    private static final char HUMAN_DOT = 'X';
    private static final char PC_DOT = 'O';
    private static final char EMPTY_DOT = '_';

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static int fieldsizeX;
    public static int fieldsizeY;
    public static char[][] field;

    public static void main(String[] args){
        initmap();
        printMap();
        while(true){
            humanTurn();
            printMap();
                if(checkWin(HUMAN_DOT)){
                System.out.println("Победил пользователь!");
                break;
                }
                if(isFullMap()){
                    System.out.println("Ничья.");
                    break;
                }
            System.out.println();
            pcTurn();
            printMap();
            if(checkWin(PC_DOT)){
                System.out.println("Выиграл компьютер!");
            break;
            }
            if(isFullMap()){
                System.out.println("Ничья.");
                break;
            }
            System.out.println();
        }
    }


    public static void initmap(){
        fieldsizeX = 3;
        fieldsizeY = 3;
        field = new char[fieldsizeY][fieldsizeX];

        for(int y = 0; y < fieldsizeY; y++){
            for(int x = 0; x < fieldsizeX; x++){
                field[y][x] = EMPTY_DOT;
            }
        }
    }


    public static void printMap(){
        for(int y = 0; y < fieldsizeY; y++){
            for(int x = 0; x < fieldsizeX; x++){
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }


    public static void humanTurn(){
        int x;
        int y;

        do{
            System.out.println("Введите координаты через пробел");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while(!isValidCell(y,x) || !isEmptyCell(y,x));
        field[y][x]= HUMAN_DOT;
    }

    public static boolean isValidCell(int y, int x){
        return x >= 0 && x < fieldsizeX && y >=0 && y < fieldsizeY;
    }

    public static boolean isEmptyCell(int y, int x){
        return field[y][x] == EMPTY_DOT;
    }

    public static void pcTurn(){
        int x;
        int y;
        do{
            x = RANDOM.nextInt(fieldsizeX);
            y = RANDOM.nextInt(fieldsizeY);
        } while(!isEmptyCell(y,x));
        field[y][x] = PC_DOT;
    }

    public static boolean checkWin(char c){
        int i=0;
            for (int x = 0; x < fieldsizeX; x++) {
                if(field[0][x] == c) { //проверка конкретного столбца каждой строчки цикла
                    i++; //счетчик ходов
                    if (i == 3) {
                        return true;
                    }
                    break;
                } if(field[1][x] == c) { //проверка конкретного столбца каждой строчки цикла
                    i++;
                    if (i == 3) {
                        return true; // проверка почему-то срывается на этом пункте в дебаггере, хотя надо дальше проверять
                    }
                    break;
                } if(field[2][x] == c) { //проверка конкретного столбца каждой строчки цикла
                    i++;
                    if (i == 3) {
                        return true;
                    }
                    break;
                }
                if (field[x][0] == c) { //проверка конкретной строчки каждого столбца цикла
                    i++;
                    if (i == 3) {
                        return true;
                    }
                    break;
                }
                if (field[x][1] == c) {//проверка конкретной строчки каждого столбца цикла
                    i++;
                    if (i == 3) {
                        return true;
                    }
                    break;
                }
                if (field[x][2] == c) {//проверка конкретной строчки каждого столбца цикла
                    i++;
                    if (i == 3) {
                        return true;
                    }break;

                }

                if(field[x][x] == c){ //проверка диагонали
                    i++;
                    if(i == 3){
                        return true;
                    }
                }
                if(field[fieldsizeX - 1 - x][x] == c){ //проверка второй диагонали
                    i++;
                    if(i == 3){
                        return true;
                    }
                }
                return true;
            }
//но это все не работает >_< хотя вроде все логично, пусть и громоздко по сравнению с методом ниже.
        return false;
//        return true;
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][2] == c) return true;

//        return false;
    }



    public static boolean isFullMap(){
        for (int y = 0; y < fieldsizeY; y++) {
            for (int x = 0; x < fieldsizeX; x++) {
                if(field[y][x] == EMPTY_DOT) return false;
            }
        }
        return true;
    }


}
