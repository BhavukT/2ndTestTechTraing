package vegetableVendor;
import java.util.*;

class VegetableBill {
    private ArrayList<Item> items; //List of Items
    private int sum; //Total Sum of Items
    private int numberOfDiscountedItem = 0; //Number of Discounted Items
    private int sumDiscount; //Total Sum of Discounted Items

    VegetableBill(Employee employee){ //Constructor
        this.items = new ArrayList<Item>();
        this.sum = 0;
        this.sumDiscount = 0;
    }

    public void addItem(Item item){ //Add Item to the List
        items.add(item);
    }

    public int getTotal(){ //Get total Amount

        for(Item iterator : items){
            sum += iterator.getPrice(); 
        }

        return sum;
    }

    public void printReceipt(){ //Print Receipt or Bil
        for(Item iterator : items){
            iterator.printItem();
        }
    }

    public int getNumberOfDiscountedItem(){ // Numbe rof Discounted Items
        for(Item iterator : items){
            if(iterator.discountedItem == true){
                numberOfDiscountedItem++;
            }
        }
        return numberOfDiscountedItem;
    }

    public int sumTotalDiscount(){ // Sum total Discount amount

        for(Item iterator : items){
            sumDiscount += iterator.getDiscountAmount(); 
        }

        return sumDiscount;
    }

}
