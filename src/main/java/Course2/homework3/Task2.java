package Course2.homework3;

public class Task2 {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("8 (800) 555-35-35", "Ivanov");
        phonebook.add("8 (495) 444-24-24", "Sidorov");
        phonebook.add("8 (499) 000-05-10", "Ivanov");
        phonebook.add("8 (123) 456-78-91", "Grigorev");
        phonebook.add("8 (123) 423-78-91", "Alexandrov");

        phonebook.showFullPhonebook();
        System.out.println();
        phonebook.get("Ivanov");
    }
}
