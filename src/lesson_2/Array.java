package lesson_2;

//import java.util.Arrays;
//import java.util.Random;

public class Array {

    public static void main(String[] args){
//        int array1 [] = new int[]{0, 1, 0, 1, 1, 0, 1, 1, 0}; //создали массив и наполнили его элементами
//        replace(array1);//первая задача
//        int array2 [] = new int[8];
//        insert(array2);
//        int array3 [] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        multiplication(array3);
//        int array4[] = {15, 45, 78, 1, 59, 69, 23, 25, 16, 11, 9, 38};
//        getMax(array4);
//        getMin(array4);
          int [][] array5 = new int[6][6];
          diagonal(array5);
//        int[] array6 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
//        checkBalance(array6);
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
             if(array3[i] < 6){
                 array3[i] = array3[i] * 2;
                 System.out.print(array3[i] + " ");
             } else{
                 System.out.print(array3[i] + " ");
             }
         }
         return array3;
     }

     public static int getMax(int[] array4) {
        int maxValue = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if(maxValue < array4[i]){
                maxValue = array4[i];
            }
        }
        System.out.println("Максимальное число = " + maxValue);
        return maxValue;
     }

     public static int getMin(int[] array4){

         int minValue = array4[0];
         for(int u = 0; u < array4.length; u++){
            if(minValue > array4[u]){
                minValue = array4[u];
            }
         }
         System.out.println("Минимальное число = " + minValue);
         return minValue;
     }

     public static int[][] diagonal(int[][] array5){
        for(int i = 0; i < array5.length; i++){
            for(int j = 0; j < array5.length; j++){
                array5[i][j] = 0;
                if(array5[i] == array5[j]){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            for(int n = array5.length; n > 0; n--){
                for(int t = array5.length; t > 0; t--){
                    if(array5[n] == array5[t]){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
            }
                System.out.println();
        }
        return array5;
     }

     public static boolean checkBalance(int[] array6){
        boolean bool = true;
        int sum = 0;
        for(int i = 0;i < array6.length; i++){
            sum = sum + array6[i];
            if(sum % 2 == 0){
                bool = true;
            }else{
               bool = false;
            }
        }
        System.out.println(bool);
        return bool;
     }

}





