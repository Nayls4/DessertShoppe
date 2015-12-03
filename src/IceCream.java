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
        super(name);
        this.cost = cost;
    }
    
//    public abstract void name();
//    
//    public abstract void cost();

  
    @Override
    public String toString()
    {
     return "";
    }

    @Override
    public int getCost() {
        
    }
    
}
