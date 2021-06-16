/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.inegi;

import ico.fes.dispositivos.SmartPhone;

/**
 *
 * @author Victor
 */
public class EncuestadorInegi {
    private String nombre;           // string tambien es una clase
    private SmartPhone dispositivo;

    public EncuestadorInegi() {
    }

    public EncuestadorInegi(String nombre, SmartPhone dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SmartPhone getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(SmartPhone dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    
    
}
