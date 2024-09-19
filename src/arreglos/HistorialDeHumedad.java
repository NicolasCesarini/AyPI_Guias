package arreglos;

/*
 * Durante todo un día se toman muestras de humedad. Diseñar e implementar la 
 *  clase HistorialDeHumedad tal que:
    Se construya a partir de la cantidad de mediciones de humedad  a realizar.
    Almacene las muestras de humedad.
    Calcule la humedad promedio.
    Busque el mínimo y máximo valor de humedad.
 */

public class HistorialDeHumedad {

    private double[] muestrasHumedad;

    public HistorialDeHumedad(int cantidadMuestras){
        this.muestrasHumedad = new double[cantidadMuestras];
    }

    public void ingresarMuestra(int numeroDeMuestra, double humedad){
        if(numeroDeMuestra<1 || numeroDeMuestra>muestrasHumedad.length){
            throw new Error("Ingresar numero de muestra válido");
        }
        this.muestrasHumedad[numeroDeMuestra-1] = humedad;
    }

    public double calcularHumedadPromedio(){
        double promedio = 0;
        for(int i=0; i<this.muestrasHumedad.length; i++){
            promedio += muestrasHumedad[i];
        }
        promedio /= muestrasHumedad.length;
        return promedio;
    }

    public double buscarMinimoOMaximo(int opcion){
        if(opcion<0 || opcion>1){
            throw new Error("Se debe elegir opción 0 para minima humedad, y 1 para maxima");
        }
        double maximaHumedad = this.muestrasHumedad[0];
        double minimaHumedad = this.muestrasHumedad[0];
        for(int i=1; i<this.muestrasHumedad.length;i++){
            if(this.muestrasHumedad[i]>maximaHumedad){
                maximaHumedad = this.muestrasHumedad[i];
            } else if(this.muestrasHumedad[i]<minimaHumedad){
                minimaHumedad=this.muestrasHumedad[i];
            }
        }
        if(opcion == 0){
            return minimaHumedad;
        } else {
            return maximaHumedad;
        }
    }
}
