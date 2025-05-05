

package Task_6;

import java.util.*;

public class ArrivalProcessTest {
    public static void main(String[] args) {
        // Crear el reloj
        Clock clock = Clock.getInstance();

        // Crear la lista de eventos
        List<Event> eventList = new ArrayList<>();

        // Crear el ArrivalProcess con distribución F (ejemplo: 5 y 10 grados de libertad)
        ArrivalProcess arrivalProcess = new ArrivalProcess("saapumis", 5, 10);

        // Generar 10 eventos de llegada
        for (int i = 0; i < 10; i++) {
            arrivalProcess.addEvent(eventList, clock);
        }

        // Imprimir la lista de eventos
        System.out.println("Luettelo luoduista tapahtumista:");
        for (Event event : eventList) {
            System.out.println(event);
        }
    }
}
