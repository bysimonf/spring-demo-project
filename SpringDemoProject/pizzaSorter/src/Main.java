import java.util.Arrays;

public class Main {

    // sort method only works for unique first characters
    public static String[] sortPizza (String[] pizzas) {

        //String[] sortedPizzas = new String[pizzas.length];
        String tempPizza;


        for (int i = 0; i < pizzas.length - 1; i++) {

            int j = 0;

            // if first letter of the two words are the same
            // check next character of both words (hallo ich habe das gemacht)
	    // jonas was here

	    // Hello zusammen, dass wurde über VIM geändert
		

            if ((pizzas[i].charAt(j) == pizzas[i + 1].charAt(j))) {
                j++;
            }

            if (pizzas[i].charAt(j) < pizzas[i + 1].charAt(j)) {
                continue;
            }

                tempPizza = pizzas[i];
                pizzas[i] = pizzas[i + 1];
                pizzas[i + 1] = tempPizza;
                sortPizza(pizzas);
            }

            return pizzas;

        }




    public static void main(String[] args) {
        String[] pizzas = {"Cheese Massacre", "Cheese Test", "Vegan Hurricane", "Sucuk Overkill", "Hollandaise Drip", "Prosciutto Dance"};

        System.out.println(Arrays.toString(sortPizza(pizzas)));

        System.out.println("Hello World");
    }
}
