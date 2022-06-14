package net.osgg.factorypattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza second_pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + second_pizza.getName() + "\n");
    }
}
