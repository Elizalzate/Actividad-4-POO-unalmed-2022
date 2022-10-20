package Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numeroHabitaciones;
    protected int numeroBanios;

    InmuebleVivienda(int identificadorInmobiliario, float area, String direccion,
                     int numeroHabitaciones, int numeroBanios) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanios = numeroBanios;
    }

    void imprimir(){
        System.out.println("Número de habitaciones: " + numeroHabitaciones +
                "\nNúmero de baños: " + numeroBanios);
    }
}
