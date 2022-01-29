package vegetableVendor;
import java.util.*;

class VegetableBill {
    private ArrayList<Item> items;
    private int sum;
    private int numberOfDiscountedItem = 0;
    private int sumDiscount;

    VegetableBill(Employee employee){
        this.items = new ArrayList<Item>();
        this.sum = 0;
        this.sumDiscount = 0;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public int getTotal(){

        for(Item iterator : items){
            sum += iterator.getPrice(); 
        }

        return sum;
    }

    public void printReceipt(){
        for(Item iterator : items){
            iterator.printItem();
        }
    }

    public int getNumberOfDiscountedItem(){
        for(Item iterator : items){
            if(iterator.discountedItem == true){
                numberOfDiscountedItem++;
            }
        }
        return numberOfDiscountedItem;
    }

    public int sumTotalDiscount(){

        for(Item iterator : items){
            sumDiscount += iterator.getDiscountAmount(); 
        }

        return sumDiscount;
    }

}
