package Task_7;

import Task_7.distributions.FDistribution;

/**
 * Saapumisprosessi-luokka, joka luo saapumistapahtumia käyttäen F-jakaumaa.
 */
public class ArrivalProcess {
    private FDistribution generator;
    private EventType eventType;

    public ArrivalProcess(long numDegFreedom, long denDegFreedom) {
        this.generator = new FDistribution(numDegFreedom, denDegFreedom);
        this.eventType = EventType.ARRIVAL;
    }

    public void generateArrivals(EventList eventList, Clock clock, int numEvents) {
        int currentTime = clock.getCurrentTime();

        for (int i = 0; i < numEvents; i++) {
            int interval = (int) generator.sample(); // Käytä F-jakaumaa aikavälin luomiseen
            currentTime += interval;
            Event newEvent = new Event(eventType, currentTime);
            eventList.addEvent(newEvent);
            clock.setTime(currentTime); // Päivitä kello viimeisimpään tapahtumaan
        }
    }
}