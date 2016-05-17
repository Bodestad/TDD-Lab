/**
 * Created by gustavbodestad on 2016-05-13.
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    public String setDate(int setYear, int setMonth, int setDay) {
        if (setYear >= 2000 && setYear <= 2100 && setMonth >= 1 && setMonth <= 12 && setDay >= 1 && setDay <= 31) {
            year = setYear;
            month = setMonth;
            day = setDay;
            return showDate();
        }
        return null;
    }

    public String showDate() {
        return year + "/" + month + "/" + day;
    }
}
