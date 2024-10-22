package pe.com.bn.app.view.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import pe.com.bn.app.services.WsFacade;
import pe.com.bn.app.view.model.DatosDNI;
import pe.com.bn.app.view.model.TarjetaModel;

@ManagedBean(name = "consultaDatosController")
@ViewScoped
public class ConsultaDatosController {
    @ManagedProperty("#{wsFacade}")
    private WsFacade facade;
    
    private TarjetaModel tarjetaModel;

    private final static Logger log = Logger.getLogger(ConsultaDatosController.class);
    @PostConstruct
    public void init() {
        tarjetaModel = new TarjetaModel();
        DatosDNI dni = new DatosDNI();
        dni.setNumDocumento("");
        tarjetaModel.setBusquedaRealizada(true);
        tarjetaModel.setDatosDNI(dni);
        log.info("consultaDatosController inicializado en " + System.identityHashCode(this));
    }
    
    public void consultarMovimientosTarjeta() {
        try {
            String numeroTarjeta = tarjetaModel.getNumTarjeta();
            log.info("Número de Tarjeta ingresado para consulta de movimientos: " + numeroTarjeta);

            if (numeroTarjeta == null || numeroTarjeta.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "Por favor, ingrese un número de tarjeta."));
                return;
            }

            tarjetaModel.setExpedienteMovimientos(facade.consultaMovimientos(numeroTarjeta));
            if (tarjetaModel.getExpedienteMovimientos().getMovimientos() != null && !tarjetaModel.getExpedienteMovimientos().getMovimientos().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Movimientos de tarjeta consultados correctamente."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "No se encontraron movimientos para la tarjeta."));
            }
        } catch (Exception e) {
            log.error("Error al consultar los movimientos de la tarjeta: ", e);
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ocurrió un error al consultar los movimientos de la tarjeta."));
        }
    }
    public void consultarDatosDNI() {
        try {
            String dni = tarjetaModel.getDatosDNI().getNumDocumento();
            log.info("DNI ingresado para consulta: " + dni);

            if (dni == null || dni.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "Por favor, ingrese un DNI válido."));
                return;
            }

            tarjetaModel.setDatosDNI(facade.consultaDNI(dni));
            if (tarjetaModel.getDatosDNI() != null) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Datos del DNI consultados correctamente."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "No se encontraron datos para el DNI ingresado."));
            }
        } catch (Exception e) {
            log.error("Error al consultar los datos del DNI: ", e);
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ocurrió un error al consultar los datos del DNI."));
        }
    }
    
    public void consultarDatosTarjeta() {
        try {
            String numeroTarjeta = tarjetaModel.getNumTarjeta();
            log.info("Número de Tarjeta ingresado: " + numeroTarjeta);

            if (numeroTarjeta == null || numeroTarjeta.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "Por favor, ingrese un número de tarjeta."));
                return;
            }

            tarjetaModel.setTarjetaDatos(facade.informacionDeTarjeta(numeroTarjeta));
            tarjetaModel.setBusquedaRealizada(true);

            if (tarjetaModel.getTarjetaDatos() != null) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Datos de la tarjeta consultados correctamente."));
            } else {
                tarjetaModel.setBusquedaRealizada(false);
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "No se encontraron datos para la tarjeta ingresada."));
            }
        } catch (Exception e) {
            log.error("Error al consultar los datos de la tarjeta: ", e);
            tarjetaModel.setBusquedaRealizada(false);
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ocurrió un error al consultar los datos de la tarjeta."));
        }
    }
    public void consultarCuentaTarjeta() {
        try {
            String numeroTarjeta = tarjetaModel.getNumTarjeta();
            log.info("Número de Tarjeta ingresado para consulta de cuenta: " + numeroTarjeta);

            if (numeroTarjeta == null || numeroTarjeta.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "Por favor, ingrese un número de tarjeta."));
                return;
            }

            tarjetaModel.setCuentaDatos(facade.consultaCuentaTarjeta(numeroTarjeta));
            if (tarjetaModel.getCuentaDatos() != null) {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Cuenta de tarjeta consultada correctamente."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Advertencia", "No se encontraron datos de la cuenta."));
            }
        } catch (Exception e) {
            log.error("Error al consultar la cuenta de la tarjeta: ", e);
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ocurrió un error al consultar la cuenta de la tarjeta."));
        }
    }
	public WsFacade getFacade() {
		return facade;
	}

	public void setFacade(WsFacade facade) {
		this.facade = facade;
	}

	public TarjetaModel getTarjetaModel() {
		return tarjetaModel;
	}

	public void setTarjetaModel(TarjetaModel tarjetaModel) {
		this.tarjetaModel = tarjetaModel;
	}
}
