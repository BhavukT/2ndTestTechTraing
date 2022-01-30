public class HoneyComb implements Calculation{
    private int length; // Lenght of the box
    private int breadth; // Breadth of the box
    private int depth; // Depth of the box
    private int area; // Area of box
    private int totalGSM; // TotalGsm of the box
    private int extraGSM; // ExtraGsm of the box
    private char fluteType; // Flute type A, B, C, D, E, F
    private Flute flute;
    private String partition; // Partition in a box double or single 
    private int gSM; 
    private String stichingType; //Pins aur Pasting
    private Stiching stiching;
    private int stichingCostOfBox; // Cost Stiching

    HoneyComb(int length, int breadth, int depth, Flute flute, String partition, int gSM, char fluteType, String StringType, Stiching stiching){
        // Constructor
        this.length = length;
        this.depth = depth;
        this.flute = flute;
        this.fluteType = fluteType;
        this.breadth = breadth;
        this.partition = partition;
        this.gSM = gSM;
        this.stiching = stiching;
    }

    

    public int totalCostOfManufacturing(){ // Total cost of Manufacturing
        area = areaOfBox(length, breadth, depth); // Calculate Area
        stichingCostOfBox = stiching.stichingCost(stichingType);
        extraGSM = flute.calcExtraGSM(fluteType);
        totalGSM = totalGSMOfBox(extraGSM, gSM);
        if(partition == "single") // For Single Partition
            return area * extraGSM * totalGSM  * stichingCostOfBox;
        else// For Double Partition
            return area * extraGSM * totalGSM  * stichingCostOfBox * 3;
    }
}
