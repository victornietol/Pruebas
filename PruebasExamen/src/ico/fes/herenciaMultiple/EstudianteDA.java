/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herenciaMultiple;

/**
 *
 * @author Victor
 */
public class EstudianteDA extends Persona implements Deportista,Artista {

    public EstudianteDA() {
    }

    public EstudianteDA(String nombre, String apPaterno, String apMaterno, int edad, String sexo) {
        super(nombre, apPaterno, apMaterno, edad, sexo);
    }
    
    

    @Override
    public void entrenar() {
        System.out.println(super.nombre+" esta entrenando");
    }

    @Override
    public void jugar() {
        System.out.println(super.nombre+" jugando");
        
    }

    @Override
    public void ensayar() {
        System.out.println(super.nombre+" esta ensayando");
        
    }

    @Override
    public void presentar() {
        System.out.println(super.nombre+" esta presentando su trabajo");
        
    }
    
    
    
}
