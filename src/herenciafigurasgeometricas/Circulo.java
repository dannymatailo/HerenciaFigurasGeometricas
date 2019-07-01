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
public class Circulo extends Figura_Geometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

  

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public void CalcularArea(){
        area=3.1416*radio*radio;
    }

    @Override
     public void CalcularPerimetro(){
        perimetro=2*3.1416*radio;
    }
    
}
