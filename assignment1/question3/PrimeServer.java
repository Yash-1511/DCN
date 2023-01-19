import java.io.*;
import java.net.*;

class PrimeServer {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started");

            // Listen for a connection request
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // Create data input and output streams
            ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputToClient = new ObjectOutputStream(socket.getOutputStream());

            // Continuously serve the client
            while (true) {
                // Receive array of numbers from client
                int[] numbers = (int[]) inputFromClient.readObject();
                int[] primeNumbers = new int[numbers.length];
                int j = 0;
                boolean flag = false;
                // Check if each number is prime or not
                for (int i = 0; i < numbers.length; i++) {
                    int number = numbers[i];
                    boolean isPrime = true;
                    if (number == 1)
                        isPrime = false;
                    for (int k = 2; k <= number / 2; k++) {
                        if (number % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        primeNumbers[j++] = number;
                        flag = true;
                    }
                }
                if (flag) {
                    // Send the prime numbers to the client
                    outputToClient.writeObject(primeNumbers);
                } else {
                    // Send 0 to the client if no prime numbers
                    outputToClient.writeObject(0);
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
