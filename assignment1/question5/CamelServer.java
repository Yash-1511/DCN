import java.io.*;
import java.net.*;

class CamelServer {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started");

            // Listen for a connection request
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // Create data input and output streams
            BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

            // Continuously serve the client
            while (true) {
                // Receive sentence from client
                String sentence = inputFromClient.readLine();

                // Convert sentence to camel case
                String[] words = sentence.split(" ");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < words.length; i++) {
                    if (i == 0) {
                        sb.append(words[i].toLowerCase());
                    } else {
                        sb.append(words[i].substring(0, 1).toUpperCase());
                        sb.append(words[i].substring(1).toLowerCase());
                    }
                }
                sentence = sb.toString();

                // Send the result back to the client
                outputToClient.writeBytes(sentence + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
