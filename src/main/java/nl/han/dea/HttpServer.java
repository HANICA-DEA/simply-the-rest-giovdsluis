package nl.han.dea;

import java.io.IOException;
import java.net.ServerSocket;

public class HttpServer {

    private int tcpPort;

    public HttpServer(int tcpPort) {
        this.tcpPort = tcpPort;
    }

    public static void main(String[] args) {
        new HttpServer(8080).startServer();
    }

    public void startServer() {
        try (
                var serverSocket = new ServerSocket(this.tcpPort);
        ) {
            System.out.println("Server accepting requests on port " + tcpPort);

            var acceptedSocket = serverSocket.accept();
            var connectionHandler = new connectionHandler(acceptedSocket);
            connectionHandler.handle();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}