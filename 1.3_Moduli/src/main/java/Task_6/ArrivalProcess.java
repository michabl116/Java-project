package Task_6;

import Task_6.distributions.FDistribution;
import java.util.*;

public class ArrivalProcess {
    private FDistribution fDistribution; // Generador basado en la distribución F
    private String eventType; // Tipo de evento

    // Constructor: inicializa el tipo de evento y el generador de números aleatorios
    public ArrivalProcess(String eventType, long numDegFreedom, long denDegFreedom) {
        this.eventType = eventType;
        this.fDistribution = new FDistribution(numDegFreedom, denDegFreedom);
    }

    // Méto para agregar un nuevo evento a la lista de eventos
    public void addEvent(List<Event> eventList, Clock clock) {
        long arrivalTime = clock.getAika() + generateArrivalInterval();
        clock.setAika(arrivalTime); // Ajustar el reloj a la nueva hora del evento
        eventList.add(new Event(eventType, arrivalTime));
    }

    // Méto para generar un intervalo de llegada aleatorio usando la distribución F
    private long generateArrivalInterval() {
        return (long) (fDistribution.sample() * 1000); // Escalamos el valor para obtener milisegundos
    }
}