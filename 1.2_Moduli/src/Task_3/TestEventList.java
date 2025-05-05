package Task_3;

public class TestEventList {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Luo tapahtumia ja lisää ne listaan  / Generar eventos y añadirlos a la lista
        eventList.addEvent(new Event("Evento 1", 3)); // Pienempi prioriteetti tarkoittaa aikaisempaa "aikaa" / Menor prioridad significa menor "hora"
        eventList.addEvent(new Event("Evento 2", 1));
        eventList.addEvent(new Event("Evento 3", 5));
        eventList.addEvent(new Event("Evento 6", 2));
        eventList.addEvent(new Event("Evento 8", 4));

        // Poista ensimmäinen tapahtuma / Eliminar el primer evento
        System.out.println("Deleting the first event: " + eventList.removeNextEvent());

        // Tulosta EventList-sisältö prioriteettijärjestyksessä / Imprimir el contenido de la EventList en orden por prioridad
        System.out.println("Remaining events in order of priority:");
        eventList.printEventsOrdered();
    }
}