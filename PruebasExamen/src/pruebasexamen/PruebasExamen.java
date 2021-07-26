/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasexamen;

import ico.fes.automovil.Carroceria;
import ico.fes.automovil.Llantas;
import ico.fes.automovil.LlantasRefacciones;
import ico.fes.automovil.Puerta;
import ico.fes.completo.CocheArmado;
import ico.fes.herenciaMultiple.EstudianteDA;
import java.awt.Color;

/**
 *
 * @author Victor
 */
public class PruebasExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CocheArmado auto1 = new CocheArmado();
        auto1.setCarroceria(new Carroceria("Acero", "Camioneta", Color.blue));
        auto1.setLlantas(new Llantas("Deoprtivas", 4, 19, false));
        auto1.setPuerta(new Puerta("Acero", 6, true));
        auto1.setMarca("Mercedez");
        
        LlantasRefacciones refaccion1 = new LlantasRefacciones(false, 1, "Normales", "Normales", 1, 17, false);
        
        
        System.out.println(auto1);
        System.out.println("Refacción: "+ refaccion1);
        
        System.out.println("\n-------Herencia multiple----------\n");
        EstudianteDA a1 = new EstudianteDA("Jose", "Nieto", "Olvera", 30, "Masculino");
        System.out.println(a1);
        a1.ensayar();
        a1.presentar();
        a1.entrenar();
        a1.jugar();
        
    }
    
}
