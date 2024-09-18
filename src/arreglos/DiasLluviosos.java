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

    /*boolean consultarSiLlovioElDia(int diaDelAnio){
        if(diaDelAnio < 1 || diaDelAnio > 365){}
    }*/



}
