package Task_6;

public class Event {
    private String type;
    private long time;

    public Event(String type, long time) {
        this.type = type;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" + "typi='" + type + '\'' + ", aika=" + time + '}';
    }
}