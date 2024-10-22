package pe.com.bn.app.services;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import pe.com.bn.app.tranversal.config.Parametros;
import pe.com.bn.app.view.model.TarjetaDatos;
import pe.com.bn.app.view.model.TarjetaCuentaDatos;
import pe.com.bn.app.view.model.ConsultaMovimientosExpediente;
import pe.com.bn.app.view.model.DatosDNI;
import pe.com.bn.app.view.model.Movimiento;

@ManagedBean(name = "wsFacade")
@ApplicationScoped
public class WsFacade implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManagedProperty("#{parametros}")
    private Parametros parametros;

    private final static Logger logger = Logger.getLogger(WsFacade.class);

    @PostConstruct
    public void init() {
        logger.info("WsFacade inicializado con los siguientes parámetros:");
        logger.info("Emisor: " + parametros.getCodigoEmisorMc());
        logger.info("Usuario: " + parametros.getCodigoUsuarioMc());
        logger.info("Terminal: " + parametros.getNumTerminalMc());
    }

    public void setParametros(Parametros parametros) {
        this.parametros = parametros;
    }

    public TarjetaDatos informacionDeTarjeta(String numeroTarjeta) {
        logger.info("Consultando datos para el número de tarjeta: " + numeroTarjeta);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("Error en la simulación de retardo", e);
            Thread.currentThread().interrupt();
        }

        TarjetaDatos datos = new TarjetaDatos();
        datos.setCodEmisor(parametros.getCodigoEmisorMc());
        datos.setCodUsuario(parametros.getCodigoUsuarioMc());
        datos.setNumTerminal(parametros.getNumTerminalMc());
        datos.setNumTarjeta(numeroTarjeta);
        datos.setFechaExpiracion("12/2025");
        datos.setComercio(parametros.getWsComercioMc());
        datos.setCodigoBloqueo("0");
        datos.setFechaTxnTerminal("2024-10-21");
        datos.setHoraTxnTerminal("14:30");
        datos.setCodRespuesta("00");
        datos.setDescRespuesta("Aprobado");

        logger.info("Datos de la tarjeta obtenidos: " + datos);
        return datos;
    }

    public TarjetaCuentaDatos consultaCuentaTarjeta(String numeroTarjeta) {
        logger.info("Consultando datos de cuenta para el número de tarjeta: " + numeroTarjeta);

        try {
            Thread.sleep(3000); // Simulación de retardo
        } catch (InterruptedException e) {
            logger.error("Error en la simulación de retardo", e);
            Thread.currentThread().interrupt();
        }

        TarjetaCuentaDatos cuentaDatos = new TarjetaCuentaDatos();
        cuentaDatos.setNumTarjetaMonedero(numeroTarjeta);
        cuentaDatos.setCodEmisor("941");
        cuentaDatos.setCodUsuario("CS00000001");
        cuentaDatos.setNumTerminal("12345678");
        cuentaDatos.setNumReferencia("ORD20160224");
        cuentaDatos.setComercio("2999994");
        cuentaDatos.setMoneda("604");
        cuentaDatos.setFechaTxnTerminal("20160224");
        cuentaDatos.setHoraTxnTerminal("172020");
        cuentaDatos.setIdTransaccion("12561");
        cuentaDatos.setCodRespuesta("0000");
        cuentaDatos.setCodAutorizacion("R152632");
        cuentaDatos.setSaldoMoneda("604");
        cuentaDatos.setSaldoCodBloqueo("X");
        cuentaDatos.setSaldoDescBloqueo("Motivo X");
        cuentaDatos.setSaldoNombreTarjeta("Marianela Gutierrez");
        cuentaDatos.setSaldoLineaCredito(0.00);
        cuentaDatos.setSaldoDispConsumo(20.00);
        cuentaDatos.setSaldoSigDispConsumo("C");
        cuentaDatos.setSaldoEfectivo(20.00);
        cuentaDatos.setSaldoDispEfectivo(20.00);
        cuentaDatos.setSaldoSigDispEfectivo("C");
        cuentaDatos.setSaldoPagoMinimo(0.00);
        cuentaDatos.setSaldoPagoTotal(0.00);
        cuentaDatos.setSaldoPagoFacturado(0.00);
        cuentaDatos.setSaldoFechaLimPago("20160325");
        cuentaDatos.setSaldoActual(20.00);
        cuentaDatos.setSaldoSigDispActual("C");
        cuentaDatos.setSaldoFechaApertura("20160102");
        cuentaDatos.setSaldoFormaPago("CO");

        logger.info("Datos de la cuenta obtenidos: " + cuentaDatos);
        return cuentaDatos;
    }

    public DatosDNI consultaDNI(String dni) {
        logger.info("Consultando datos para el DNI: " + dni);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("Error en la simulación de retardo", e);
            Thread.currentThread().interrupt();
        }

        DatosDNI datosDNI = new DatosDNI();
        datosDNI.setCodEmisor("191");
        datosDNI.setCodUsuario("TT9999");
        datosDNI.setNumTerminal("11010101");
        datosDNI.setNumReferencia("AC2023000187");
        datosDNI.setTipoDocumento("1"); // Suponiendo que 1 representa el tipo de documento "DNI"
        datosDNI.setNumDocumento(dni);
        datosDNI.setNomCliente("BENEL ZAPATA");
        datosDNI.setApeCliente("JORGE LUIS");
        datosDNI.setCorreoCliente("BENEL@GMAIL.COM");
        datosDNI.setTelCliente("00009994444");
        datosDNI.setFechaTxnTerminal("20160224");
        datosDNI.setHoraTxnTerminal("172020");
        datosDNI.setIdTransaccion("174849");
        datosDNI.setCodRespuesta("0000");
        datosDNI.setDescRespuesta("Transacción exitosa");

        logger.info("Datos del cliente obtenidos: " + datosDNI);
        return datosDNI;
    }


    public ConsultaMovimientosExpediente consultaMovimientos(String numeroTarjeta) {
        logger.info("Consultando movimientos para el número de tarjeta: " + numeroTarjeta);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("Error en la simulación de retardo", e);
            Thread.currentThread().interrupt();
        }

        ConsultaMovimientosExpediente expediente = new ConsultaMovimientosExpediente();
        expediente.setCodEmisor("191");
        expediente.setCodUsuario("TT9999");
        expediente.setNumTerminal("11010101");
        expediente.setNumCuenta("5309270100000666");
        expediente.setNumReferencia("AC2024000120");
        expediente.setFechaExpiracion("2701");
        expediente.setComercio("4058950");
        expediente.setMoneda("604");
        expediente.setFechaTxnTerminal("20210831");
        expediente.setHoraTxnTerminal("111901");
        expediente.setIdTransaccion("169297");
        expediente.setCodRespuesta("0005");
        expediente.setDescRespuesta("Transacción rechazada");

        // Simulación de lista de movimientos
        List<Movimiento> movimientos = new ArrayList<>();

        Movimiento mov1 = new Movimiento();
        mov1.setFechaTxn("20210831");
        mov1.setDescripcionTxn("Compra en supermercado");
        mov1.setMonedaOriginalTxn("PEN");
        mov1.setMontoTxn(-150.50);
        mov1.setSigMontoTxn(1350.25);
        mov1.setOperacion("Débito");
        mov1.setCodAutorizacion("123456");
        mov1.setNumTarjeta(numeroTarjeta);

        Movimiento mov2 = new Movimiento();
        mov2.setFechaTxn("20210830");
        mov2.setDescripcionTxn("Depósito en cajero");
        mov2.setMonedaOriginalTxn("PEN");
        mov2.setMontoTxn(500.00);
        mov2.setSigMontoTxn(1850.25);
        mov2.setOperacion("Crédito");
        mov2.setCodAutorizacion("789012");
        mov2.setNumTarjeta(numeroTarjeta);

        Movimiento mov3 = new Movimiento();
        mov3.setFechaTxn("20210829");
        mov3.setDescripcionTxn("Pago de servicio");
        mov3.setMonedaOriginalTxn("PEN");
        mov3.setMontoTxn(-200.00);
        mov3.setSigMontoTxn(1650.25);
        mov3.setOperacion("Débito");
        mov3.setCodAutorizacion("345678");
        mov3.setNumTarjeta(numeroTarjeta);

        movimientos.add(mov1);
        movimientos.add(mov2);
        movimientos.add(mov3);

        expediente.setMovimientos(movimientos);

        logger.info("Movimientos obtenidos: " + movimientos);
        return expediente;
    }

}
