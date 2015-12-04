/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Jacob Naylor
 */
public class Candy extends DessertItem{
    
    private double weight;
    private int pricePerLbs;
    private int cost;
    

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    
    @Override
    public String toString()
    {
        String output = "";
        output += weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + "/lb. \n";
        output += getName();        
        int widthCandy = DessertShoppe.RECEIPT_WIDTH - getName().length();       
        output += String.format("%" + widthCandy + "s", DessertShoppe.cents2dollarsAndCents(getCost()));        
        return output;
    }

    @Override
    public int getCost() {
        cost = (int) Math.round((this.weight*this.pricePerLbs));
        return cost;
    }
}
