package Task_3;

import java.util.PriorityQueue;

class EventList {
    private PriorityQueue<Event> eventQueue; // Tapahtumajono prioriteettijärjestyksessä / Cola de eventos en orden de prioridad

    public EventList() {
        eventQueue = new PriorityQueue<>(); // Luo tyhjän prioriteettijonon / Crea una cola de prioridad vacía
    }

    public void addEvent(Event event) {
        eventQueue.add(event); // Lisää tapahtuman jonoon / Añade un evento a la cola
    }

    public Event removeNextEvent() {
        return eventQueue.poll(); // Palauttaa ja poistaa seuraavan tapahtuman / Recupera y elimina el próximo evento
    }

    public void printEventsOrdered() {
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(eventQueue); // Luo väliaikaisen kopion jonosta / Crea una copia temporal de la cola
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll()); // Tulostaa tapahtumat järjestyksessä / Imprime los eventos en orden
        }
    }
}