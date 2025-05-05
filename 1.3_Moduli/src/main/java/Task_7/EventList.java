package Task_7;



import java.util.ArrayList;
import java.util.List;

/**
 * Tapahtumalistaluokka, joka hallinnoi tapahtumia aikajärjestyksessä.
 */
public class EventList {
    private List<Event> events;

    public EventList() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        if (!events.isEmpty()) {
            return events.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return events.isEmpty();
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }
}
