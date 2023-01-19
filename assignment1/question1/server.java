import java.io.*;
import java.net.*;

class CubeServer {
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
        double number = inputFromClient.readDouble();

        // Calculate the cube of the number
        double cube = number * number * number;

        // Send the result back to the client
        outputToClient.writeDouble(cube);
      }
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}
