package pe.com.bn.app.view.model;

import java.io.Serializable;
public class TarjetaCuentaDatos implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codEmisor;
    private String codUsuario;
    private String numTerminal;
    private String numReferencia;
    private String numTarjetaMonedero;
    private String fechaExpiracion;
    private String comercio;
    private String moneda;
    private String fechaTxnTerminal;
    private String horaTxnTerminal;
    private String reservado;
    private String idTransaccion;
    private String codRespuesta;
    private String descRespuesta;
    private String codAutorizacion;
    private String saldoMoneda;
    private String saldoCodBloqueo;
    private String saldoDescBloqueo;
    private String saldoNombreTarjeta;
    private String saldoFechaExpiracion;
    private double saldoLineaCredito;
    private double saldoDispConsumo;
    private String saldoSigDispConsumo;
    private double saldoEfectivo;
    private double saldoDispEfectivo;
    private String saldoSigDispEfectivo;
    private double saldoPagoMinimo;
    private double saldoPagoTotal;
    private double saldoPagoFacturado;
    private String saldoFechaLimPago;
    private String saldoCuentaPrincipal;
    private double saldoActual;
    private String saldoSigDispActual;
    private String saldoFechaUltPago;
    private String saldoFechaUltFact;
    private String saldoFechaApertura;
    private String saldoFormaPago;
    private String saldoPorcentajeDE;
    private String saldoFlagPorcDE;
    private String saldoPuntosPlataCons;
    private String saldoSigPuntosPlataCons;
    private double saldoMontoProcesar;
    private String saldoContable;
    private String saldoSigContable;
    private String saldoDiasMora;
    private String saldoImporteMora;
    private String saldoCalificacionCliente;
    private String saldoIndCambioPin;
    private String reservado1;
    private String reservado2;
    private String saldoIndNominada;
	public String getCodEmisor() {
		return codEmisor;
	}
	public void setCodEmisor(String codEmisor) {
		this.codEmisor = codEmisor;
	}
	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getNumTerminal() {
		return numTerminal;
	}
	public void setNumTerminal(String numTerminal) {
		this.numTerminal = numTerminal;
	}
	public String getNumReferencia() {
		return numReferencia;
	}
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}
	public String getNumTarjetaMonedero() {
		return numTarjetaMonedero;
	}
	public void setNumTarjetaMonedero(String numTarjetaMonedero) {
		this.numTarjetaMonedero = numTarjetaMonedero;
	}
	public String getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String getComercio() {
		return comercio;
	}
	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getFechaTxnTerminal() {
		return fechaTxnTerminal;
	}
	public void setFechaTxnTerminal(String fechaTxnTerminal) {
		this.fechaTxnTerminal = fechaTxnTerminal;
	}
	public String getHoraTxnTerminal() {
		return horaTxnTerminal;
	}
	public void setHoraTxnTerminal(String horaTxnTerminal) {
		this.horaTxnTerminal = horaTxnTerminal;
	}
	public String getReservado() {
		return reservado;
	}
	public void setReservado(String reservado) {
		this.reservado = reservado;
	}
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getCodRespuesta() {
		return codRespuesta;
	}
	public void setCodRespuesta(String codRespuesta) {
		this.codRespuesta = codRespuesta;
	}
	public String getDescRespuesta() {
		return descRespuesta;
	}
	public void setDescRespuesta(String descRespuesta) {
		this.descRespuesta = descRespuesta;
	}
	public String getCodAutorizacion() {
		return codAutorizacion;
	}
	public void setCodAutorizacion(String codAutorizacion) {
		this.codAutorizacion = codAutorizacion;
	}
	public String getSaldoMoneda() {
		return saldoMoneda;
	}
	public void setSaldoMoneda(String saldoMoneda) {
		this.saldoMoneda = saldoMoneda;
	}
	public String getSaldoCodBloqueo() {
		return saldoCodBloqueo;
	}
	public void setSaldoCodBloqueo(String saldoCodBloqueo) {
		this.saldoCodBloqueo = saldoCodBloqueo;
	}
	public String getSaldoDescBloqueo() {
		return saldoDescBloqueo;
	}
	public void setSaldoDescBloqueo(String saldoDescBloqueo) {
		this.saldoDescBloqueo = saldoDescBloqueo;
	}
	public String getSaldoNombreTarjeta() {
		return saldoNombreTarjeta;
	}
	public void setSaldoNombreTarjeta(String saldoNombreTarjeta) {
		this.saldoNombreTarjeta = saldoNombreTarjeta;
	}
	public String getSaldoFechaExpiracion() {
		return saldoFechaExpiracion;
	}
	public void setSaldoFechaExpiracion(String saldoFechaExpiracion) {
		this.saldoFechaExpiracion = saldoFechaExpiracion;
	}
	public double getSaldoLineaCredito() {
		return saldoLineaCredito;
	}
	public void setSaldoLineaCredito(double saldoLineaCredito) {
		this.saldoLineaCredito = saldoLineaCredito;
	}
	public double getSaldoDispConsumo() {
		return saldoDispConsumo;
	}
	public void setSaldoDispConsumo(double saldoDispConsumo) {
		this.saldoDispConsumo = saldoDispConsumo;
	}
	public String getSaldoSigDispConsumo() {
		return saldoSigDispConsumo;
	}
	public void setSaldoSigDispConsumo(String saldoSigDispConsumo) {
		this.saldoSigDispConsumo = saldoSigDispConsumo;
	}
	public double getSaldoEfectivo() {
		return saldoEfectivo;
	}
	public void setSaldoEfectivo(double saldoEfectivo) {
		this.saldoEfectivo = saldoEfectivo;
	}
	public double getSaldoDispEfectivo() {
		return saldoDispEfectivo;
	}
	public void setSaldoDispEfectivo(double saldoDispEfectivo) {
		this.saldoDispEfectivo = saldoDispEfectivo;
	}
	public String getSaldoSigDispEfectivo() {
		return saldoSigDispEfectivo;
	}
	public void setSaldoSigDispEfectivo(String saldoSigDispEfectivo) {
		this.saldoSigDispEfectivo = saldoSigDispEfectivo;
	}
	public double getSaldoPagoMinimo() {
		return saldoPagoMinimo;
	}
	public void setSaldoPagoMinimo(double saldoPagoMinimo) {
		this.saldoPagoMinimo = saldoPagoMinimo;
	}
	public double getSaldoPagoTotal() {
		return saldoPagoTotal;
	}
	public void setSaldoPagoTotal(double saldoPagoTotal) {
		this.saldoPagoTotal = saldoPagoTotal;
	}
	public double getSaldoPagoFacturado() {
		return saldoPagoFacturado;
	}
	public void setSaldoPagoFacturado(double saldoPagoFacturado) {
		this.saldoPagoFacturado = saldoPagoFacturado;
	}
	public String getSaldoFechaLimPago() {
		return saldoFechaLimPago;
	}
	public void setSaldoFechaLimPago(String saldoFechaLimPago) {
		this.saldoFechaLimPago = saldoFechaLimPago;
	}
	public String getSaldoCuentaPrincipal() {
		return saldoCuentaPrincipal;
	}
	public void setSaldoCuentaPrincipal(String saldoCuentaPrincipal) {
		this.saldoCuentaPrincipal = saldoCuentaPrincipal;
	}
	public double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	public String getSaldoSigDispActual() {
		return saldoSigDispActual;
	}
	public void setSaldoSigDispActual(String saldoSigDispActual) {
		this.saldoSigDispActual = saldoSigDispActual;
	}
	public String getSaldoFechaUltPago() {
		return saldoFechaUltPago;
	}
	public void setSaldoFechaUltPago(String saldoFechaUltPago) {
		this.saldoFechaUltPago = saldoFechaUltPago;
	}
	public String getSaldoFechaUltFact() {
		return saldoFechaUltFact;
	}
	public void setSaldoFechaUltFact(String saldoFechaUltFact) {
		this.saldoFechaUltFact = saldoFechaUltFact;
	}
	public String getSaldoFechaApertura() {
		return saldoFechaApertura;
	}
	public void setSaldoFechaApertura(String saldoFechaApertura) {
		this.saldoFechaApertura = saldoFechaApertura;
	}
	public String getSaldoFormaPago() {
		return saldoFormaPago;
	}
	public void setSaldoFormaPago(String saldoFormaPago) {
		this.saldoFormaPago = saldoFormaPago;
	}
	public String getSaldoPorcentajeDE() {
		return saldoPorcentajeDE;
	}
	public void setSaldoPorcentajeDE(String saldoPorcentajeDE) {
		this.saldoPorcentajeDE = saldoPorcentajeDE;
	}
	public String getSaldoFlagPorcDE() {
		return saldoFlagPorcDE;
	}
	public void setSaldoFlagPorcDE(String saldoFlagPorcDE) {
		this.saldoFlagPorcDE = saldoFlagPorcDE;
	}
	public String getSaldoPuntosPlataCons() {
		return saldoPuntosPlataCons;
	}
	public void setSaldoPuntosPlataCons(String saldoPuntosPlataCons) {
		this.saldoPuntosPlataCons = saldoPuntosPlataCons;
	}
	public String getSaldoSigPuntosPlataCons() {
		return saldoSigPuntosPlataCons;
	}
	public void setSaldoSigPuntosPlataCons(String saldoSigPuntosPlataCons) {
		this.saldoSigPuntosPlataCons = saldoSigPuntosPlataCons;
	}
	public double getSaldoMontoProcesar() {
		return saldoMontoProcesar;
	}
	public void setSaldoMontoProcesar(double saldoMontoProcesar) {
		this.saldoMontoProcesar = saldoMontoProcesar;
	}
	public String getSaldoContable() {
		return saldoContable;
	}
	public void setSaldoContable(String saldoContable) {
		this.saldoContable = saldoContable;
	}
	public String getSaldoSigContable() {
		return saldoSigContable;
	}
	public void setSaldoSigContable(String saldoSigContable) {
		this.saldoSigContable = saldoSigContable;
	}
	public String getSaldoDiasMora() {
		return saldoDiasMora;
	}
	public void setSaldoDiasMora(String saldoDiasMora) {
		this.saldoDiasMora = saldoDiasMora;
	}
	public String getSaldoImporteMora() {
		return saldoImporteMora;
	}
	public void setSaldoImporteMora(String saldoImporteMora) {
		this.saldoImporteMora = saldoImporteMora;
	}
	public String getSaldoCalificacionCliente() {
		return saldoCalificacionCliente;
	}
	public void setSaldoCalificacionCliente(String saldoCalificacionCliente) {
		this.saldoCalificacionCliente = saldoCalificacionCliente;
	}
	public String getSaldoIndCambioPin() {
		return saldoIndCambioPin;
	}
	public void setSaldoIndCambioPin(String saldoIndCambioPin) {
		this.saldoIndCambioPin = saldoIndCambioPin;
	}
	public String getReservado1() {
		return reservado1;
	}
	public void setReservado1(String reservado1) {
		this.reservado1 = reservado1;
	}
	public String getReservado2() {
		return reservado2;
	}
	public void setReservado2(String reservado2) {
		this.reservado2 = reservado2;
	}
	public String getSaldoIndNominada() {
		return saldoIndNominada;
	}
	public void setSaldoIndNominada(String saldoIndNominada) {
		this.saldoIndNominada = saldoIndNominada;
	}

 
}
