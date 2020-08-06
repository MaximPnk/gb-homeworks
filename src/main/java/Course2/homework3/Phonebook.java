package Course2.homework3;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, String> phonebook = new HashMap<>();

    public void add(String number, String lastName) {
        phonebook.put(number, lastName);
    }

    public void get(String lastName) {
        for (Map.Entry<String, String> pair: phonebook.entrySet()) {
            if (pair.getValue().equals(lastName)) {
                System.out.println(pair.getValue() + " " + pair.getKey());
            }
        }
    }

    public void showFullPhonebook() {
        for (Map.Entry<String, String> pair : this.phonebook.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
