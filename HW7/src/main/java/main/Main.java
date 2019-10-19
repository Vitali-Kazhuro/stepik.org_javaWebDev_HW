package main;

import server.ThreadPooledServer;
import java.io.*;

public class Main {
    static final int PORT = 5050;

    public static void main(String[] args) throws IOException {
        ThreadPooledServer server = new ThreadPooledServer(PORT);
        new Thread(server).start();
        java.util.logging.Logger.getGlobal().info("Server started");
        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping Server");
        server.stop();
    }
}
