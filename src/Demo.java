public class Demo
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();

        cafe.createDrink("Coffee", 40.0);
        cafe.createDrink("Latte", 60.0);
        cafe.createDrink("Tea", 10.0);

        cafe.printMenu();

    }


}
