package Challenge;

public class StringReverser {
    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Split the input string into words
        String[] words = input.split("\\s+");

        // StringBuilder to hold the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Remove the trailing space and return the result
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello world this is Java";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseWords(input));
    }
}
