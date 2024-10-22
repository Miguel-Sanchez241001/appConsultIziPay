package pe.com.bn.app.tranversal.config;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "parametros")
@ApplicationScoped
public class Parametros implements Serializable {
    private static final long serialVersionUID = 1L;

    // Parámetros MC con valores por defecto
    private String codigoEmisorMc = "191";
    private String codigoUsuarioMc = "TT9999";
    private String numTerminalMc = "11010101";
    private String prefijoNumReferenciaMc = "AC";
    private String wsUsuarioMc = "4858643428";
    private String wsClaveMc = "aza877azutht98b8";
    private String wsSoapMc = "https://testwsgestiontarjetas.izipay.pe/WCFGestionTarjetas/Service1.svc";
    private String wsComercioMc = "4058950";

    // Getters y Setters
    public String getCodigoEmisorMc() {
        return codigoEmisorMc;
    }

    public void setCodigoEmisorMc(String codigoEmisorMc) {
        this.codigoEmisorMc = codigoEmisorMc;
    }

    public String getCodigoUsuarioMc() {
        return codigoUsuarioMc;
    }

    public void setCodigoUsuarioMc(String codigoUsuarioMc) {
        this.codigoUsuarioMc = codigoUsuarioMc;
    }

    public String getNumTerminalMc() {
        return numTerminalMc;
    }

    public void setNumTerminalMc(String numTerminalMc) {
        this.numTerminalMc = numTerminalMc;
    }

    public String getPrefijoNumReferenciaMc() {
        return prefijoNumReferenciaMc;
    }

    public void setPrefijoNumReferenciaMc(String prefijoNumReferenciaMc) {
        this.prefijoNumReferenciaMc = prefijoNumReferenciaMc;
    }

    public String getWsUsuarioMc() {
        return wsUsuarioMc;
    }

    public void setWsUsuarioMc(String wsUsuarioMc) {
        this.wsUsuarioMc = wsUsuarioMc;
    }

    public String getWsClaveMc() {
        return wsClaveMc;
    }

    public void setWsClaveMc(String wsClaveMc) {
        this.wsClaveMc = wsClaveMc;
    }

    public String getWsSoapMc() {
        return wsSoapMc;
    }

    public void setWsSoapMc(String wsSoapMc) {
        this.wsSoapMc = wsSoapMc;
    }

    public String getWsComercioMc() {
        return wsComercioMc;
    }

    public void setWsComercioMc(String wsComercioMc) {
        this.wsComercioMc = wsComercioMc;
    }
}
