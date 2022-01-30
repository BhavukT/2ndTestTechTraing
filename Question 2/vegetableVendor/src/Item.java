package vegetableVendor;

public class Item {
    private int price; // Price of the item
    private int discountAmount; // Discount Amount on Item
    private int discount;
    private String name; //Name of the Item
    private boolean discountedItem = false; // Is the Iem is Discounted

    Item(String name, int price, int discount) { //Constructor
        this.price = price;
        this.discount = discount;
        this.name = name;
        this.discountedItem = discountedItem;
        this.discountAmount = discountAmount;
    }

    public void setDiscountedItem(){ // Set Discounted Item
        this.discountedItem = true;
    }

    public int getPrice(){ // Get Price of The Item
        return price;
    }

    public int getDiscountAmount(){ // Get Discount Amount of The Item
        return discountAmount;
    }

    public int getDiscount() { // Get Discount Amount
        return discount;
    }

    public void printItem(){ // Print Item In the Bill
        int finalAmount = price - discount;
        System.out.println(name + " " + price + " " + discount + " " + finalAmount);
    }
}

