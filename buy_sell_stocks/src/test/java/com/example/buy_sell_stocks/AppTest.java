package com.example.buy_sell_stocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Buy Sell Stock Service.
 */
public class AppTest 
{
    private App app;

    @Before
    public void setup() throws Exception {
        app = new App();
    }

    @After
    public void tearDown() throws Exception { 
        System.out.println("Running :: tearDown"); 
        app = null; 
        assertNull(app);
    }

    private static Map<Integer, List<Integer>> initializeMap(){
        Map<Integer, List<Integer>> pricesMap = new HashMap<>();
        pricesMap.put(5, Arrays.asList(7,1,5,3,6,4));
        pricesMap.put(0, Arrays.asList(7,6,4,3,1));
        return pricesMap;
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnTrue()
    {
        Map<Integer, List<Integer>> hm =  initializeMap();
        for(Map.Entry<Integer, List<Integer>> entry: hm.entrySet()){
            int got = App.maxProfit((List<Integer>) entry.getValue());
            int want = (int) entry.getKey();
            assertEquals(got, want);
        }        

    }
}
