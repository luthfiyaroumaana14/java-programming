import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {

        try {
            // Connect to the server
            Socket socket = new Socket("localhost", 5000);

            // Read data from server
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );

            // Send data to server
            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true
            );

            // Send message
            out.println("Hello Server, this is the client!");

            // Receive response
            String serverResponse = in.readLine();

            System.out.println("Message from server: " + serverResponse);

            // Close connection
            socket.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}