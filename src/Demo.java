public class Demo
{
    public static void main(String[] args)
    {
        Drink drink1 = createDrink("Coffee", 40.0);
        Drink drink2 = createDrink("Latte", 60.0);
        Drink drink3 = createDrink("Tea", 10.0);

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);
    }

    public static Drink createDrink(String name, double price)
    {
        Drink drink = new Drink();

        drink.setName(name);
        drink.setPrice(price);

        return drink;
    }
}
