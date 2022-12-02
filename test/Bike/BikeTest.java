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

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically(){
        bike.turnOn();
        assertEquals(1, bike.getGear());
        for(int i =0; i < 20; i++){
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }
    @Test
    public void bikeCanAcclerateOnGearTwoTest(){
        bike.turnOn();
        for(int i = 0; i < 21; i++){
            bike.increaseSpeed();
        }

        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();
        assertEquals(25, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }
    @Test
    public void bikeCanChangeFromGearToGearThree(){
        bike.turnOn();
        for(int i = 0; i < 25; i++){
            bike.increaseSpeed();
        }
        assertEquals(29, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();
        assertEquals(3, bike.getGear());
        assertEquals(31, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearToGearFour(){
        bike.turnOn();
        for(int i = 0; i < 29; i++){
            bike.increaseSpeed();
        }

        assertEquals(40, bike.getSpeed());
        assertEquals(3, bike.getGear());

        bike.increaseSpeed();
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(4, bike.getGear());
        assertEquals(47, bike.getSpeed());
    }

    @Test
    public void bikeSpeedShouldNotBeNegative(){
        bike.turnOn();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(0, bike.getGear());
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeTestThatSpeedCanBeDecrementedByOne(){
        bike.turnOn();
        for(int i = 0; i < 10; i++){
            bike.increaseSpeed();
        }
        assertEquals(1, bike.getGear());
        assertEquals(10, bike.getSpeed());

        for(int i = 0; i < 3; i++){
             bike.decreaseSpeed();;
        }
        assertEquals(1, bike.getGear());
        assertEquals(7, bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(1, bike.getGear());
        assertEquals(6, bike.getSpeed());
    }
    @Test
    public void bikeCanChangeFromGearTwoToOne(){
        bike.turnOn();
        for(int i = 0; i < 25; i++){
            bike.increaseSpeed();
        }
        assertEquals(2, bike.getGear());
        assertEquals(29, bike.getSpeed());
        for(int i = 0; i < 4; i++){
            bike.decreaseSpeed();
        }
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());

        bike.decreaseSpeed();
        assertEquals(1, bike.getGear());
        assertEquals(19, bike.getSpeed());

        bike.decreaseSpeed();
        assertEquals(1, bike.getGear());
        assertEquals(18, bike.getSpeed());
    }
    @Test
    public void bikeCanChangeFromGearThreeToTwo(){
        bike.turnOn();
        for(int i = 0; i < 29; i++){
            bike.increaseSpeed();
        }
        assertEquals(40, bike.getSpeed());
        assertEquals(3, bike.getGear());
        for(int i = 0; i < 3; i++){
            bike.decreaseSpeed();
        }
        assertEquals(31, bike.getSpeed());
        assertEquals(3, bike.getGear());

        bike.decreaseSpeed();
        assertEquals(28, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

}
