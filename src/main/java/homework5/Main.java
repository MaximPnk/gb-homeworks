package homework5;

public class Main {

    public static void main(String[] args) {
        Employee[] employArray = new Employee[5];

        employArray[0] = new Employee("Иванов И.И.", "Генеральный директор", "seo@corp.ru", "8-800-123-45-67 (доб. 1)", 500000, 48);
        employArray[1] = new Employee("Андреев А.А.", "Секретарь", "secr@corp.ru", "8-800-123-45-67", 150000, 45);
        employArray[2] = new Employee("Васильев В.В.", "Менеджер", "hello@corp.ru", "8-800-123-45-67 (доб. 2)", 50000, 27);
        employArray[3] = new Employee("Фиников Ф.Ф.", "Стажер", "newbie@corp.ru", "8-800-123-45-67", 30000, 21);
        employArray[4] = new Employee("Харазян Х.Х.", "Водитель", "drive@corp.ru", "8-800-123-45-67 (доб. 3)", 100000, 37);

        /*
        Employee.showInfo(employArray[0]);
        Employee.showInfo(employArray[1]);
        Employee.showInfo(employArray[2]);
        Employee.showInfo(employArray[3]);
        Employee.showInfo(employArray[4]);
        */

        for (int i = 0; i < employArray.length; i++) {
            if (employArray[i].age >= 40) {
                Employee.showInfo(employArray[i]);
            }
        }
    }
}
