package encapsulamiento;

public class Punto {

    private double x;
    private double y;

    public double obtenerX(){
        return this.x;
    }

    public double obtenerY(){
        return this.y;
    }

    public void cambiarX(double nuevoX){
        this.x = nuevoX;
    }

    public void cambiarY(double nuevoY){
        this.y = nuevoY;
    }

    public boolean estaSobreEjeX(){
        if (y == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean estaSobreEjeY(){
        if (x == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esElOrigen(){
        if (x == 0 && y ==0){
            return true;
        } else {
            return false;
        }
    } 
}