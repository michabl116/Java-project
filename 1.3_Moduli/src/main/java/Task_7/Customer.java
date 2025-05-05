package Task_7;


/**
 * Asiakas-luokka, joka tallentaa saapumis- ja lähtöajan.
 */
public class Customer {
    private int arrivalTime;
    private Integer departureTime;

    public Customer(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = null;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getTimeInSystem() {
        return (departureTime != null) ? departureTime - arrivalTime : -1;
    }
}
