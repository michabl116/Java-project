package Task_4;

public class QueueCustomer extends Customer {
    private long timeInQueue; // Tiempo en cola // Aika jonossa

    public QueueCustomer(long startTime) {
        super(startTime, 0); // Llamar al constructor de la clase padre // Kutsu yliluokan rakentajaa
        this.timeInQueue = System.nanoTime(); // Establecer el tiempo en cola // Aseta aika jonossa
    }

    public long getTimeInQueue() {
        return timeInQueue; // Obtener el tiempo en cola // Hanki aika jonossa
    }

    public long calculateTimeInQueue() {
        return System.nanoTime() - timeInQueue; // Calcular el tiempo en cola // Laske aika jonossa
    }

    @Override
    public String toString() {
        return "Customer ID: " + getId() + ", timeInQueue: " + getTimeInQueue() + " nanoseconds"; // Formatear salida // Muotoile lähtö
    }
}
