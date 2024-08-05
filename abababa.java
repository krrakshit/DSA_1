public class abababa {
    public static void main(String[] args) {
        String word = "HELEN";
        String encodedWord = "";
        char[] letters = {'H', 'O', 'U', 'S', 'E', 'L', 'M', 'N'};
        int[] codes = {3, 5, 8, 4, 2, 1, 6, 9};
        // Find the code for each letter in the word
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = -1;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == letter) {
                    index = j;
                    break;
                }
            }
            encodedWord += (index == -1) ? "" : codes[index]; // Handle undefined letters grac
            System.out.println("Encoded word: " + encodedWord);
        }
    }
}