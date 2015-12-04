/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author Jacob Naylor
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;
    private int cost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName,icCost);
       this.cost = icCost;
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    

    @Override
    public String toString()
    {
        String output = "";
        output += toppingName + " Sundae with \n";
        output += getName();        
        int widthIceCreamSundae = DessertShoppe.RECEIPT_WIDTH - getName().length();       
        output += String.format("%" + widthIceCreamSundae + "s", DessertShoppe.cents2dollarsAndCents(getCost()));    
        return output;
    }

    @Override
    public int getCost() {
        cost = cost + toppingCost;
        return cost;       
    }   
}