/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.automovil;

import java.awt.Color;

/**
 *
 * @author Victor
 */
public class Carroceria {
    private String material;
    private String tipoDeCoche;
    private Color color;

    public Carroceria() {
    }

    public Carroceria(String material, String tipoDeCoche, Color color) {
        this.material = material;
        this.tipoDeCoche = tipoDeCoche;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoDeCoche() {
        return tipoDeCoche;
    }

    public void setTipoDeCoche(String tipoDeCoche) {
        this.tipoDeCoche = tipoDeCoche;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "material=" + material + ", tipoDeCoche=" + tipoDeCoche + ", color=" + color + '}';
    }
    
    
    
}
