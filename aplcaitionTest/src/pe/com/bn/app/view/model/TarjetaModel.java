package pe.com.bn.app.view.model;

import java.io.Serializable;
import java.util.List;

import pe.com.bn.app.view.model.TarjetaDatos;

public class TarjetaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numTarjeta;
    private TarjetaDatos tarjetaDatos;
    private TarjetaCuentaDatos cuentaDatos;
    private DatosDNI datosDNI;
    private ConsultaMovimientosExpediente expedienteMovimientos;  

    private boolean busquedaRealizada; 
    
    public ConsultaMovimientosExpediente getExpedienteMovimientos() {
		return expedienteMovimientos;
	}
	public void setExpedienteMovimientos(ConsultaMovimientosExpediente expedienteMovimientos) {
		this.expedienteMovimientos = expedienteMovimientos;
	}

 
 

    public boolean isBusquedaRealizada() {
		return busquedaRealizada;
	}
	public void setBusquedaRealizada(boolean busquedaRealizada) {
		this.busquedaRealizada = busquedaRealizada;
	}
     public TarjetaCuentaDatos getCuentaDatos() {
        return cuentaDatos;
    }
    public void setCuentaDatos(TarjetaCuentaDatos cuentaDatos) {
        this.cuentaDatos = cuentaDatos;
    }
    public DatosDNI getDatosDNI() {
        return datosDNI;
    }
    public void setDatosDNI(DatosDNI datosDNI) {
        this.datosDNI = datosDNI;
    }
  

     public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public TarjetaDatos getTarjetaDatos() {
        return tarjetaDatos;
    }

    public void setTarjetaDatos(TarjetaDatos tarjetaDatos) {
        this.tarjetaDatos = tarjetaDatos;
    }
}
