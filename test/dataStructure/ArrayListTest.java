package dataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    @Test
    public void newListIsEmpty(){
        List list = new ArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void addItemListIsNotEmptyTest(){
        List list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
    }
}
