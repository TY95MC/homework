package Lesson_6;

import java.io.*;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args){
        System.out.println("Начало программы.\n");
        try{
        FileOutputStream fos1 = new FileOutputStream("text1.txt");
        PrintStream ps1 = new PrintStream(fos1);
        ps1.println("There are no unlockable doors\n" + "There are no unwinnable wars\n" + "There are no unrightable wrongs\n" +
                "Or unsingable songs\n" + "\n" + "There are no unbeatable odds\n" + "There are no believable gods\n" + "There are no unnameable names,\n" +
                "Shall I say it again, yeah\n" + "\n" + "There are no impossible dreams\n" + "There are no invisible seams\n" +
                "Each night when day is through\n" + "I don't ask much\n"+ "\n" + "I just want you\n"+ "\n" + "I just want you\n");
//        ps1.close();

            FileOutputStream fos2 = new FileOutputStream("text2.txt");
            PrintStream ps2 = new PrintStream(fos2);
            ps2.println("There are no uncriminal crimes\n" + "There are no unrhymable rhymes\n" + "There are no identical twins\n" +
                    "Or forgivable sins\n" + "\n" + "There are no incurable ills\n" + "There are no unkillable thrills\n" +
                    "One thing and you know it's true\n" + "I don't ask much\n" + "I just want you [4x]\n" + "\n" +
                    "I'm sick and tired of bein' sick and tired\n" + "I used to go to bed so high and wired\n" + "Yeah, yeah, yeah, yeah\n" + "\n" +
                    "I think I'll buy myself some plastic water\n" + "I guess I should have married Lennon's daughter\n" +
                    "Yeah, yeah, yeah, yeah\n" + "\n" + "There are no unachievable goals\n" + "There are no unsaveable souls\n" +
                    "No legitimate kings or queens\n" + "Do you know what I mean? Yeah\n" + "\n" +
                    "There are no undisputable truths\n" + "And there ain't no fountain of youth\n" +
                    "Each night when day is through\n" + "I don't ask much\n" + "\n" + "I just want you [6x]\n");
//            ps2.close();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileInputStream fis1 = new FileInputStream("text1.txt");
            int a;
//            while((a = fis1.read()) != -1){
//                System.out.print((char) a);
//            }
            FileInputStream fis2 = new FileInputStream("text2.txt");
            int b;
//            while((b = fis2.read()) != -1){
//                System.out.print((char) b);
//            }


            FileOutputStream fos3 = new FileOutputStream("text3.txt");
            PrintStream ps3 = new PrintStream(fos3);
            while((a =  fis1.read()) != -1) {
                ps3.print((char) a);
            }
            while((b = fis2.read()) != -1){
                ps3.print((char) b);
            }

            FileInputStream fis3 = new FileInputStream("text3.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово, которое желаете найти");
            String x = scanner.nextLine();
            String str = fis3.toString();/*  в этой строчке текст файла должен был стать строковым, но далее
            при поиске индекса идет ссылка на файл в оперативной памяти,
            а не на сам текст файла. не могу разобраться почему.
            Оно должно было сверить слово в тексте, если индекс слова не -1, то слово присутствует*/

            int indexW = str.indexOf(x);
            if(indexW != -1){
                System.out.println("Нужное слово нашлось.");
            } else{
                System.out.println("Нужное слово отсутствует в тексте.");
            }




            fis1.close();
            fis2.close();
            ps3.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Конец программы.");

    }

}
