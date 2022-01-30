interface Calculation {

    default int areaOfBox(int length, int breadth, int depth) { // ARea Calculate
        return length * breadth * depth;
    }

    default int totalGSMOfBox(int extraGSM, int GSM) { // Total GSM Cost
        return extraGSM + GSM * 100;
    }

    // default int totalCost(){}

}
