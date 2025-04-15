package Task_3;

public class Customer {
    private static int nextId = 1;
    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime, long endTime) {
        this.id = nextId++;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters
    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Setters
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Method to calculate the time spent
    public long calculateTimeSpent() {
        return endTime - startTime;
    }
    public String getTimeSpentInHoursAndMinutes() {
        long timeSpent = calculateTimeSpent();
        long hours = timeSpent / 3600000; // Convertir milisegundos a horas
        long minutes = (timeSpent % 3600000) / 60000; // Convertir el resto a minutos
        return hours + " horas y " + minutes + " minutos";
    }


    @Override
    public String toString() {
        return "Customer ID: " + id + ", Start Time: " + startTime + ", End Time: " + endTime + ", Time Spent: " + getTimeSpentInHoursAndMinutes();

    }
}
