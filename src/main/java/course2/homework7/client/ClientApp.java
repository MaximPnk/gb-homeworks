package course2.homework7.client;

import course2.homework7.client.graphics.Main;
import course2.homework7.client.service.ClientService;

public class ClientApp {

    public static void main(String[] args) {
        Main.main(args);
        new ClientService();
    }
}
