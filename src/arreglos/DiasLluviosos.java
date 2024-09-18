package arreglos;

public class DiasLluviosos {

    /*
     * Implementar la clase DiasLluviosos, donde se almacene si llovió o no 
     *  en un día del año y cuente con los siguientes métodos:
     * 
    	void registrarQueLlovioElDia(int diaDeAnio, boolean llovio)
    	boolean consultarSiLlovioElDia(int diaDelAnio)
    	int contarDiasLluviosos()
    	int consultarCuatrimestreMasLluvioso()
    	int consultarPrimerDiaConLluvia()
     */

    private boolean[] diasLluviosos;

    public DiasLluviosos(){
        this.diasLluviosos = new boolean[365];
    }

    void registrarQueLlovioElDia(int diaDeAnio, boolean llovio){
        if(diaDeAnio < 1 || diaDeAnio > 365){
            throw new Error("El dia del año debe estar comprendido entre 1 y 365");
        }
        this.diasLluviosos[diaDeAnio - 1] = true;
    }

    boolean consultarSiLlovioElDia(int diaDelAnio){
        if(diaDelAnio < 1 || diaDelAnio > 365){
            throw new Error("El dia del año debe estar comprendido entre 1 y 365");
        }
        return this.diasLluviosos[diaDelAnio - 1];
    }

    int contarDiasLluviosos(){
        int cantidadDiasLluviosos = 0;
        for(int i=0; i<this.diasLluviosos.length; i++){
            if(diasLluviosos[i]){
                cantidadDiasLluviosos += 1;
            }
        }
        return cantidadDiasLluviosos;
    }

    int consultarCuatrimestreMasLluvioso(){
        int cantidadDiasLluviososPrimerCuatrimestre = 0;
        int cantidadDiasLluviososSegundoCuatrimestre = 0;
        int cantidadDiasLluviososTercerCuatrimestre = 0;
        int cuatrimestreMasLluvioso = 1;
        for(int i=0; i<this.diasLluviosos.length; i++){
            if(this.diasLluviosos[i] && (i<(this.diasLluviosos.length/3))){
                cantidadDiasLluviososPrimerCuatrimestre += 1;
            } else if (this.diasLluviosos[i] && (i<((2*this.diasLluviosos.length)/3))){
                cantidadDiasLluviososSegundoCuatrimestre += 1;
            } else if (this.diasLluviosos[i]){
                cantidadDiasLluviososTercerCuatrimestre += 1;
            }
        }
        if(cantidadDiasLluviososSegundoCuatrimestre > cantidadDiasLluviososPrimerCuatrimestre
                && cantidadDiasLluviososSegundoCuatrimestre > cantidadDiasLluviososTercerCuatrimestre){
            cuatrimestreMasLluvioso = 2;
        }
        if (cantidadDiasLluviososTercerCuatrimestre > cantidadDiasLluviososPrimerCuatrimestre
                && cantidadDiasLluviososTercerCuatrimestre > cantidadDiasLluviososSegundoCuatrimestre){
            cuatrimestreMasLluvioso = 3;
        }
        return cuatrimestreMasLluvioso;
    }

    int consultarPrimerDiaConLluvia(){
        int i = 0;
        while (!diasLluviosos[i]){
            i += 1;
        }
        return i+1;
    }
}
