package pe.com.bn.app.view.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DatosDNI implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codEmisor;
    private String codUsuario;
    private String numTerminal;
    private String numReferencia;
    private String tipoDocumento;
    private String numDocumento;
    private String nomCliente;
    private String apeCliente;
    private String correoCliente;
    private String telCliente;
    private String fechaTxnTerminal;
    private String horaTxnTerminal;
    private String idTransaccion;
    private String codRespuesta;
    private String descRespuesta;

    // Getters y Setters
 
}
