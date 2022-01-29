interface Calculation {

    default int areaOfBox(int length, int breadth, int depth) {
        return length * breadth * depth;
    }

    default int totalGSMOfBox(int extraGSM, int GSM) {
        return extraGSM + GSM * 100;
    }

    // default int totalCost(){}

}
