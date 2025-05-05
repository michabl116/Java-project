package Task_7;



import java.util.LinkedList;
import java.util.Queue;

/**
 * Palvelupiste-luokka, joka hallinnoi asiakasjonoa ja käsittelee poistumiset.
 */
public class ServicePoint {
    private Queue<Customer> queue;

    public ServicePoint() {
        this.queue = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public Integer processCustomer(Clock clock) {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            customer.setDepartureTime(clock.getCurrentTime());
            return customer.getTimeInSystem();
        }
        return null;
    }
}
