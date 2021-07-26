/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.completo;

import ico.fes.automovil.Carroceria;
import ico.fes.automovil.Llantas;
import ico.fes.automovil.Puerta;

/**
 *
 * @author Victor
 */
public class CocheArmado {
    private Puerta puerta;
    private Carroceria carroceria;
    private Llantas llantas;
    private String marca;

    public CocheArmado() {
    }

    public CocheArmado(Puerta puerta, Carroceria carroceria, Llantas llantas, String marca) {
        this.puerta = puerta;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Llantas getLlantas() {
        return llantas;
    }

    public void setLlantas(Llantas llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "CocheArmado{" + "puerta=" + puerta + ", carroceria=" + carroceria + ", llantas=" + llantas + ", marca=" + marca + '}';
    }
    
    
    
}
