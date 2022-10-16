import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.util.*;

public class Cuenta {

    // atributos
    protected float saldo;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;

    HashMap<String, String> data = new HashMap<String, String>();

    // constructor
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    protected void consignar(float consignacion){
        numeroConsignaciones += 1;
        saldo += consignacion;
    }

    protected void retirar(float retiro){
        if(saldo - retiro < 0){
            System.out.println("El saldo es insuficiente");
        }
        else {
            numeroRetiros += 1;
            saldo -= retiro;
        }
    }

    protected void calcularInteresMensual(){
        saldo += saldo*(tasaAnual/12);
    }

    protected void generarExtracto(){
        saldo -= comisionMensual;
        calcularInteresMensual();
    }
    private void settearDatos(){
        data.put("Saldo", String.valueOf(saldo));
        data.put("Número de consignaciones", String.valueOf(numeroConsignaciones));
        data.put("Número de retiros", String.valueOf(numeroRetiros));
        data.put("Comisión mensual", String.valueOf(comisionMensual));
        data.put("Tasa anual", String.valueOf(tasaAnual));
    }

    protected void consultar(){
        settearDatos();
        JSONObject json = new JSONObject(data);
        System.out.println(json);
    }

}
