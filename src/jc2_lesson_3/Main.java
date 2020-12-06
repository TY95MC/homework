package Lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> songText = new ArrayList<>(Arrays.asList("i", "tried", "so", "hard",
                "and", "got", "so", "far",
                "but", "in", "the", "end",
                "it", "doesn't", "even", "matter",
                "i", "had", "to", "fall",
                "to", "lose", "it", "all",
                "but", "in", "the", "end",
                "it", "doesn't", "even", "matter"));
        Set<String> uniqueText = new HashSet<>(songText);
        System.out.println(uniqueText);
        Iterator<String> iter = uniqueText.iterator();
        while(iter.hasNext()) {
            int i = 0;
            String str = iter.next();
            ListIterator<String> iter1 = songText.listIterator();
            while (iter1.hasNext()){
                String str1 = iter1.next();
                if(str.equals(str1)){
                    i++;
                }
            }System.out.println( str + " встречается " + i + " раз(а).");
        }
//Столкнулся с проблемой: не смог привести songText к нижнему регистру, чтобы uniqueText
// адекватно видел входящие слова песни. пробовал toLowerCase, но не получилось.
//к сожалению, при создании отдельных классов метод put() не работает,
// если не создавать в этих классах отдельно метод мейн, для запуска программы.
// Но не в этом беда. не понял как подставить key класса person в value класса phonebook.
// если я верну строю логику value класса phoneBook, являясь key для e-mail в классе person,
// является value для key "фамилия" в классе phonebook. Отсюда методы поиска номера и е-mail по фамилии
// сводится к тому, чтобы применить метод getValue() в phoneBook и getValue() в person ( выходит метод в методе getValue(getValue())

        Map<String, String> person = new HashMap<>();
        person.put("89032457838", "Ivanov@mail.ru");
        person.put("89031327655", "Sergeev_Andrey@mail.ru");
        person.put("89051457835", "Ivanov_89@mail.ru");
        person.put("89031457835", "SmirnovA@mail.ru");
        person.put("89031454973", "Ivanov_95@mail.ru");
        person.put("89031419284", "Zheglov@mail.ru");

        Map<String, HashMap> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new HashMap(person));
        phoneBook.put("Смирнов", new HashMap(person));
        phoneBook.put("Жеглов", new HashMap(person));
        phoneBook.put("Сергеев", new HashMap(person));

        System.out.println(phoneBook);


        

    }

}
