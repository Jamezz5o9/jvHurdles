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
        if(second < 0 || second > 59) throw new IllegalArgumentException(String.format("Second entered is %s, please enter seconds between 0 and 59", second));
        if(minute < 0 || minute > 59) throw new IllegalArgumentException(String.format("Minute entered is %s, please enter minutes between 0 and 59", minute));
        if(hour < 0 || hour > 23) throw new IllegalArgumentException(String.format("Hour entered is %s, please enter hour between 0 and 23", hour));
    }
}
