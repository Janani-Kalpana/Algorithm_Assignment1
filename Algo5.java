import java.util.Scanner;

public class Algo5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text (ASCII only)
        System.out.print("Enter a text (ASCII only): ");
        String inputText = scanner.nextLine();

        // Check if the input is empty
        if (inputText.isEmpty()) {
            System.out.println("Input is empty. Please enter a non-empty text.");
        } else {
            // Invert the sequence of characters and display the reversed text
            String reversedText = reverseText(inputText);
            System.out.println("Reversed text: " + reversedText);
        }

        scanner.close();
    }

    // Function to reverse the sequence of characters in a string
    private static String reverseText(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            
            start++;
            end--;
        }
        return new String(charArray);
    }
}

