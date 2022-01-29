public class HoneyComb implements Calculation{
    private int length;
    private int breadth;
    private int depth;
    private int area;
    private int totalGSM;
    private int extraGSM;
    private char fluteType;
    private Flute flute;
    private String partition;
    private int gSM; 
    private String stichingType;
    private Stiching stiching;
    private int stichingCostOfBox;

    HoneyComb(int length, int breadth, int depth, Flute flute, String partition, int gSM, char fluteType, String StringType, Stiching stiching){
        this.length = length;
        this.depth = depth;
        this.flute = flute;
        this.fluteType = fluteType;
        this.breadth = breadth;
        this.partition = partition;
        this.gSM = gSM;
        this.stiching = stiching;
    }

    

    public int totalCostOfManufacturing(){
        area = areaOfBox(length, breadth, depth);
        stichingCostOfBox = stiching.stichingCost(stichingType);
        extraGSM = flute.calcExtraGSM(fluteType);
        totalGSM = totalGSMOfBox(extraGSM, gSM);
        if(partition == "single")
            return area * extraGSM * totalGSM  * stichingCostOfBox;
        else
            return area * extraGSM * totalGSM  * stichingCostOfBox * 3;
    }
}
