package vegetableVendor;

public class Item {
    private int price;
    private int discountAmount;
    private int discount;
    private String name;
    private boolean discountedItem = false;

    Item(String name, int price, int discount) {
        this.price = price;
        this.discount = discount;
        this.name = name;
        this.discountedItem = discountedItem;
        this.discountAmount = discountAmount;
    }

    public void setDiscountedItem(){
        this.discountedItem = true;
    }

    public int getPrice(){
        return price;
    }

    public int getDiscountAmount(){
        return discountAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void printItem(){
        int finalAmount = price - discount;
        System.out.println(name + " " + price + " " + discount + " " + finalAmount);
    }
}

