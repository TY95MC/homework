package jc2_lesson_2;

import java.io.IOException;

public class ArrayExceptions {

    public static void main(String[] args) throws IOException{
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        checkSize(s); //IndexOutOfВoundsException
        getTwoDimensionArray(s); //NumberFormatException
        getArrayInt(s);
    }

    public static void checkSize(String s) {
        String[] split1 = s.split("\n");//[{10 3 1 2}, {2 3 2 2}, {5 6 7 1}, {300 3 1 0}]
        String[][] split2 = new String[split1.length][];
        try{
            for (int i = 0; i < 4; i++) {
                split2[i] = split1[i].split(" ");
                for (int j = 0; j < 4; j++) {
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Размеры массива не являются корректными! Измените размер массива на [4][4].");
            System.exit(0);
        }
    }

    public static void getTwoDimensionArray(String s){
        String[] split1 = s.split("\n");//[{10 3 1 2}, {2 3 2 2}, {5 6 7 1}, {300 3 1 0}]
        String[][] split2 = new String[split1.length][];
        for (int i = 0; i < split1.length; i++) {
            split2[i] = split1[i].split(" ");
            for (int j = 0; j < split2.length; j++){
                System.out.print(split2[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    private static void getArrayInt(String s) {
        int sum = 0;
        int answer = 0;
        String[] split1 = s.split("\n");//[{10 3 1 2}, {2 3 2 2}, {5 6 7 1}, {300 3 1 0}]
        String[][] split2 = new String[split1.length][];
        for (int i = 0; i < split1.length; i++) {
            split2[i] = split1[i].split(" ");
            for (int j = 0; j < split2.length; j++) {
                try {
                    int f = Integer.parseInt(String.valueOf(split2[i][j]));
                    System.out.print(f + " ");
                    sum = sum + f;
                } catch (NumberFormatException e) {
                    System.out.print("Элемент массива \"" + split2[i][j] +"\" не является числом! Введите число. ");
                } finally {
                    if (j == 3) {
                        System.out.println("\n");
                        answer = sum / 2;
                    }
                }
            }

        }
        System.out.println("Ответ равен " + answer + ".");
    }
}








