package arreglos;

public class ElementosSucesivosMultiplicadosPorDos {

    /*
     * Desarrolle una clase con un método que, dado un vector (arreglo) de enteros,
     *  determine si cada elemento es el doble del anterior. Si se cumple la condición, 
     * el método retorna  (-1);  en caso contrario, retorna la posición del primer elemento inválido.
        Como siempre, seleccione los nombres de la clase y del método con cuidado ;)
     */

    private int[] elementos;

    public ElementosSucesivosMultiplicadosPorDos(int[] array){
        this.elementos = array;
    }

    public int verificar(){
        for(int i=1; i<this.elementos.length; i++){
            if(this.elementos[i-1]*2 != this.elementos[i]){
                return i;
            }
        }
        return -1;
    }

}
