package Debugging_Testing.Test2;

import Debugging_Testing.UnitTest.Price;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void add() {
        Calculator p=new Calculator(5,2);
        Assertions.assertEquals(7, p.add());
    }

    @org.junit.jupiter.api.Test
    public void sub(){
        Calculator c= new Calculator(5,2);
        Assertions.assertEquals(3, c.subt());
    }


    }
