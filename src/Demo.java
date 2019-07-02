public class Demo
{
    public static void main(String[] args)
    {
        Drink drink1 = new Drink();

        drink1.setName("Coffee");
        drink1.setPrice(40.00);

        Drink drink2 = new Drink();

        drink2.setName("Coffee");
        drink2.setPrice(40.00);

        Drink drink3 = new Drink();

        drink3.setName("Latte");
        drink3.setPrice(60.00);

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);

        System.out.println("does drink1 equal to drink2? " + drink1.equals(drink2));
        System.out.println("does drink1 equal to drink3? " + drink1.equals(drink3));


    }
}
