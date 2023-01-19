import java.io.*;
import java.net.*;

class SumClient {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8000);

            // Create an input stream to receive data from the server
            DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());

            // Create an output stream to send data to the server
            DataOutputStream outputToServer = new DataOutputStream(socket.getOutputStream());

            // Send a number to the server
            int number = 5;
            outputToServer.writeInt(number);

            // Receive the sum from the server
            int sum = inputFromServer.readInt();

            // Display the sum
            System.out.println("Sum of first " + number + " natural numbers: " + sum);
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
