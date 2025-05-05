package Task_7;



/**
 * Kello-luokka, joka hallinnoi simulaation aikaa.
 */
public class Clock {
    private int currentTime;

    public Clock() {
        this.currentTime = 0;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void advanceTime(int timeUnits) {
        this.currentTime += timeUnits;
    }

    public void setTime(int newTime) {
        this.currentTime = newTime;
    }
}