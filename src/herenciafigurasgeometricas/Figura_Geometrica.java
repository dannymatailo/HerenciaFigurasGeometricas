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
public abstract class Figura_Geometrica {
   protected double area;
   protected double perimetro;
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
   public void CalcularArea(){};
   public void CalcularPerimetro(){};
}
