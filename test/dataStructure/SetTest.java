package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    Set mySet;

    @BeforeEach
    void setUp(){
        mySet = new Set();
    }

    @Test
    public void addOneElementSizeOnteTest(){

        mySet.addString("G-String");
        assertEquals(1, mySet.size());
    }

    @Test
    public void addXTwiceElementsSizeIsOneTest(){

    }
}
