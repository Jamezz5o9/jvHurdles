package Bike;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;
    public boolean isOn(){
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        gear = 1;
        speed = 0;
    }

    public void turnOff() {
        isOn = false;
        gear = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void increaseSpeed() {
       if(isOn) accelerate();
    }

    private void accelerate() {
        if(gear == 4) speed += 4;

        if(gear == 3)increaseGearOnGearThree();

        if(gear == 2)increaseSpeedOnGearTwo();

        if(gear == 1)increaseSpeedOnGearOne();

    }

    private void increaseGearOnGearThree() {
        speed += 3;
        if(speed >= 41) gear++;
    }

    private void increaseSpeedOnGearTwo() {
        speed += 2;
        if(speed >= 31) gear++;
    }

    private void increaseSpeedOnGearOne() {
        speed++;
        if(speed > 20) gear++;
    }

    public void decreaseSpeed() {
        if(isOn) decelerate();
    }

    private void decelerate() {

        if(gear == 1) decreaseSpeedOnGearOne();
        if(gear == 2) decreaseTwoGear();
        if(gear == 3) decreaseThreeGear();
        if(gear == 4) decreaseFourGear();
    }

    private void decreaseSpeedOnGearOne() {
      speed--;
      if(speed < 1){
          speed = 0;
          gear = 0;
      }
    }
    private void decreaseTwoGear() {
        speed -= 2;
        if(speed < 21) gear--;
    }
    private void decreaseThreeGear() {
        speed -= 3;
        if(speed < 31) gear--;
    }

    private void decreaseFourGear() {
        if(speed < 41) gear--;
        speed -= 4;
    }
}
