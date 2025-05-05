package Task_7;

/**
 * Simulaatiotesti-luokka, joka suorittaa koko prosessin.
 */
public class SimulationTest {
    public static void main(String[] args) {
        Clock clock = new Clock();
        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(5, 10); // Käytä F-jakaumaa
        ServicePoint servicePoint = new ServicePoint();

        // Luo 10 saapumistapahtumaa
        arrivalProcess.generateArrivals(eventList, clock, 10);

        // Tulosta luodut tapahtumat
        System.out.println("Luodut tapahtumat:");
        eventList.printEvents();

        // Käsittele saapumistapahtumat (kello ei liiku tässä vaiheessa)
        while (!eventList.isEmpty()) {
            Event event = eventList.getNextEvent();
            Customer customer = new Customer(event.getTime());
            servicePoint.addCustomer(customer);
            System.out.println("Asiakas saapuu aikaan " + customer.getArrivalTime());
        }

        // Siirrä kelloa eteenpäin
        clock.advanceTime(5);
        System.out.println("\nKello siirtyy aikaan " + clock.getCurrentTime() + "\n");

        // Käsittele asiakkaat palvelupisteessä
        while (true) {
            Integer timeInSystem = servicePoint.processCustomer(clock);
            if (timeInSystem == null) break;
            System.out.println("Asiakas käsitelty, aika järjestelmässä: " + timeInSystem);
        }
    }
}