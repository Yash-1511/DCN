import java.io.*;
import java.net.*;

public class ShapeServer {
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
                // Receive choice from client
                int choice = inputFromClient.readInt();
                double result;
                switch(choice){
                    case 1:
                        // Receive radius from client
                        double radius = inputFromClient.readDouble();
                        //pi * r * r
                        result = Math.PI * Math.pow(radius, 2);
                        outputToClient.writeDouble(result);
                        break;
                    case 2:
                        // Receive side from client
                        double side = inputFromClient.readDouble();
                        result = side * side;
                        outputToClient.writeDouble(result);
                        break;
                    case 3:
                        // Exit the program
                        System.out.println("Exiting the program");
                        System.exit(0);
                        break;
                    default:
                        // Invalid choice
                        System.out.println("Invalid choice");
                        outputToClient.writeDouble(0);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
