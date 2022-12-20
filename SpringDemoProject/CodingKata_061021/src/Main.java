public class Main {

    public static boolean checkLetters (String word, String letters) {

        int j = 0;

        for (int i = word.length() - letters.length(); i < word.length(); i++) {

                char firstWord = word.charAt(i);
                char secondWord = letters.charAt(j);

                if (firstWord != secondWord) {
                    return false;
                }
                
                j++;

            }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(checkLetters("Florian", "ian"));


    }


}

