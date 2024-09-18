package encapsulamiento;

class CajaDeAhorro {

    private String titularDeLaCuenta;
    private double saldo;

    /**
     * post: la instancia queda asignada al titular indicado
     *   	    y con saldo igual a 0.
     */
    public CajaDeAhorro(String titularDeLaCuenta) {
        this.titularDeLaCuenta = titularDeLaCuenta;
        this.saldo = 0;
    }
    
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() {
        return this.titularDeLaCuenta;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto
     *       depositado.  
     */
    public void depositar(double monto) {
        if (monto < 0){
            throw new Error("El monto debe ser mayor a 0");
        }
        this.saldo += monto;
    }
 
    /**
     * @monto: la cantidad de dinero a extraer de la cuenta.
     * pre : monto es mayor a 0 y menor o igual que el saldo de la
     *       Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto
     *       extraído.
     */
    public void extraer(double monto) {
        if (monto <= 0){
            throw new Error("El monto ingresado debe ser mayor a 0");
        } else if(monto <= this.saldo){
            throw new Error("El saldo debe ser mayor o igual al monto ingresado");
        }
        this.saldo -= monto;
    }
}
