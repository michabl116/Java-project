package Task_4;

public class QueueCustomer extends Customer {
    private  long tienpoEnCola;

    public QueueCustomer(long startTime) {
        super(startTime,0);
        this.tienpoEnCola = System.nanoTime();


    }
    public long getTienpoEnCola() {
        return tienpoEnCola;
    }
    public  long calcularTiempoEnCola() {
        return System.nanoTime() - tienpoEnCola;
    }
    @Override
    public String toString() {
        return "Cliente ID:" + getId() + " tienpoEnCola:" + getTienpoEnCola() + "nanosegudos";
    }

}
