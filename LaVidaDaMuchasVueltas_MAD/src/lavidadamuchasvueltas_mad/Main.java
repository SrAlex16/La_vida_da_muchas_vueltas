/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavidadamuchasvueltas_mad;

import personas.FuncionesPersona;

/**
 *
 * @author 1DAW
 */
public class Main {

    public static void main(String[] args) {

        boolean generoYo = FuncionesPersona.generoAleatorio();

        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        System.out.print(nombreYo);

        String apellidosYo = FuncionesPersona.apellidosAleatorios() + FuncionesPersona.apellidosAleatorios();
        System.out.print(apellidosYo);
        
       //variablesMama
        String nombreMama;
        
        
        //variablesYo
        byte sociabilidadMaxYo=0;
        byte empatiaMaxYo=0;
        byte inteligenciaMaxYo=0;
        byte velocidadMaxYo=0;
        byte fuerzaMaxYo=0;
    }
}
