/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.automovil;

/**
 *
 * @author Victor
 */
public class Puerta {
    private String material;
    private int numPuertas;
    private boolean mecanismo;

    public Puerta() {
    }

    public Puerta(String material, int numPuertas, boolean mecanismo) {
        this.material = material;
        this.numPuertas = numPuertas;
        this.mecanismo = mecanismo;
    }

    public boolean isMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(boolean mecanismo) {
        this.mecanismo = mecanismo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Puerta{" + "material=" + material + ", numPuertas=" + numPuertas + ", mecanismo=" + mecanismo + '}';
    }
    
    
    
}
