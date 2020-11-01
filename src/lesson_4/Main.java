package lesson_4;

public class Main {

    public static void main(String[] args) {

        employee employee1 = new employee("Иванов Иван Иванович.", "Генеральный директор.", "+7-999-999-99-99", 150000, 55);
        employee employee2 = new employee("Семенов Семен Семенович.", "Заместитель генерального директора.", "+7-999-999-99-98", 130000, 35);
        employee employee3 = new employee("Иванчук Светлана Сергеевна.", "Главный бухгалтер.", "+7-999-999-99-90", 100000, 48);
        employee employee4 = new employee("Сергеев Николай Павлович.", "Старший научный сотрудник.", "+7-999-999-99-92", 80000, 32);
        employee employee5 = new employee("Степаненко Алёна Владимировна.", "Старший научный сотрудник.", "+7-999-999-99-95", 80000, 41);


        employee[] employee = new employee[5];

            employee[0] = employee1;
            employee[1] = employee2;
            employee[2] = employee3;
            employee[3] = employee4;
            employee[4] = employee5;

            for (int i = 0; i < employee.length; i++) {
                System.out.print(employee[i].getInitials() + " ");
                System.out.println(employee[i].getPosition());
            }
            System.out.println("\t");

            for (int i = 0; i < employee.length; i++) {
                if (employee[i].age >= 40){
                    System.out.println("Сотрудник старше 40 лет.");
                    System.out.print(employee[i].getInitials() + " ");
                    System.out.println(employee[i].getPosition());
                    System.out.println("Контактный номер телефона " + employee[i].getPhoneNumber() + ".");
                    System.out.println("Зарплата " + employee[i].getSalary() + " рублей.");
                    System.out.println(employee[i].getAge() + " лет/год(а).");
                    System.out.println("\t");
                    }
            }


            for(int i = 0; i < employee.length; i++){
                if( employee[i].age > 45){
                    employee[i].getSalaryUp();
                    System.out.println("Повышение заработной платы на 5000 сотруднику старше 45 лет.");
                    System.out.print(employee[i].getInitials());
                    System.out.println(employee[i].getPosition());
                    System.out.println("Контактный номер телефона " + employee[i].getPhoneNumber() + ".");
                    System.out.println("Зарплата, с учетом повышения, составляет" + employee[i].getSalary() + " рублей.");
                    System.out.println(employee[i].getAge() + "лет/год(а).");
                    System.out.println("\t");
                }
            }

    }
}

