import java.util.ArrayList;
import java.util.List;

// general interface to use cafe
// storing object
public class Cafe
{
    private List<Drink> drinkList;

    public Cafe()
    {
        this.drinkList = new ArrayList<>();
    }

    public void createDrink(String name, double price)
    {
        // 1. creates drink object
        Drink drink = new Drink();

        drink.setName(name);
        drink.setPrice(price);

        // 2. store object to list
        drinkList.add(drink);
    }

    public void printMenu()
    {
        System.out.println(drinkList);
    }
}
