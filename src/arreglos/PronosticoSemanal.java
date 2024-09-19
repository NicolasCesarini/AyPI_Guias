package arreglos;

/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {

    private double[] temperaturas;

    /**
     * post: deja inicializadas las temperaturas del pronóstico en 25 ºC.
     */
    public PronosticoSemanal() {

   	 temperaturas = new double[7];
   	 for (int i = 0; i < temperaturas.length; i++) {
   		 temperaturas[i] = 25.0;
   	 }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7, 
     *       siendo 1 lunes y 7 domingo. 
     * post: devuelve la temperatura pronosticada para el día indicado.
     */
    public double obtenerTemperatura(int dia) {
        if (dia < 1 || dia > 7){
            throw new Error("Los dias de la semana son comprendidos entre el 1 y el 7");
        }
        return this.temperaturas[dia-1];
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7, 
     *       siendo 1 lunes y 7 domingo.
     * post: cambia la temperatura pronosticada para el día indicado.
     */
    public void pronosticarTemperatura(int dia, double temperatura) {
        if (dia < 1 || dia > 7){
            throw new Error("Los dias de la semana son comprendidos entre el 1 y el 7");
        }
        this.temperaturas[dia-1] = temperatura;
    }

        /**
     * post: devuelve el promedio de las temperaturas pronosticadas.
     */
    public double calcularPromedioDeTemperaturas() {
        double promedio = 0;
        for(int i=0; i<this.temperaturas.length; i++){
            promedio += this.temperaturas[i];
        }
        promedio /= this.temperaturas.length;
        return promedio;
    }

    /**
     * post: devuelve la máxima temperatura pronosticada.
     */
    public double buscarMaximaTemperatura() {
        double temperaturaMaxima = this.temperaturas[0];
        for(int i=1; i<this.temperaturas.length; i++){
            if (this.temperaturas[i]>temperaturaMaxima){
                temperaturaMaxima = this.temperaturas[i];
            }
        }
        return temperaturaMaxima;
    }


    /**
     * post: devuelve el día de máxima temperatura pronosticada.
     * (Para intrépidos: En caso de repetirse, devolver todos.)
     */
    public int[] buscarDiaDeMaximaTemperatura() {
        double temperaturaMaxima = this.temperaturas[0];
        //int diaTemperaturaMaxima = 0;
        int[] diasTemperaturasMaximasProvisorio = new int[this.temperaturas.length];
        diasTemperaturasMaximasProvisorio[0] = 1;
        int contadorTemperaturasIguales = 1;
        for (int i=1; i<this.temperaturas.length; i++){
            if(this.temperaturas[i]>temperaturaMaxima){
                temperaturaMaxima=this.temperaturas[i];
                diasTemperaturasMaximasProvisorio[0] = i+1;
                contadorTemperaturasIguales = 1;
            } else if (temperaturaMaxima == temperaturas[i]){
                diasTemperaturasMaximasProvisorio[contadorTemperaturasIguales]=i+1;
                contadorTemperaturasIguales += 1;
            }
        }
        int[] diasTemperaturasMaximas = new int[contadorTemperaturasIguales];
        for(int i=0; i<diasTemperaturasMaximas.length; i++){
            diasTemperaturasMaximas[i] = diasTemperaturasMaximasProvisorio[i];
        }
        return diasTemperaturasMaximas;
    }


    /**
     * post: devuelve la mínima temperatura pronosticada.
     */
    public int[] buscarMinimaTemperatura() {
        double minimaTemperatura = this.temperaturas[0];
        for(int i=0; i<this.temperaturas.length; i++){
            if(this.temperaturas[i]<minimaTemperatura){
                minimaTemperatura= this.temperaturas[i];
            }
        }
        //return minimaTemperatura;
        int contadorMinimasTemperaturas = 0;
        for(int i=0;i<this.temperaturas.length;i++){
            if(minimaTemperatura == this.temperaturas[i]){
                contadorMinimasTemperaturas =+ 1;
            }
        }

        int[] diasTemperaturasMinimas = new int[contadorMinimasTemperaturas];
        int indiceDiasTemperaturasMinimas = 0;
        for(int i=0; i<this.temperaturas.length;i++){
            if(minimaTemperatura == this.temperaturas[i]){
                diasTemperaturasMinimas[indiceDiasTemperaturasMinimas] = i+1;
                indiceDiasTemperaturasMinimas += 1;
            }
        }
        return diasTemperaturasMinimas;
    }

}
