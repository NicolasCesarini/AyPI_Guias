public class Cadena {

    private char[] cadena;
  
    public Cadena(String string) {
      this.cadena = string.toCharArray();
    }

    public Cadena(char[] cadena) {
        this.cadena = cadena;
      }



    public char[] obtenerCadena(){
        return this.cadena;
    }
  
    public String toString() {
      String s = "";
      for (int i = 0; i < this.longitud(); i++)
        s += this.cadena[i];
      return s;
    }

    public int longitud() {
        return cadena.length;
    }

    public boolean esVacia(){
        boolean esVacia = false;
        if(this.longitud() == 0){
            esVacia = true;
        }
        return esVacia;
    }

    /*public Cadena concatenar(Cadena c){
        char[] cadenaConcatenada = new char[cadena.length + c.obtenerCadena().length];
        char [] cadena2 = c.obtenerCadena();
        for (int i = 0; i < cadena2.length; i++) {
            cadenaConcatenada[this.longitud()+i] = cadena2[i];
        }
        return 
  }*/
    public boolean sonIguales(Cadena c){
        if (this.longitud() != c.longitud()){
            return false;
        }
        int i =0;
        while((i < this.longitud()) && (this.cadena[i]==c.cadena[i])){
            i++;
        }
        if (i == (this.longitud()-1)){
            return true;
        } else {
            return false;
        }
        
    }

    //public transformar

    public boolean contiene(char a){
        for (int i = 0; i < this.longitud(); i++) {
            if(this.cadena[i]== a){
                return true;
            }
        }
        return false;
    }


    /*Escribir una función consonantes():Cadena que recibe una cadena de caracteres y devuelve la cadena que resulta de eliminar todas las vocales de la cadena recibida. Por ejemplo:

	new Cadena("hola como estas").consonantes(); // devuelve "hl cm sts"*/
    public Cadena consonantes(){

        Cadena vocales = new Cadena("aeiouAEIOU");
        int longitudNuevaCadena = 0;
        for (int i = 0; i < this.longitud(); i++){
            if (!vocales.contiene(this.cadena[i])){
                longitudNuevaCadena ++;
            }
        }
        char[] nuevaCadena = new char[longitudNuevaCadena];

        int nuevaCadenaIndice = 0;
        for (int i = 0; i < this.longitud(); i++){
            if (!vocales.contiene(this.cadena[i])){
                nuevaCadena[nuevaCadenaIndice]= this.cadena[i];
                nuevaCadenaIndice++;
            }
        }
        return new Cadena(nuevaCadena);
    
    }

    /*
     * Implementar el método frecuencias():void que recibe como parámetro 
     * una cadena de tipo String sin signos de puntuación,  e informe por 
     * pantalla la frecuencia de aparición de cada una de las letras de la cadena. 
     */
    public void frecuencias(){
        int[] letrasABC = new int[26];
        for(int i=0; i<this.longitud();i++){
            letrasABC[(int) this.cadena[i] - (int) 'a'] += 1;
        }
        for(int i=0; i<letrasABC.length;i++){
            System.out.println("\n" + (char) (97+i) + ": " + letrasABC[i]);
        }

        System.out.println(letrasABC.toString());
    }

    public Cadena invertir() {
        char aux;
        for (int i = 0; i < this.longitud()/2; i++) {
            aux = this.cadena[i];
            this.cadena[i] = this.cadena[this.longitud() - 1 - i];
            this.cadena[this.longitud() - 1 - i] = aux;
        }
        return new Cadena(this.cadena);
    }

    public static void main(String[] args) {
        Cadena cad1 = new Cadena("holacomoestastodobiensstpeamcopln");

        cad1.frecuencias();
        System.out.println((int) 'B');


    
    }

    

}
  
  /*Determinar la longitud de una cadena (método longitud():int)

//Determinar si una cadena es vacía (método esVacia():boolean)

//Concatenar dos cadenas (método concatenar(Cadena c):Cadena

Comparar cadenas (método sonIguales(Cadena c):boolean*/
