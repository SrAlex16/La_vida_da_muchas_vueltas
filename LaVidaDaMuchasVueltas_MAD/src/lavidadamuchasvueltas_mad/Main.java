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
        String nombreMama = FuncionesPersona.nombreAleatorio(true);
        String apellidosMama = FuncionesPersona.apellidosAleatorios()+FuncionesPersona.apellidosAleatorios();
        boolean generoMama = true;
        byte sociabilidadMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        
        //variablesPapa
        String nombrePapa = FuncionesPersona.nombreAleatorio(false);
        String apellidosPapa = FuncionesPersona.apellidosAleatorios()+FuncionesPersona.apellidosAleatorios();
        boolean generoPapa = false;
        byte sociabilidadPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        
        //variablesYo
        boolean generoYo = FuncionesPersona.generoAleatorio();
        
        //variablesYo
        byte sociabilidadMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);

        String apellidosYo = FuncionesPersona.apellidosAleatorios() + FuncionesPersona.apellidosAleatorios();
        
        System.out.println(FuncionesPersona.imprimePersona(nombreYo, apellidosYo, generoYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo));
        
        System.out.println(FuncionesPersona.imprimePersona(nombreMama, apellidosMama, generoMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));
        
        System.out.println(FuncionesPersona.imprimePersona(nombrePapa, apellidosPapa, generoPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));
    }
}
