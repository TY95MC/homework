package lesson1;

import java.util.Scanner;

public class summ {
    public static void main(String[] args) {
        System.out.println(userAnswer());  // вызываем метод userAnswer который подразумевает ввод пользователем двух чисел
    }

    public static boolean userAnswer(){
        boolean check = true;
        Scanner scanner = new Scanner(System.in);  // команда дающая возможность вводить числа в консоль пользователем
        int a = scanner.nextInt(); //ввод числа а
        int b = scanner.nextInt(); // ввод числа b
        if((a + b)>10 && (a + b)<=20){
            return check; // проверка суммы на соответствие условиям и возврат значения check
        } else {
            check = false;
            return check; //в противном случае выдает обратно значение false
        }
    }
}















        /* Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if((a+b)>10 && (a+b)<=20){
        System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
// ЧТО Я ПРОБОВАЛ ЧЕРЕЗ МЕТОД

//способ 1

//package lesson1;
//
//import java.util.Scanner;
//
//public class summ {
//    public static void main(String[] args) {
//        compare();        сразу вызываю метод сравнения суммы двух чисел
//    }
//    public boolean compare(){
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();        ввод первого числа
//        int b = scanner.nextInt();        ввод второго числа
//        if((a+b)>10 && (a+b)<=20){        сравнение
//            return true;
//        }else{
//            return false;
//        }
//    }


//      способ 2
/*package lesson1;

        import java.util.Scanner;

public class summ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  ввод первого числа сразу с запуском программы
        int b = scanner.nextInt();  ввод второго числа сразу с запуском программы и затем сравнение этих чисел по методу
        compare();
    }
    public boolean compare(){

        if((a+b)>10 && (a+b)<=20){
            return true;
        }else{
            return false;
        }
    }
}
//} по каким-то непонятным мне причинам не работает через метод, пишет что variable a и b is not used и cannot resolve symbol
//
//
//                  ресурсы
//  https://www.youtube.com/watch?v=AYxLL4ixPWo&list=PLt5E226f3KMH_RCpmklniMtJ4vDukXnDu&index=12
//  https://javarush.ru/quests/lectures/questsyntax.level04.lecture07
 */
