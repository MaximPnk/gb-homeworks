package Course2.homework6;

import java.io.*;
import java.net.Socket;

public class Client {
    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 9375;
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;

    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        try {
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
                try {
                    while (true) {
                        String strFromServer = dis.readUTF();
                        if (strFromServer.equalsIgnoreCase("quit")) {
                            break;
                        }
                        System.out.println("Server: " + strFromServer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }).start();
        new Thread(() -> {
            System.out.println("Put your text here:");
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String line = null;
                try {
                    line = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!line.trim().isEmpty()) {
                    sendMessage(line);
                }
            }}).start();
    }

    public void closeConnection() {
        try {
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String line) {
        if (socket.isClosed() || dos == null) {
            System.out.println("System error");
            return;
        }

        try {
            System.out.println("You: " + line);
            dos.writeUTF(line);
            dos.flush();
            if (line.equalsIgnoreCase("quit")) {
                closeConnection();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
