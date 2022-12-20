import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static String gefaelltRueckgabe(String[] gefaellt) {

        Arrays.toString(gefaellt);

        if (gefaellt.length == 0) {

            return "Niemandem gefällt das";

        }

        if (gefaellt.length == 1) {

            return gefaellt[0] + " gefällt das";

        }

        if (gefaellt.length == 2) {

            return gefaellt[0] + " & " + gefaellt[1] + " gefällt das";

        }

        if (gefaellt.length > 2) {

            return gefaellt[0] + " , " + gefaellt[1] + " & " + (gefaellt.length - 2) + " gefällt das";

        }

        return "";


    }

    public static void main(String[] args) {

        String[] gefaellt = {"Anton", "Alex", "bErnd", "Lisa", "Leo"};

        System.out.println(gefaelltRueckgabe(gefaellt));

        }


    }



