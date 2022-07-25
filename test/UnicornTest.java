import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class UnicornTest {

    @Test
    public void arrayTest(){
        int[] a = {11, 21, 3, 7, 60, 8, 10, 19, 18, 34, 57};
        int[] b = new int[34];

        for(int i = 0; i < 11; i++){
            assertTrue(b[i] == 0);
        }

        System.arraycopy(a, 0, b, 0, 11);
        for(int i = 0; i < a.length; i++){
            assertEquals(a[i], b[i]);
        }
    }

}
