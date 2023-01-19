import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ShapeClient {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8000);

            // Create an input stream to receive data from the server
            DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());

            // Create an output stream to send data to the server
            DataOutputStream outputToServer = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                // Display menu
                System.out.println("1. Area of Circle");
                System.out.println("2. Area of Square");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                outputToServer.writeInt(choice);
                switch(choice){
                    case 1:
                        System.out.print("Enter radius of the circle: ");
                        double radius = sc.nextDouble();
                        outputToServer.writeDouble(radius);
                        double area = inputFromServer.readDouble();
                        System.out.println("Area of circle: " + area);
                        break;
                    case 2:
                        System.out.print("Enter side of the square: ");
                        double side = sc.nextDouble();
                        outputToServer.writeDouble(side);
                        area = inputFromServer.readDouble();
                        System.out.println("Area of square: " + area);
                        break;
                    case 3:
                        System.out.println("Exiting the program");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

