package sistemaecommerce;

public class TarjetaDeCredito implements PagoConDescuento {

    private final double descuentoPorcentaje;

    public TarjetaDeCredito(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    @Override
    public double
            aplicarDescuento(double monto) {
        double descuento = monto * (descuentoPorcentaje
                / 100);
        double montoFinal = monto - descuento;

        System.out.println("[Tarjeta] Aplicando descuento de " + descuentoPorcentaje + "%. Total con desc.: " + montoFinal);
        return montoFinal;
    }


    public boolean procesarPago(double monto) {
        System.out.println("[Tarjeta] Procesando pago por "
                + monto);
        System.out.println("[Tarjeta] pago exitoso");
        return true;
    }
}
