package Task_3;

public class CustomerTest {

    public static void main(String[] args) {
        // Obtener la hora actual en milisegundos // Hanki nykyinen aika millisekunteina
        long currentTime = System.currentTimeMillis();

        // Crear clientes con diferentes tiempos de uso // Luo asiakkaita eri käyttöajoilla
        Customer customer1 = new Customer(currentTime, currentTime + 1800000); // 30 minutos después // 30 minuuttia myöhemmin
        Customer customer2 = new Customer(currentTime + 3600000, currentTime + 7200000); // 1 hora después, duración de 1 hora // 1 tunti myöhemmin, kesto 1 tunti

        // Imprimir detalles de los clientes // Tulosta asiakkaiden tiedot
        System.out.println(customer1); // Imprimir detalles del cliente // Tulosta asiakkaan tiedot
        System.out.println(customer2); // Imprimir detalles del cliente // Tulosta asiakkaan tiedot

        // Verificar el cálculo del tiempo empleado en horas y minutos // Vahvista käytetyn ajan laskeminen tunneissa ja minuuteissa
        System.out.println("time spent by client 1: " + customer1.getTimeSpentInHoursAndMinutes()); // Tiempo empleado por el cliente 1 // Asiakkaan 1 käyttämä aika
        System.out.println("time spent by client 2: " + customer2.getTimeSpentInHoursAndMinutes()); // Tiempo empleado por el cliente 2 // Asiakkaan 2 käyttämä aika
    }
}
