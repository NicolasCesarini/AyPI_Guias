package encapsulamiento;

class Ticket {

    private double importe;
    private int cantidadProductos;
    private boolean abierto;
    private boolean descuentoAplicado;

    /**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket() {
        this.importe = 0;
        this.cantidadProductos = 0;
        this.abierto = true;
        this.descuentoAplicado = false;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     *       de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
        if(cantidad <= 0 || precioUnitario <=0){
            throw new Error("La cantidad y precio deben ser mayores a cero");
        } else if(!abierto){
            throw new Error("El ticket no se encuentra abierto");
        } else {
            this.importe += (cantidad * precioUnitario);
            this.cantidadProductos += cantidad;
        }
    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) {
        if(!abierto){
            throw new Error("El ticket no se encuentra abierto");
        } else if(descuentoAplicado){
            throw new Error("Ya se ha aplicado un descuento");
        }
        this.importe = this.importe * (100 - porcentaje) / 100;
        this.descuentoAplicado = true;
    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
        return this.importe;
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
        this.abierto = false;
        return this.importe;
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
        return this.cantidadProductos;
    } 
}