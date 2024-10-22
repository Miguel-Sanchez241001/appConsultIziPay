package pe.com.bn.app.view.model;

import java.io.Serializable;

public class Movimiento implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fechaTxn;
    private String descripcionTxn;
    private String monedaOriginalTxn;
    private double montoTxn;
    private double sigMontoTxn;
    private String operacion;
    private String codAutorizacion;
    private String numTarjeta;

    // Getters y Setters

    public String getFechaTxn() {
        return fechaTxn;
    }

    public void setFechaTxn(String fechaTxn) {
        this.fechaTxn = fechaTxn;
    }

    public String getDescripcionTxn() {
        return descripcionTxn;
    }

    public void setDescripcionTxn(String descripcionTxn) {
        this.descripcionTxn = descripcionTxn;
    }

    public String getMonedaOriginalTxn() {
        return monedaOriginalTxn;
    }

    public void setMonedaOriginalTxn(String monedaOriginalTxn) {
        this.monedaOriginalTxn = monedaOriginalTxn;
    }

    public double getMontoTxn() {
        return montoTxn;
    }

    public void setMontoTxn(double montoTxn) {
        this.montoTxn = montoTxn;
    }

    public double getSigMontoTxn() {
        return sigMontoTxn;
    }

    public void setSigMontoTxn(double sigMontoTxn) {
        this.sigMontoTxn = sigMontoTxn;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getCodAutorizacion() {
        return codAutorizacion;
    }

    public void setCodAutorizacion(String codAutorizacion) {
        this.codAutorizacion = codAutorizacion;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
}
