package Task_2;

public class TestEventList {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Generar eventos y añadirlos a la lista
        eventList.addEvent(new Event("Evento 1", 1679504000000L)); // Ejemplo de timestamp
        eventList.addEvent(new Event("Evento 2", 1679590400000L));
        eventList.addEvent(new Event("Evento 3", 1679676800000L));

        // Eliminar el primer evento
        System.out.println("Eliminando el primer evento: " + eventList.removeNextEvent());

        // Imprimir el contenido de la EventList en orden por hora
        System.out.println("Eventos restantes en orden cronológico:");
        eventList.printEventsOrdered();
    }

}
