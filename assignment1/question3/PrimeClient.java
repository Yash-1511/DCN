import java.io.*;
import java.net.*;

class PrimeClient {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8000);

            // Create an input stream to receive data from the server
            ObjectInputStream inputFromServer = new ObjectInputStream(socket.getInputStream());

            // Create an output stream to send data to the server
            ObjectOutputStream outputToServer = new ObjectOutputStream(socket.getOutputStream());

            // Send an array of numbers to the server
            int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            outputToServer.writeObject(numbers);

            // Receive the prime numbers from the server
            Object primeNumbers = inputFromServer.readObject();
            if (primeNumbers instanceof int[]) {
                System.out.println("Prime numbers are: ");
                for (int i = 0; i < ((int[]) primeNumbers).length; i++) {
                    if (((int[]) primeNumbers)[i] != 0) {
                        System.out.print(((int[]) primeNumbers)[i] + " ");
                    }
                }
            } else if (primeNumbers instanceof Integer) {
                if ((Integer) primeNumbers == 0)
                    System.out.println("No prime numbers found in the given set.");
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
