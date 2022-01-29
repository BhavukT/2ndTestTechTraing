package vegetableVendor;
class DiscountBill extends VegetableBill {
    private boolean prefredCostumer = false;

    DiscountBill(Employee employee, boolean prefredCostumer) {
        this.prefredCostumer = prefredCostumer;
    }

    public int countDiscountedItem(){
        return getNumberOfDiscountedItem();
    }

    public int getDiscountAmount(){
        return sumTotalDiscount();
    }
}
