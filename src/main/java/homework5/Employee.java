package homework5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /*public static void showInfoStat(Employee person) {
        System.out.println("Имя: " + person.name + ". Должность: " + person.position +
                ". E-mail: " + person.email + ". Телефон: " + person.phone + ". З/п: " + person.salary +
                ". Возраст: " + person.age + ".");
    }*/

    public void showInfoNonStat() {
        System.out.println("Имя: " + name + ". Должность: " + position +
                ". E-mail: " + email + ". Телефон: " + phone + ". З/п: " + salary +
                ". Возраст: " + age + ".");
    }




}
