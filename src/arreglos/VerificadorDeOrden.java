package arreglos;

/*
 * Verificando orden:
    a) Implemente la clase VerificadorDeOrden, tal que posea un método llamado ‘verificar’
    que reciba como parámetro un arreglo de enteros y devuelva un valor booleano que indique 
    si los elementos del arreglo están ordenados de menor a mayor o no.
    boolean verificar(int [] enteros){...}
    b) Modifique el método implementado en el punto anterior para que pueda verificarse el orden 
    en ambos sentidos (de menor a mayor o de mayor a menor). En caso de que sea necesario,
    puede también modificar la firma del nuevo método.
 */

public class VerificadorDeOrden {
    /**
     * 
     * @param enteros
     * @param opcion: 0: verifica de menor a mayor
     *                1: verifica de mayor a menor
     * @return
     */
    boolean verificar(int[] enteros, int opcion){
        if (opcion<0 || opcion>1){
            throw new Error("Las opciones disponibles son 0 y 1");
        }
        for(int i=1; i<enteros.length-1; i++){
            if((opcion == 0) && (enteros[i-1]>enteros[i])){
                return false;
            } else if((opcion == 1) && (enteros[i-1]<enteros[i])){
                return false;
            }
        }
        return true;
    }
}
