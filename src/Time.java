/**
 * Created by gustavbodestad on 2016-05-13.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public String setTime(int setHour, int setMinute, int setSecond) {
        if (setHour >= 0 && setHour <= 24 && setMinute >= 0 && setMinute <= 60 && setSecond >= 0 && setSecond <= 60) {
            hour = setHour;
            minute = setMinute;
            second = setSecond;
            return showTime();
        }
        return null;
    }

    public String showTime() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
