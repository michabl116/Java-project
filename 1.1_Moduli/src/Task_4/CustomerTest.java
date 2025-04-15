package Task_4;

import java.util.Scanner;
import java.util.LinkedList;

public class CustomerTest {

    public static void main(String[] args) {
        LinkedList<QueueCustomer> queue = new LinkedList<>(); // Cambiar "cola" a "queue" // Muuta "cola" "queueksi"
        Scanner sc = new Scanner(System.in);
        String action; // Cambiar "accion" a "action" // Muuta "accion" "actioniksi"

        while (true) {
            System.out.println("Enter 'add' to add a customer to the queue, 'remove' to remove a customer from the queue, or 'exit' to finish:"); // Cambiar el mensaje a inglés // Muuta viesti englanniksi
            action = sc.nextLine();

            if (action.equalsIgnoreCase("add")) { // Cambiar "poner" a "add" // Muuta "poner" "addiksi"
                QueueCustomer newCustomer = new QueueCustomer(System.nanoTime()); // Cambiar "nuevoCliente" a "newCustomer" // Muuta "nuevoCliente" "newCustomeriksi"
                queue.addFirst(newCustomer); // Cambiar "cola" a "queue" // Muuta "cola" "queueksi"
                System.out.println("Customer ID: " + newCustomer.getId() + " added to the queue."); // Cambiar el mensaje a inglés // Muuta viesti englanniksi
            } else if (action.equalsIgnoreCase("remove")) { // Cambiar "retirar" a "remove" // Muuta "retirar" "removeksi"
                if (!queue.isEmpty()) { // Cambiar "cola" a "queue" // Muuta "cola" "queueksi"
                    QueueCustomer customer = queue.removeLast(); // Cambiar "cliente" a "customer" y "cola" a "queue" // Muuta "cliente" "customeriksi" ja "cola" "queueksi"
                    customer.setEndTime(System.nanoTime());
                    System.out.println("Customer " + customer.getId() + " removed from the queue. Time in queue: " + customer.calculateTimeInQueue() + " nanoseconds."); // Cambiar el mensaje a inglés // Muuta viesti englanniksi
                } else {
                    System.out.println("No customers in the queue."); // Cambiar el mensaje a inglés // Muuta viesti englanniksi
                }
            } else if (action.equalsIgnoreCase("exit")) { // Cambiar "salir" a "exit" // Muuta "salir" "exitiksi"
                break;
            } else {
                System.out.println("Invalid action. Please try again."); // Cambiar el mensaje a inglés // Muuta viesti englanniksi
            }
        }

        sc.close();
    }
}
