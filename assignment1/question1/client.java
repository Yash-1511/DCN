import java.io.*;
import java.net.*;
import java.util.*;

class CubeClient {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost", 8000);

      // Create an input stream to receive data from the server
      DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      DataOutputStream outputToServer = new DataOutputStream(socket.getOutputStream());

      // Send a number to the server
      System.out.println("enter number");
      double number = sc.nextDouble();
      outputToServer.writeDouble(number);

      // Receive the cube from the server
      double cube = inputFromServer.readDouble();

      // Display the cube
      System.out.println("Cube: " + cube);
      sc.close();
      socket.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
