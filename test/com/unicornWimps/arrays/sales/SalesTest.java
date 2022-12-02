package com.unicornWimps.arrays.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SalesTest {
        private Sales james;
        private Item iphone;
        private Item samsung;
        private Item[] itemSold = new Item[1];

        @BeforeEach
        public void setUp(){
                james = new Sales();
                iphone = new Item(4000);
                itemSold[0] = iphone;
                james.setItems(itemSold);
               //  itemSold[1] = samsung;
        }

        @Test
        public void addItems(){
            //  assertNull(james.getItems());
              itemSold[0] = iphone;
              james.setItems(itemSold);
              assertEquals(1, james.getItems().length);
              Item itemSold = james.getItems()[0];
              assertEquals(4000, itemSold.getValue());

              Scanner input = new Scanner(System.in);
        }

        @Test
        public void calculateEarnings(){
            assertEquals(1, james.getItems().length);
            Item itemSold = james.getItems()[0];
            assertEquals(4000, itemSold.getValue());
            assertEquals(560, james.calculateEarning());
        }
    @Test
    public void calculateEarningsWithMultipleteItems(){
        assertEquals(1, james.getItems().length);
        Item itemSold = james.getItems()[0];
        assertEquals(4000, itemSold.getValue());

        Item samsung = new Item(2000);
        Item itel = new Item(200);
        Item dell = new Item(5000);
        Item hp = new Item(4500);
        Item iPhone = new Item(5000);

        Item[] itemsSold = {iPhone, samsung, itel, dell, hp};
        james.setItems(itemsSold);
        assertEquals(5, james.getItems().length);

        assertEquals(1703.0, james.calculateEarning());
    }








    
}
