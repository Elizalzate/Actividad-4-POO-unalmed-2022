public class CuentaAhorros extends  Cuenta{
    private boolean isActiva;
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        isActiva = !(saldo < 10000);
    }
    protected void consignar(float consignacion) {
        if(isActiva){
            super.consignar(consignacion);
        }
    }
    protected void retirar(float retiro) {
        if(isActiva){
            super.retirar(retiro);
        }
    }

}
