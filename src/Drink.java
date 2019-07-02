import java.util.Objects;

/**
 * 1. Gen constructor
 * 2. Gen getters/setters
 * 3. Gen equals & hashCode
 * 4. Gen toString
 */

public class Drink
{
    private String name;

    private double price;

    public Drink()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Drink drink = (Drink) o;
        return Double.compare(drink.price, price) == 0 &&
                Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, price);
    }

    @Override
    public String toString()
    {
        return name + " : " + price;
    }
}
