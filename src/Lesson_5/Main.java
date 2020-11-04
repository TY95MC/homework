package Lesson_5;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Dog dog = new Dog("Барбос", 500, 10, 0.5);
        Dog dog2 = new Dog("Полкан", 700, 8,0.6 );
        Horse horse = new Horse("Сивка", 1500, 100, 3);
        Horse horse2 = new Horse("Анатолий", 1800, 95, 2.8);
        Bird bird = new Bird("Кеша", 5, 0, 0.2);
        Bird bird2 = new Bird("Рокот", 6, 0, 0.3);
        Cat cat = new Cat("Матроскин", 200, 0, 2);
        Cat cat2 = new Cat("Мурка", 210, 0, 2.2);



        Animal animals [] = {dog, dog2, horse, horse2, bird, bird2, cat, cat2}; //создаем массив животных

        System.out.println("На сколько метров нужно прыгнуть животному?");
        Scanner SCANNER = new Scanner(System.in);
        double x = SCANNER.nextDouble();  //вводим данные сколько нужно проплыть животному.
        // один нюанс, не смотря на double формат 0.5 на ввод почеу-то ломает программу, даже если добавить d к числу

        for (int i = 0; i < animals.length; i++) {
            if(x <= animals[i].getJump()){ //если дистанция покрывает возможности животного, то оно добежало
                animals[i].getJump();
                System.out.println(animals[i].getName() + " подпрыгнул!");
            }else{  //иначе не получилось
                System.out.println("У " + animals[i].getName() + " не получилось :( . " + animals[i].getName() + " умеет прыгать лишь на " + animals[i].getJump() + " м.");
            }

        }
        System.out.println();

        System.out.println("Сколько метров нужно пробежать животному?");
        int y = SCANNER.nextInt(); //вводим метраж пробежки

        for (int i = 0; i < animals.length; i++) {
            if(y <= animals[i].getRun()){ //если возможнсти позволяют - животное добежало
                animals[i].getRun();
                System.out.println(animals[i].getName() + " пробежал!");
            } else{
                System.out.println(animals[i].getName() + " не добежал. " + animals[i].getName() + " умеет бегать лишь на " + animals[i].getRun() + " м.");
            }

        }
        System.out.println();

        System.out.println("Сколько метров нужно проплыть животному?");
        y = SCANNER.nextInt();

        for (int i = 0; i < animals.length; i++) {
            if(y <= animals[i].getSwim()){ //если животное может плавать и расстояние покрывает возможности - животное проплыло
                animals[i].getSwim();
                System.out.println(animals[i].getName() + " проплыл!");
            } else if(animals[i].getSwim() == 0){
                System.out.println(animals[i].getName() + " не умеет плавать.");
            }
            else{ //животное фактически утонуло
                System.out.println(animals[i].getName() + " не доплыл. " + animals[i].getName() + " умеет плавать лишь на " + animals[i].getSwim() + " м.");
            }

        }

    }
}
