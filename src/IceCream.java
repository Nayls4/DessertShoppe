/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Jacob Naylor
 */
public class IceCream extends DessertItem{
    
    private int cost;

    public IceCream(String name, int cost)
    {
        //give to the super class
        super(name);
        this.cost = cost;
    }
  
    @Override
    public String toString()
    {
        String output = "";
        output += getName();    
        int widthIceCream = DessertShoppe.RECEIPT_WIDTH - getName().length();       
        output += String.format("%" + widthIceCream + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
