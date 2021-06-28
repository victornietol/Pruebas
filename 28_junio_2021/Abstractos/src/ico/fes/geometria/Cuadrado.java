/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.geometria;

/**
 *
 * @author Victor
 */
public class Cuadrado implements Figura{
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public void area(){
        // código pendiente 
        System.out.println("El area del cuadrado es: " +
                (this.lado * this.lado) );
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
    
}
