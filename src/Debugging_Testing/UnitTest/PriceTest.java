package Debugging_Testing.UnitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PriceTest {

    @org.junit.jupiter.api.Test
    public void setKurus() {
        Price p=new Price(0,100);
        assertEquals(0,p.getKurus());
    }

    @org.junit.jupiter.api.Test
    public void add(){
        Price n=new Price(5,20);
        Price m=new Price(2,50);
        n.add(m);
        assertEquals(7,n.getLira());
        assertEquals(70,n.getKurus());

    }
}