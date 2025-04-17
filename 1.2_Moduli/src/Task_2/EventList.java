package Task_2;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public Event removeNextEvent() {
        return eventQueue.poll(); // Recupera y elimina el próximo evento
    }

    public void printEventsOrdered() {
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(eventQueue); // Copia temporal
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll()); // Recupera los eventos en orden
        }
    }

}
