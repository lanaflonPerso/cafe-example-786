import java.util.ArrayList;
import java.util.List;

public class Cafe
{
    private List<Drink> drinkList;

    public Cafe()
    {
        this.drinkList = new ArrayList<>();
    }

    public void createDrink(String name, double price)
    {
        Drink drink = new Drink();

        drink.setName(name);
        drink.setPrice(price);

        drinkList.add(drink);
    }

    public void printMenu()
    {
        for (Drink drink : drinkList)
        {
            System.out.println(drink);
        }

        // 2nd option
//        System.out.println(drinkList);
    }
}
