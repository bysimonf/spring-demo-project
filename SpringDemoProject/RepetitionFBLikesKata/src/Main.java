import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static String likeCount (String[] likes) {

        if (likes.length == 0) {

            return "Niemand gefällt das.";
        }

        if (likes.length == 1) {

            return likes[0] + " gefällt das.";
        }

        if (likes.length == 2) {

            return likes[0] + " & " + likes[1] + " gefällt das.";
        }

        if (likes.length > 2) {

            return likes[0] + " und " + (likes.length - 1) + " weiteren Personen gefällt das.";
        }

        return "";

    }


    public static void main(String[] args) {

        String[] likes = {"Simon"};

        System.out.println(likeCount(likes));


    }



}
