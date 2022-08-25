package Chapter8;
public class Time {
    private int minute;
    private int second;
    private int hour;

    public Time(int minute, int second, int hour) {
        validate(minute, second, hour);

        this.minute = minute;
        this.second = second;
        this.hour = hour;

    }
    private static void validate(int minute, int second, int hour) {
        validateSecond(second);
        validateMinute(minute);
        validateHour(hour);
    }

    private static void validateSecond(int second) {
        if(second < 0 || second > 59) throw new IllegalArgumentException(String.format("Second entered is %s, please enter seconds between 0 and 59", second));
    }

    private static void validateMinute(int minute) {
        if(minute < 0 || minute > 59) throw new IllegalArgumentException(String.format("Minute entered is %s, please enter minutes between 0 and 59", minute));
    }

    private static void validateHour(int hour) {
        if(hour < 0 || hour > 23) throw new IllegalArgumentException(String.format("Hour entered is %s, please enter hour between 0 and 23", hour));
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
       validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }
}


