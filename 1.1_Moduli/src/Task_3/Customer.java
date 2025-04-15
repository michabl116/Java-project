package Task_3;

public class Customer {
    private static int nextId = 1; // Siguiente ID del cliente // Seuraava asiakkaan ID
    private int id; // ID del cliente // Asiakkaan ID
    private long startTime; // Hora de inicio // Aloitusaika
    private long endTime; // Hora de finalización // Lopetusaika

    public Customer(long startTime, long endTime) {
        this.id = nextId++; // Asignar ID único al cliente // Määritä asiakkaalle yksilöllinen ID
        this.startTime = startTime; // Establecer hora de inicio // Aseta aloitusaika
        this.endTime = endTime; // Establecer hora de finalización // Aseta lopetusaika
    }

    // Getters
    public int getId() {
        return id; // Obtener ID del cliente // Hanki asiakkaan ID
    }

    public long getStartTime() {
        return startTime; // Obtener hora de inicio // Hanki aloitusaika
    }

    public long getEndTime() {
        return endTime; // Obtener hora de finalización // Hanki lopetusaika
    }

    // Setters
    public void setStartTime(long startTime) {
        this.startTime = startTime; // Establecer nueva hora de inicio // Aseta uusi aloitusaika
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime; // Establecer nueva hora de finalización // Aseta uusi lopetusaika
    }

    // Méto para calcular el tiempo empleado // Menetelmä käytetyn ajan laskemiseksi
    public long calculateTimeSpent() {
        return endTime - startTime; // Calcular tiempo empleado // Laske käytetty aika
    }

    // Méto para obtener el tiempo empleado en horas y minutos // Menetelmä käytetyn ajan saamiseksi tunneissa ja minuuteissa
    public String getTimeSpentInHoursAndMinutes() {
        long timeSpent = calculateTimeSpent(); // Obtener tiempo empleado // Hanki käytetty aika
        long hours = timeSpent / 3600000; // Convertir milisegundos a horas // Muunna millisekunnit tunneiksi
        long minutes = (timeSpent % 3600000) / 60000; // Convertir el resto a minutos // Muunna loppu minuuteiksi
        return hours + " hours and " + minutes + " minutes"; // Devolver horas y minutos // Palauta tunnit ja minuutit
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Start Time: " + startTime + ", End Time: " + endTime + ", Time Spent: " + getTimeSpentInHoursAndMinutes(); // Formatear salida // Muotoile lähtö
    }
}
