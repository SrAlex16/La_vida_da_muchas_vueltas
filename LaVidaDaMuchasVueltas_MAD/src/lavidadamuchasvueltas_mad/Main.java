/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavidadamuchasvueltas_mad;

import java.util.Random;
import personas.FuncionesPersona;

/**
 *
 * @author 1DAW
 */
public class Main {

    public static void main(String[] args) {

        boolean generoYo = FuncionesPersona.generoAleatorio();
        
        
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        System.out.println(nombreYo);
        
        String apellidosYo = FuncionesPersona.apellidosAleatorios() + " "
                + FuncionesPersona.apellidosAleatorios();

        
    }
    
   
}
