package course2.homework6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static DataInputStream dis;
    private static DataOutputStream dos;

    public static void main(String[] args) {
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(9375)) {
                Socket socket;
                System.out.println("Server connected");
                socket = serverSocket.accept();
                System.out.println("Client connected");
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());
                while (true) {
                    String strFromServer = dis.readUTF();
                    if (strFromServer.equalsIgnoreCase("quit")) {
                        break;
                    }
                    System.out.println("Client: " + strFromServer);
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
                    try {
                        System.out.println("You: " + line);
                        dos.writeUTF(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }}).start();
    }

}
