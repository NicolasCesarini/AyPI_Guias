package encapsulamiento;

/*Implementar la clase Cerradura con los siguientes métodos. Indique axiomas 
de la clase, pre y post condiciones de los métodos.
Cuando una Cerradura se bloquea no puede volver a abrirse nunca más.*/

class Cerradura {

    private int claveDeApertura;
    private int cantidadDeFallosConsecutivosQueLaBloquean;
    private int cantidadDeFallosConsecutivos;
    public boolean abierta;
    private int cantidadAperturasExitosas;
    private int cantidadAperturasFallidas;

    /**
     * 
     */
    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean){
        this.claveDeApertura = claveDeApertura;
        this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
        this.cantidadDeFallosConsecutivos = 0;
        this.abierta = true;
        this.cantidadAperturasExitosas = 0;
        this.cantidadAperturasFallidas = 0;
    }

    /**
     * 
     * @param clave: clave de la cerradura
     * pre: ingresar clave de la cerradura
     * post: si la clave es correcta, volver a 0 la cantidad de fallos consecutivos y abrir cerradura,
     * si la clave es incorrecta contbilizar el intento fallido y 
     * ejecutar el método fueBloqueada() para verificar si se llego a la cantidad de Fallos consecutivos
     * que la bloquean.
     */
    public boolean abrir(int clave){
        if(this.estaAbierta()){
            return true;
        } else if(this.claveDeApertura == clave && !this.fueBloqueada()){
            this.abierta = true;
            this.cantidadAperturasExitosas += 1;
        } else if(this.claveDeApertura != clave){
            this.cantidadDeFallosConsecutivos =+ 1;
            this.fueBloqueada();
            this.cantidadAperturasFallidas =+ 1;
            return false;
        }
        return false;
    }

    public void cerrar(){
        if(this.estaAbierta()){
            this.abierta = false;
        }
    }

    public boolean estaAbierta(){
        return this.abierta;
    }

    public boolean estaCerrada(){
        return !this.abierta;
    }

    public boolean fueBloqueada(){
        if(this.cantidadDeFallosConsecutivos == this.cantidadDeFallosConsecutivosQueLaBloquean){
            return true;
        } else {
            return false;
        }
    }
        

    public int contarAperturasExitosas(){
        return this.cantidadAperturasExitosas;
    }

    public int contarAperturasFallidas(){
        return this.cantidadAperturasFallidas;
    }

}

