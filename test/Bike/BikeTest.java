package Bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;
    @BeforeEach
    void setUp(){
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOnTest(){

        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

    }

    @Test
    public void bikeCanBeTurnedOffTest(){
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void bikeCanAccelerateOnGearOneTest(){
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeWillNotAccelerateWhenBikeIsTurnedOff(){

        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());

    }
}
