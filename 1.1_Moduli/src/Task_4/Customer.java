package Task_4;

public class Customer {
    private static int nextId = 1; // Seuraava asiakkaan ID // Siguiente ID del cliente
    private int id; // Asiakkaan ID // ID del cliente
    private long startTime; // Aloitusaika // Hora de inicio
    private long endTime; // Lopetusaika // Hora de finalización

    public Customer(long startTime, long endTime) {
        this.id = nextId++; // Määritä asiakkaalle yksilöllinen ID // Asignar ID único al cliente
        this.startTime = startTime; // Aseta aloitusaika // Establecer hora de inicio
        this.endTime = endTime; // Aseta lopetusaika // Establecer hora de finalización
    }

    // Getters
    public int getId() {
        return id; // Hanki asiakkaan ID // Obtener ID del cliente
    }

    public long getStartTime() {
        return startTime; // Hanki aloitusaika // Obtener hora de inicio
    }

    public long getEndTime() {
        return endTime; // Hanki lopetusaika // Obtener hora de finalización
    }

    // Setters
    public void setStartTime(long startTime) {
        this.startTime = startTime; // Aseta uusi aloitusaika // Establecer nueva hora de inicio
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime; // Aseta uusi lopetusaika // Establecer nueva hora de finalización
    }

    // Menetelmä käytetyn ajan laskemiseksi // Méto para calcular el tiempo empleado
    public long calculateTimeSpent() {
        return endTime - startTime; // Laske käytetty aika // Calcular tiempo empleado
    }

    // Menetelmä käytetyn ajan saamiseksi tunneissa ja minuuteissa // Méto para obtener el tiempo empleado en horas y minutos
    public String getTimeSpentInHoursAndMinutes() {
        long timeSpent = calculateTimeSpent(); // Hanki käytetty aika // Obtener tiempo empleado
        long hours = timeSpent / 3600000; // Muunna millisekunnit tunneiksi // Convertir milisegundos a horas
        long minutes = (timeSpent % 3600000) / 60000; // Muunna loppu minuuteiksi // Convertir el resto a minutos
        return hours + " hours and " + minutes + " minutes"; // Palauta tunnit ja minuutit // Devolver horas y minutos
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Start Time: " + startTime + ", End Time: " + endTime + ", Time Spent: " + getTimeSpentInHoursAndMinutes(); // Muotoile lähtö // Formatear salida
    }
}
