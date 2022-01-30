package vegetableVendor;
class DiscountBill extends VegetableBill {
    private boolean prefredCostumer = false; //Check for prefred costumer

    DiscountBill(Employee employee, boolean prefredCostumer) { //Constructor
        this.prefredCostumer = prefredCostumer;
    }

    public int countDiscountedItem(){ //Number of Discounted Items
        return getNumberOfDiscountedItem();
    }

    public int getDiscountAmount(){ //Get Discounted Amount
        return sumTotalDiscount();
    }
}
