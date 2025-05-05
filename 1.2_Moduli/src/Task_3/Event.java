package Task_3;

class Event implements Comparable<Event> {
    private String name;
    private int time; // Edustaa "aikaa" kokonaislukuna / Representa la "hora" como un número entero

    public Event(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name; // Palauttaa tapahtuman nimen / Devuelve el nombre del evento
    }

    public int getPriority() {
        return time; // Palauttaa tapahtuman prioriteetin / Devuelve la prioridad del evento
    }

    public void setPriority(int time) {
        this.time = time; // Asettaa tapahtuman prioriteetin / Establece la prioridad del evento
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.time, other.time); // Järjestää nousevassa järjestyksessä prioriteetin mukaan / Orden ascendente por prioridad
    }

    @Override
    public String toString() {
        return "Evento: " + name + ", Prioridad: " + time; // Palauttaa tapahtuman tiedot merkkijonona / Devuelve los detalles del evento como cadena
    }
}