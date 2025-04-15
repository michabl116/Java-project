package Task_4;

import java.util.Scanner;
import java.util.LinkedList;

public class CustomerTest {

    public static void main(String[] args) {
        LinkedList<QueueCustomer> cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String accion;

        while (true) {
            System.out.println("Ingrese 'poner' para agregar un cliente a la cola, 'retirar' para retirar un cliente de la cola, o 'salir' para terminar:");
            accion = sc.nextLine();

            if (accion.equalsIgnoreCase("poner")) {
                QueueCustomer nuevoCliente = new QueueCustomer(System.nanoTime());
                cola.addFirst(nuevoCliente);
                System.out.println("Cliente ID: " + nuevoCliente.getId() + " agregado a la cola.");
            } else if (accion.equalsIgnoreCase("retirar")) {
                if (!cola.isEmpty()) {
                    QueueCustomer cliente = cola.removeLast();
                    cliente.setEndTime(System.nanoTime());
                    System.out.println("Cliente " + cliente.getId() + " retirado de la cola. Tiempo en cola: " + cliente.calcularTiempoEnCola() + " nanosegundos.");
                } else {
                    System.out.println("No hay clientes en la cola.");
                }
            } else if (accion.equalsIgnoreCase("salir")) {
                break;
            } else {
                System.out.println("Acción no válida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}
