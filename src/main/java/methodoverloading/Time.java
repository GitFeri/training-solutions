package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(Time time) {
        hours = time.hours;
        minutes = time.minutes;
        seconds = time.seconds;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        return isEqual(time.hours, time.minutes, time.seconds);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return totalInSeconds(hours, minutes, seconds) == totalInSeconds(this.hours, this.minutes, this.seconds);
    }

    public boolean isEarlier(Time time) {
        return isEarlier(time.hours, time.minutes, time.seconds);
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return totalInSeconds(hours, minutes, seconds) > totalInSeconds(this.hours, this.minutes, this.seconds);
    }

    private int totalInSeconds(int hours, int minutes, int seconds) {
        return (((hours * 24) + minutes) * 60) + seconds;
    }
}
