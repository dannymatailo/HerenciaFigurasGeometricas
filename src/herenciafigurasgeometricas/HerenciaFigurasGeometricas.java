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
public class HerenciaFigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo=new Circulo(5);
        Rectangulo rectangulo=new Rectangulo(5,10);
        circulo.CalcularArea();
        circulo.CalcularPerimetro();
        System.out.println("Circulo:   Radio= "+circulo.getRadio()+" Area= "+circulo.getArea()+" Perimetro= "+circulo.getPerimetro());
        rectangulo.CalcularArea();
        rectangulo.CalcularPerimetro();
        System.out.println("Rectangulo:  Altura= "+rectangulo.getAltura()+" Ancho= "+rectangulo.getAncho()+" Area= "+rectangulo.getArea()+" Perimetro= "+rectangulo.getPerimetro());
    }
    
}
