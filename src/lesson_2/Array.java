package lesson_2;

//import java.util.Arrays;
//import java.util.Random;

public class Array {

    public static void main(String[] args){
          int array1 [] = new int[]{0, 1, 0, 1, 1, 0, 1, 1, 0}; //создали массив и наполнили его элементами
          replace(array1);//первая задача
          int array2 [] = new int[8];
          insert(array2);
          int array3 [] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
          multiplication(array3);
          int array4[] = {15, 45, 78, 1, 59, 69, 23, 25, 16, 11, 9, 38};
          getMax(array4);
          getMin(array4);
          int [][] array5 = new int[6][6];
          diagonal(array5);
          int[] array6 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
          checkBalance(array6);
    }
     public static int [] replace(int[] array1){
        for(int i = 0; i < array1.length; i++){ //создали цикл для замены значений элементов
            if (array1[i] == 1){ //в случае, если элемент равен 1, он заменяется на 0
                array1[i] = 0;
            }else{  //в противном случае 0 заменяется на 1
                array1[i] = 1;
            }
            System.out.print(array1[i] + " "); //вывод замены элемента в консоль
        }
        return array1; //возвращаем в результат получившийся массив
     }

     public static int[] insert(int[] array2){ //вторая задача
       array2[0]= 1; //присваиваем первому элементу значение 1
        System.out.print(array2[0] + " "); //выводим элемент в консоль
        for(int i = 1; i < array2.length; i++){ //создаем цикл, для заполнения оставшейся части массива
            array2[i] = array2[i - 1] + 3; //элемент равен сумме предыдущего элемента и 3
            System.out.print(array2[i] + " "); //выводим элемент в консоль
        }
        return array2;

     }

     public static int[] multiplication(int [] array3){

         for(int i = 0; i < array3.length; i++){
             if(array3[i] < 6){ //ищем элменты меньше 6
                 array3[i] = array3[i] * 2; //умножаем их на 2
                 System.out.print(array3[i] + " "); //выводим их обратно в массив
             } else{
                 System.out.print(array3[i] + " "); //выводим обратно в массив элементы, не подлежащие умножению
             }
         }
         return array3;
     }

     public static int getMax(int[] array4) {
        int maxValue = array4[0]; //вводим первый элемент массива как эталон сравнения
        for (int i = 0; i < array4.length; i++) {
            if(maxValue < array4[i]){ //если элемент массива больше эталонного, он сам становится эталоном
                maxValue = array4[i];
            }
        }
        System.out.println("Максимальное число = " + maxValue);
        return maxValue;
     }

     public static int getMin(int[] array4){

         int minValue = array4[0]; //первый элемент становится эталоном сравнения
         for(int u = 0; u < array4.length; u++){
            if(minValue > array4[u]){ //если элемент меньше эталона, он сам становится эталоном
                minValue = array4[u];
            }
         }
         System.out.println("Минимальное число = " + minValue);
         return minValue;
     }

     public static int[][] diagonal(int[][] array5){  /*решение пятой задачи подсмотрел в интернете,
 и подумать не мог, что строки и столбцы можно рассматривать как отдельные массивы.
 соответственно, одну диагональ построил, а вторую не получается. по сути нужны два остчета строка от 0 и
 до конца длины массива и наоборот, а также просто от 0 до длины столбцов.
 прикинул, что это 3 цикла один в другом,но получилась каша. с двумя парами циклов в консоль не выводит ничего адеватного
 подсмотрел здесь: https://www.cyberforum.ru/java-beginners/thread2527666.html, там были коды правильных ответов,
 но я в них не разобрался, а просто так копировать не хочется*/

        for(int i = 0; i < array5.length; i++){
            for(int j = 0; j < array5.length; j++){
                array5[i][j] = 0;
                if(array5[i] == array5[j]){
                    array5[i][j] = 1;
                    System.out.print(array5[i][j]);
                }else{
                    array5[i][j] = 0;
                    System.out.print(array5[i][j]);
                }

            }
            for(int n = array5.length - 1; n > 0; n--){
                for(int t =0 ; t < array5.length; t++){
                    if(array5[n] == array5[t]){
                        array5[n][t] = 1;
                        System.out.print(array5[n][t]);
                    }else{
                        array5[n][t] = 0;
                        System.out.print(array5[n][t]);
                    }
                }
            }
                System.out.println();
        }
        return array5;
     }

     public static boolean checkBalance(int[] array6){
        /*увы, эта задачка мне покорилась лишь на половину, следующий код лишь доказывает возможность баланса,
        что сумма элементов массива можно делать на 2 равные части. как найти границы этих частей не придумал*/
        boolean bool = true;
        int sum = 0; //вводим переменную суммы всех элементов
        for(int i = 0;i < array6.length; i++){
            sum = sum + array6[i]; //считается сумма элементов
            if(sum % 2 == 0){ //если сумма без остатка делится на 2, то такая возможность существует
                bool = true;
            }else{
               bool = false; //в противном случае - невозможно
            }
        }
        System.out.println(bool);
        return bool;
     }

}





