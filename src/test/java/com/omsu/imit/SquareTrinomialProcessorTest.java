package com.omsu.imit;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTrinomialProcessorTest {
    @Test
    public void maxDecisionTest(){
        SquareTrinomialProcessor temp = new SquareTrinomialProcessor(1,-70,600);
        assertEquals("Ошибка поиска макс. корня! [1/2]",60,temp.maxDecision(),0.0001);
        temp = new SquareTrinomialProcessor(3,-18,27);
        assertEquals("Ошибка поиска макс. корня! [2/2]",3,temp.maxDecision(),0.0001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void maxDecisionTest1(){
        SquareTrinomialProcessor temp = new SquareTrinomialProcessor(1,2,3);
        temp.maxDecision();
    }
}