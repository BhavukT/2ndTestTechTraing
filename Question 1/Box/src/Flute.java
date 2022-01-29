class Flute {
    
    public int calcExtraGSM(char flute){
        if(flute == 'A'){
            return 10;
        }
        else if(flute == 'G' || flute == 'C'){
            return 20;
        }
        else if(flute == 'B'){
            return 30;
        }
        else if(flute == 'E'){
            return 40;
        }
        else{
            return 50;
        }
    }

}
