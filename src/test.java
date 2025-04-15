public class test {
    public static void main(String[] args) {
        int arrival = 3;

// main simulation loop, t represent the number of the current time-slice
        for (int t = 0; t <= 24; t++) {
            System.out.print("Time "+t +"min: ");
            if (arrival == 0) {
                // new call has arrived
                System.out.print("New call #"+ call +" received ");
                arrival = 3;

                // do here what you need to do with the call just arrived



            }

            // update time delay counters
            arrival--; System.out.println("");
        }
    }
}
