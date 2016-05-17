/**
 * Created by gustavbodestad on 2016-05-13.
 */
public class Clock {

    private Time time;
    private Date date;
    private String state;

    public Clock() {
        time = new Time();
        date = new Date();
        state = "S1";
    }

    public String changeMode() {

        if(state == "S1" ) {
            state = "S2";
            return date.showDate();

        } else if( state == "S2") {
            state = "S2";
            return time.showTime();

        } else {

        return null;
    }
    }

    public String reset() {
        if (state == "S1") {
            state = "S3";
            return "Alter Time";

        } else if(state == "S2") {
            state = "S4";
            return "Alter Date";
        }else {

            return null;
        }
    }

    public String set(int p1, int p2, int p3) {
        if (state == "S3") {
            state = "S1";
            return time.setTime(p1, p2, p3);

        } else if (state == "S4") {
            state = "S2";
            return date.setDate(p1, p2, p3);
        } else{

                return null;
            }
        }
    }

