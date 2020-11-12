package lesson_4;

public class employee {
    String initials;
    String position;
    String phoneNumber;
    int salary;
    int age;


    employee(String initials, String position, String phoneNumber, int salary, int age ) {
        this.initials = initials;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;


    }
        public String getInitials () {
            return initials;
        }

        public String getPosition () {
            return position;
        }

        public String getPhoneNumber () {
            return (phoneNumber);
        }

        public int getSalary () {
            return salary;
        }

        public int getAge () {
            return age;
        }

        public int getSalaryUp(){
        salary = salary + 5000;
        return salary;
        }

}

