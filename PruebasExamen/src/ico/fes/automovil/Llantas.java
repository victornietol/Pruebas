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
public class Llantas {
    private String tipoLlantas;
    private int numLlantas;
    private int tamanio;
    private boolean rinesPersonalizados;

    public Llantas() {
    }

    public Llantas(String tipoLlantas, int numLlantas, int tamanio, boolean rinesPersonalizados) {
        this.tipoLlantas = tipoLlantas;
        this.numLlantas = numLlantas;
        this.tamanio = tamanio;
        this.rinesPersonalizados = rinesPersonalizados;
    }

    public boolean isRinesPersonalizados() {
        return rinesPersonalizados;
    }

    public void setRinesPersonalizados(boolean rinesPersonalizados) {
        this.rinesPersonalizados = rinesPersonalizados;
    }

    public String getTipoLlantas() {
        return tipoLlantas;
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Llantas{" + "tipoLlantas=" + tipoLlantas + ", numLlantas=" + numLlantas + ", tamanio=" + tamanio + ", rinesPersonalizados=" + rinesPersonalizados + '}';
    }

    
    
}
