/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Jacob Naylor
 */
public class Cookie extends DessertItem{
    
    private int number;
    private int pricePer12;
    private int cost;
    
    public Cookie(String name, int number, int pricePer12)
    {
        //give to the super class
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    } 
    
    
    @Override
    public String toString()
    {
        String output = "";
        output += number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + "/dz \n";
        output += getName();    
        int widthCookie = DessertShoppe.RECEIPT_WIDTH - getName().length();       
        output += String.format("%" + widthCookie + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        cost = (int) Math.round(number*(pricePer12/12));
        return cost;       
    } 
}