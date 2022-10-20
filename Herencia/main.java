public class main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100, 10);
        cuenta.imprimir();
        cuenta.consignar(100);
        cuenta.imprimir();
        cuenta.retirar(300);
    }
}
