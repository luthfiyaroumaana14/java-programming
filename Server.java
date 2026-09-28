public class Server {

    public static void main(String[] args) {

        System.out.println("Server started.");
        System.out.println("Client connected!");

        String clientMessage = "Hello Server";

        System.out.println("Message from client: " + clientMessage);

        System.out.println(
            "Hello Client, message received: " + clientMessage
        );
    }
}