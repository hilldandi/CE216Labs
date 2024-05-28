package Debugging_Testing.UnitTest;

public class Price {
    private int lira;
    private int kurus;

    public Price(int lira,int kurus){
        setKurus(kurus);
        setLira(lira);
    }

    public void setLira(int lira) {
        this.lira = lira;
    }

    public void setKurus(int kurus) {

        if(kurus>=100){
            lira+=kurus/100;
            kurus=kurus%100;
            this.kurus = kurus;
        }
        else {
            this.kurus = kurus;
        }
    }

    public int getLira() {
        return lira;
    }

    public int getKurus() {
        return kurus;
    }

    public void add(Price p){
        setKurus(getKurus()+p.getKurus());
        setLira(getLira()+p.getLira());
    }
}

