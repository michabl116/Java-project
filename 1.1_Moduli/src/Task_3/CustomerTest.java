package Task_3;
public class CustomerTest {

        public static void main(String[] args) {
            // Obtener la hora actual en milisegundos
            long currentTime = System.currentTimeMillis();

            // Crear clientes con diferentes tiempos de uso
            Customer customer1 = new Customer(currentTime, currentTime + 1800000); // 30 minutos después
            Customer customer2 = new Customer(currentTime + 3600000, currentTime + 7200000); // 1 hora después, duración de 1 hora

            // Imprimir detalles de los clientes
            System.out.println(customer1);
            System.out.println(customer2);

            // Verificar el cálculo del tiempo empleado en horas y minutos
            System.out.println("Tiempo empleado por el cliente 1: " + customer1.getTimeSpentInHoursAndMinutes());
            System.out.println("Tiempo empleado por el cliente 2: " + customer2.getTimeSpentInHoursAndMinutes());

    }

}
