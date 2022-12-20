public class Main {

    public static void checkMood(String sentence) {

        if (sentence.contains(":)") && sentence.contains(":(")) {
            System.out.println("Neutral");
        }
        else if (sentence.contains(":)") || sentence.contains("(:")) {
            System.out.println("Stimmung gut");
        }
        else if (sentence.contains(":(") || sentence.contains("):")) {
            System.out.println("Stimmung schlecht");
        } else {
            System.out.println("keine Stimmung");
        }
    }


    public static void main(String[] args) {

        checkMood("Ich fühle mich :) :(");


    }
}
