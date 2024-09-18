package encapsulamiento;

class TarjetaBaja {

    private double saldo;
    private int contadorViajesColectivo;
    private int contadorViajesSubte;

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
        this.saldo = saldoInicial;
        this.contadorViajesColectivo = 0;
        this.contadorViajesSubte = 0;
    }

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
        return this.saldo;
    } 

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {
        this.saldo += monto;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() {
        if (this.saldo < 21.5){
            throw new Error("El saldo de la tarjeta no es suficiente");
        } else {
            this.saldo -= 21.5;
            this.contadorViajesColectivo ++;
        }
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() {
        if (this.saldo < 19.5){
            throw new Error("El saldo no es suficiente");
        } else {
            this.saldo -= 19.5;
            this.contadorViajesSubte ++;
        }
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
        return this.contadorViajesColectivo + this.contadorViajesSubte;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
        return this.contadorViajesColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
        return this.contadorViajesSubte;
    }
}

