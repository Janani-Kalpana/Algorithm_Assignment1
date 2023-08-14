import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber;
        
        do {
            System.out.print("Please enter a positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive number: ");
                scanner.next(); // Consume the invalid input
            }
            maxNumber = scanner.nextInt();
        } while (maxNumber <= 0);

        System.out.println("Fibonacci sequence up to " + maxNumber + ":");
        int prev = 0, current = 1;
        while (prev <= maxNumber) {
            System.out.print(prev + " ");
            int next = prev + current;
            prev = current;
            current = next;
        }

        scanner.close();
    }
}

    

