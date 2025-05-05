package Task_7;



/**
 * Tapahtuma-luokka, joka tallentaa tapahtuman tyypin ja ajan.
 */
public class Event {
    private EventType eventType;
    private int time;

    public Event(EventType eventType, int time) {
        this.eventType = eventType;
        this.time = time;
    }

    public EventType getEventType() {
        return eventType;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Tapahtuma{" + "tyyppi=" + eventType + ", aika=" + time + '}';
    }
}
