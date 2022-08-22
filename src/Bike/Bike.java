package Bike;

public class Bike {
    private boolean isOn;
    private int speed;
    public boolean isOn(){
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return 1;
    }

    public void increaseSpeed() {
        speed++;
    }
}
