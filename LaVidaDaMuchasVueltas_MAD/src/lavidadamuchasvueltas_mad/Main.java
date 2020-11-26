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
       //variablesMama
        String nombreMama;
        String apellidosMama;
        String generoMama; //boolean
        byte sociabilidadMama;
        byte empatiaMama;
        byte inteligenciaMama;
        byte velocidadMama;
        byte fuerzaMama;
        
        //variablesPapa
        String nombrePapa;
        String apellidosPapa;
        String generoPapa; //boolean
        byte sociabilidadPapa;
        byte empatiaPapa;
        byte inteligenciaPapa;
        byte velocidadPapa;
        byte fuerzaPapa;
        
        //variablesYo
        boolean generoYo = FuncionesPersona.generoAleatorio();
        
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        System.out.print(nombreYo);

        String apellidosYo = FuncionesPersona.apellidosAleatorios() + FuncionesPersona.apellidosAleatorios();
        System.out.print(apellidosYo);
        
        byte sociabilidadMaxYo;
        byte empatiaMaxYo;
        byte inteligenciaMaxYo;
        byte velocidadMaxYo;
        byte fuerzaMaxYo;
    }
}
