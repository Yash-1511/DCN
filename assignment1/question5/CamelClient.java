// package question5;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class CamelClient {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8000);

            // Create an input stream to receive data from the server
            BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Create an output stream to send data to the server
            DataOutputStream outputToServer = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            while (true) {
                // Get sentence from user
                System.out.print("Enter a sentence: ");
                String sentence = sc.nextLine();
                // Send sentence to the server
                outputToServer.writeBytes(sentence + "\n");
                // Receive camel case sentence from the server
                String camelSentence = inputFromServer.readLine();
                // Display the result
                System.out.println("Camel case: " + camelSentence);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

