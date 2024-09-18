package encapsulamiento;

public class Circulo {

    private double radio;

    public Circulo (double radio){
        if(radio < 0){
            throw new Error("El valor debe ser mayor a 0");
        } else {
            this.radio = radio;
        }
    }

    public double obtenerRadio(){
        return this.radio;
    }

    public void modificarRadio(double nuevoRadio){
        if(radio < 0){
            throw new Error("El valor debe ser mayor a 0");
        } else {
            this.radio = nuevoRadio;
        }
    }

    public double obtenerDiametro(){
        return this.radio * 2;
    }

    public void modificarDiametro(double nuevoDiametro){
        this.modificarRadio(nuevoDiametro/2);
    }

    public double obtenerPerimetro(){
        return this.radio * 2 * Math.PI;
    }

    public void modificarPerimetro(double nuevoPerimetro){
        this.modificarRadio(nuevoPerimetro / Math.PI / 2);
    }

    public double obtenerArea(){
        return Math.pow(this.radio,2) * Math.PI;
    }

    public void modificarArea(double nuevaArea){
        modificarRadio(Math.pow((nuevaArea/3.14),1/2));
    }
}
