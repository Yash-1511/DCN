import java.io.*;
import java.net.*;

class SumServer {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started");

            // Listen for a connection request
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // Create data input and output streams
            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

            // Continuously serve the client
            while (true) {
                // Receive number from client
                int number = inputFromClient.readInt();
                int sum = 0;
                //Calculate the sum of the first n natural numbers
                for(int i=1;i<=number;i++){
                    sum+=i;
                }
                // Send the result back to the client
                outputToClient.writeInt(sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
