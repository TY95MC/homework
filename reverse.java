package lesson1;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println(userAnswer());
    }
    public static int userAnswer() {
        Scanner scanner = new Scanner(System.in);  // команда дающая возможность вводить числа в консоль пользователем
        int a = scanner.nextInt();
        if(a > 100 && a <= 999){
            int a1 = a/100; //находим первую цифру введенного в консоль числа. пример а1 = 153 / 100 = 1(согласно условиям деления чисел int)
            int a2 = (a - (a1 * 100))/10; //находим вторую цифру введенного в консоль числа. пример а2 = (153 - (1 * 100))/10 = 5(согласно условиям деления чисел int)
            int a3 = (a - (a1 * 100) - (a2 * 10)); // находим третью цифру введенного в консоль числа.а3 = (153 - (1 * 100) - (5 * 10)) = 3(согласно условиям деления чисел int)
            int reverse = (a3 * 100) + (a2 * 10) + a1; //получаем число с обратным порядком цифр. пример reverse = (3 * 100) + (5 * 10) + 1=351
            return reverse;
        }else{
            return a; //если число не удовлетворяет условиям, оно выводится без изменений
        }
    }





}
