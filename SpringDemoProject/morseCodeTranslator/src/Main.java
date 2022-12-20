import java.util.Arrays;

public class Main {

    // method to convert morse to letters:
    public static void translateMorse(String morseCode, String[] morseSymbols, String[] letters) {

        String[] morseArray = morseCode.split(" ");

        for (int i = 0; i < morseArray.length; i++) {
            for (int j = 0; j < morseSymbols.length; j++) {
                if (morseArray[i].equals(morseSymbols[j])) {
                    System.out.println(letters[j]);
                }
            }
        }
    }

    // method to convert letters to morse:
    public static void translateWord(String word, String[] letters, String[] morseSymbols) {

        String[] wordArray = word.split("");

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if(wordArray[i].equals(letters[j])) {
                    System.out.println(morseSymbols[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String[] morseSymbols = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",  "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",  "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/"};

        // morse to letters:
        String morseCode = "-.-. --- --- -.- / .- -. -.. / -.-. --- -.. .";
        translateMorse(morseCode, morseSymbols, letters);

        // letters to morse:
        String word = "cook and code";
        translateWord(word, letters, morseSymbols);

    }
}

