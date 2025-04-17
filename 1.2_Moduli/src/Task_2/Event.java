package Task_2;

class Event implements Comparable<Event> {
    private String name;
    private long time; // Hora del evento en formato de epoch time (milisegundos)

    public Event(String name, long time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.time, other.time); // Orden ascendente por hora del evento
    }

    @Override
    public String toString() {
        return "Evento: " + name + ", Hora: " + time;
    }
}
