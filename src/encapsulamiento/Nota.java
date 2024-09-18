package encapsulamiento;

class Nota {

    private int valor;

    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
        if (valorInicial < 0 || valorInicial > 10){
            throw new Error("El valor de la nota debe estar entre 0 y 10");
        } else{
            this.valor = valorInicial;
        }
        
    }
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
        return this.valor;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
        if (this.valor >= 4){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
        return !aprobado();
    }

    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor) {
        if (nuevoValor < 0 || nuevoValor > 10){
            throw new Error ("El valor de la nota debe estar entre 0 y 10");
        } else if (nuevoValor > this.valor){
            this.valor = nuevoValor;
        }
    }

}
