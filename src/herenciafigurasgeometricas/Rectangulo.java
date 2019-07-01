/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafigurasgeometricas;

/**
 *
 * @author labctr
 */
public class Rectangulo extends Figura_Geometrica{
    private double altura;
    private double ancho;

    public Rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }  

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }



    @Override
   public void CalcularArea(){
        area=altura*ancho;
    }


    @Override
     public void CalcularPerimetro(){
        perimetro=2*altura+2*ancho;
    }
 
}
