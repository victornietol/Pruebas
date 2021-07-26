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
public class LlantasRefacciones extends Llantas{
    private boolean mismaMedida;
    private int numRepuestos;
    private String tipo;

    public LlantasRefacciones() {
    }

    public LlantasRefacciones(boolean mismaMedida, int numRepuestos, String tipo) {
        this.mismaMedida = mismaMedida;
        this.numRepuestos = numRepuestos;
        this.tipo = tipo;
    }

    public LlantasRefacciones(boolean mismaMedida, int numRepuestos, String tipo, String tipoLlantas, int numLlantas, int tamanio, boolean rinesPersonalizados) {
        super(tipoLlantas, numLlantas, tamanio, rinesPersonalizados);
        this.mismaMedida = mismaMedida;
        this.numRepuestos = numRepuestos;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMismaMedida() {
        return mismaMedida;
    }

    public void setMismaMedida(boolean mismaMedida) {
        this.mismaMedida = mismaMedida;
    }

    public int getNumRepuestos() {
        return numRepuestos;
    }

    public void setNumRepuestos(int numRepuestos) {
        this.numRepuestos = numRepuestos;
    }

    @Override
    public String toString() {
        return "LlantasRefacciones{" + "mismaMedida=" + mismaMedida + ", numRepuestos=" + numRepuestos + ", tipo=" + tipo + '}';
    }
    
    
    
}
