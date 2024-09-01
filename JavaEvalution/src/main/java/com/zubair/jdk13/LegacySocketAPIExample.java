package com.zubair.jdk13;

import java.net.ServerSocket;
import java.net.Socket;

public class LegacySocketAPIExample {
    public static void main(String[] args) {
        try {
            // Create a server socket and bind it to a port
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server listening on port 8080...");

            // Accept incoming connections
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            // Close the server socket
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
