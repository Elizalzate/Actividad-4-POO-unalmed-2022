package Inmuebles;

public class Inmueble {
    protected  int identificadorInmobiliario;
    protected  float area;
    protected  String direccion;
    protected  double precioVenta;

    Inmueble(int identificadorInmobiliario, float area, String direccion){
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.direccion = direccion;
        this.area = area;
    }

    protected double calcularPrecioVenta(double valorArea){
        precioVenta = area * valorArea;
        return  precioVenta;
    }

    void imprimir(){
        System.out.println("Identificador inmobiliario: " + identificadorInmobiliario +
                "\nÁrea del inmueble: " + area + "\nDirección: " + direccion +
                "\nPrecio de venta: $" + precioVenta);
    }

}
