public class main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100, 10);
        cuenta.consultar();
        cuenta.consignar(100);
        cuenta.consultar();
        cuenta.retirar(300);
    }
}
