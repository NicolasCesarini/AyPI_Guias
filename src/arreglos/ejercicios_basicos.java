package arreglos;

public class ejercicios_basicos {

    /*
     * Dado un arreglo de números enteros, desordenados y de tamaño > 10, resolver:
        Contar los valores de un arreglo
        Contar todos
        Contar los valores pares de un arreglo
        Contar los positivos
        Contar los de posición par
     */

    public int contarValores(int[] array){
        return array.length;
    }

    public int contarValoresPares(int[] array){
        int cantidadNumerosPares = 0;
        for (int i=0; i < array.length; i++){
            if(array[i] % 2 == 0){
                cantidadNumerosPares += 1;
            }
        }
        return cantidadNumerosPares;
    }

    public int contarNumerosPositivos(int[] array){
        int cantidadNumerosPositivos = 0;
        for(int i=0; i < array.length; i++){
            if(array[i] > 0){
                cantidadNumerosPositivos += 1;
            }
        }
        return cantidadNumerosPositivos;
    }

    /*
     * Sumar los valores de un arreglo
        Sumar todos
        Sumar los pares
        Sumar los positivos
        Sumar los de posición par
     */

    public int sumarValores(int[] array){
        int suma = 0;
        for (int i=0; i<array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    public int sumarValoresPares(int[] array){
        int suma = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                suma += array[i];
            }
        }
        return suma;
    }

    public int sumarValoresPositivos(int[] array){
        int suma = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] >= 0){
                suma += array[i];
            }
        }
        return suma;
    }

    public int sumarValoresPosicionPar(int[] array){
        int suma = 0;
        for(int i=0; i<array.length; i++){
            if(i % 2 == 0){
                suma += array[i];
            }
        }
        return suma;
    }

    /*
     * Promediar los valores de un arreglo
        Promediar todos
        Promediar los pares
        Promediar los positivos
        Promediar los de posición par
     */

    public double promedio(int[] array){
        double promedio = 0;
        for(int i=0; i<array.length;i++){
            promedio += array[i];
        }
        promedio /= array.length;
        return promedio;
    }

    public double promedioValoresPares(int[] array){
        double promedio = 0;
        int cantidadValoresPares = 0;
        for(int i=0; i<array.length;i++){
            if(array[i] % 2 == 0){
                promedio += array[i];
                cantidadValoresPares += 1;
            }
        }
        promedio /= cantidadValoresPares;
        return promedio;
    }

    public double promedioValoresPositivos(int[] array){
        double promedio = 0;
        int cantidadValoresPositivos = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] >= 0){
                promedio += array[i];
                cantidadValoresPositivos += 1;
            }
        }
        promedio /= cantidadValoresPositivos;
        return promedio;
    }

    public double PromedioValoresPosicionPar(int[] array){
        double promedio = 0;
        int cantidadValoresPosicionPar = 0;
        for(int i=0; i<array.length; i++){
            if(i % 2 ==0){
                promedio += array[i];
                cantidadValoresPosicionPar += 1;
            }
        }
        promedio /= cantidadValoresPosicionPar;
        return promedio;
    }

    /*
     * Pisar los valores de un arreglo, poniendo en todas sus posiciones el mismo valor
        Que el valor sea cero
        Que sea el primero
        Que sea el último 
     */

    public int[] ponerTodosLosValoresArrayACero(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = 0;
        }
        return array;
    }

    public int[] ponerValoresArrayIgualesAlPrimerValor(int[] array){
        int primerValor = array[0];
        for(int i=0; i<array.length; i++){
            array[i] = primerValor;
        }
        return array;
    }

    public int[] ponerValoresArrayIguelaesAlUltimovalor(int[] array){
        int ultimoValor = array[array.length - 1];
        for(int i=0; i<array.length; i++){
            array[i] = ultimoValor;
        }
        return array;
    }

    /*
     * Invertir el arreglo
     */

    public int[] invertirArreglo(int[] array){
        int aux;
        for(int i=0;i<array.length/2; i++){
            aux = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = aux;
        }
        return array;
    }

    /*
     * Buscar el máximo y/o mínimo del arreglo
     */

    public double buscarMaximo(double[] array){
        double maximo = array[0];
        for(int i=1; i<array.length;i++){
            if(array[i] > maximo){
                maximo = array[i]; 
            }
        }
        return maximo;
    }

    public double BuscarMinimo(double[] array){
        double minimo = array[0];
        for (int i=1;i<array.length;i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }

    /*
     * Buscar un pico (cualquiera) en el arreglo.
     * Se denomina pico a un valor tal que es más grande que los que lo rodean: [10, 12, 8]
     */

    public int buscarPicoEnArray(int[] array){
        if(array.length < 3){
            throw new Error("La longitud del array debe ser mayor o igual a 3");
        }
        for(int i=1; i<array.length-1;i++){
            if((array[i-1]<array[i]) && (array[i]> array[i+1])){
                return array[i];
            }
        }
        throw new Error("No hay pico en el array");
    }

    /*
     * Unir los elementos de dos arreglos
     */

    public int[] unirDosArrays(int[] array1, int[] array2){
        int [] arrayUnido = new int[array1.length + array2.length];
        for(int i=0; i<array1.length;i++){
            arrayUnido[i] = array1[i]; 
        }
        for(int i=0; i<array2.length; i++){
            arrayUnido[i+array1.length] = array2[i];
        }
        return arrayUnido;
    }

    /*
     * Separar un arreglo en dos arreglos de la mitad del tamaño, de las siguientes maneras:
        mitad de elementos para cada arreglo
        elementos en posición par, elementos en posición impar
     */

    /**
     * 
     * @param array
     * @param opcion: 0: devuelve array de elementos pares
     *                1: devuelve array de elementos impares
     * @return
     */
    public int[] arreglosSeparados(int[] array, int opcion){
        if (opcion < 0 || opcion > 1){
            throw new Error("Se debe elegir opcion 0 o 1");
        }
        int longitudArrayElementosEnPosicionPar = array.length/2;
        int longitudArrayElementosEnPosicionImpar = array.length/2;
        if(array.length % 2 == 1){
            longitudArrayElementosEnPosicionPar += 1;
        }
        int[] arrayElementosPosicionPar = new int[longitudArrayElementosEnPosicionPar];
        int[] arrayElementosPosicionImpar = new int[longitudArrayElementosEnPosicionImpar];
        int indiceArrayPosicionPar = 0;
        int indiceArrayPosicionImpar = 0;
        for(int i=0; i<array.length; i++){
            if(i % 2 == 0){
                arrayElementosPosicionPar[indiceArrayPosicionPar] = array[i];
                indiceArrayPosicionPar ++;
            } else {
                arrayElementosPosicionImpar[indiceArrayPosicionImpar] = array[i];
                indiceArrayPosicionImpar ++;
            }
        }
        if(opcion == 0){
            return arrayElementosPosicionPar;
        } else {
            return arrayElementosPosicionImpar;
        }
    }

    /*
     * Mover todos los enteros negativos a la izquierda de los positivos.
     * No importa el orden relativo en que esta operación resulte.
     */

    public int[] moverElementosNegativosAIzquierdaYPositivosADerecha(int[] array){
        int [] arrayNuevo = new int[array.length];
        int indiceNegativos = 0;
        int indicePositivos = array.length - 1;
        for(int i=0; i<array.length; i++){
            if(array[i]>=0){
                arrayNuevo[indicePositivos] = array[i];
                indicePositivos -= 1;
            } else {
                arrayNuevo[indiceNegativos] = array[i];
                indiceNegativos += 1;
            }
        }
        return arrayNuevo;
    }


}
