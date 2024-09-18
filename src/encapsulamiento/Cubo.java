package encapsulamiento;

class Cubo {

    private double longitudLado;

    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) {
        if(longitudLado <= 0){
            throw new Error("El valor debe ser mayor a 0");
        } else {
            this.longitudLado = longitudLado;
        }
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
        return this.longitudLado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
        if (longitudLado <= 0){
            throw new Error("El valor debe ser mayor a 0");
        } else {
            this.longitudLado = longitudLado;
        }
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
        return Math.pow(this.longitudLado,2);
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
        this.cambiarLado(Math.pow(areaCara,1/2));
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
        return Math.pow(this.longitudLado,3);
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
        cambiarLado(Math.pow(volumen,1/3));
    }
}
