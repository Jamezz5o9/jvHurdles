import Chapter9.SimpleAnimal;
import Chapter9.secondSimpleAnimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalTest {
    private SimpleAnimal simpleAnimal;
    private SimpleAnimal dangerousAnimal;

    private secondSimpleAnimal salaryPaid;

    @BeforeEach
    public void setUp(){
       simpleAnimal = new SimpleAnimal("Eagle", "Goat", "Earthworms", "Millipedes",
               "Bolaji Loves Eating rice", "Manchester is playing Burnley", "Adunni is sleeping since morning");
       dangerousAnimal = new SimpleAnimal();
       salaryPaid = new secondSimpleAnimal(3000, 15);
    }

    @Test
    public void checkSalaryIsNotNull(){
        assertNotNull(salaryPaid);
    }

    @Test
    public void workersWasPaidCorrectSalary(){
       assertEquals(48000, salaryPaid.calcMonthlySalary());

    }

    @Test
    public void testThatSimpleAnimalIsNotNull(){
        assertNotNull(simpleAnimal);
    }

    @Test
    public void testThatAdunniIsSleeping(){
        assertEquals("Adunni is sleeping since morning", simpleAnimal.getSleep());
    }

    @Test
    public void testThatBolajiIsEating(){
        simpleAnimal.setEat("Bolaji is sleeping because he is tired");
        assertEquals("Bolaji is sleeping because he is tired", simpleAnimal.getEat());
    }

    @Test
    public void checkCategoriesOfAnnelids(){
        simpleAnimal.setAnnelida("Bristle worms");
        assertEquals("Bristle worms", simpleAnimal.getAnnelida());
    }

    @Test
    public void checkForDangerousAnimalInMammalsCategory(){
        dangerousAnimal.setMammals("Lions");
        assertEquals("Lions", dangerousAnimal.getMammals());
    }

    @Test
    public void testWorkersSalary(){

    }
}
