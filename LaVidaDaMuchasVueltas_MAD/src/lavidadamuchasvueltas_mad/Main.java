
package lavidadamuchasvueltas_mad;

import java.util.Random;
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
        int edadMama= FuncionesPersona.valorEstadisticaAleatorio(30, 100);
        boolean vivaMama;
        boolean generoMama = true;
        byte sociabilidadMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaMama= (FuncionesPersona.valorEstadisticaAleatorio(50));
        
        //variablesPapa
        String nombrePapa = FuncionesPersona.nombreAleatorio(false);
        String apellidosPapa = FuncionesPersona.apellidosAleatorios()+FuncionesPersona.apellidosAleatorios();
        int edadPapa= (FuncionesPersona.valorEstadisticaAleatorio(30, 100));
        boolean vivoPapa;
        boolean generoPapa = false;
        byte sociabilidadPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaPapa= (FuncionesPersona.valorEstadisticaAleatorio(50));
        
        //variablesYo
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);

        String apellidosYo = apellidosPapa.substring(0,apellidosPapa.indexOf(" "))+apellidosMama.substring(0,apellidosMama.indexOf(" "));
        int edadYo=0;
        boolean vivoYo;
        boolean generoYo = FuncionesPersona.generoAleatorio();
        byte sociabilidadMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaMaxYo= (FuncionesPersona.valorEstadisticaAleatorio(50));
        
        
        // Creacion de aleatorio de hermanos.
        Random ran=new Random();
      
                    
          String nombreHermano1 = FuncionesPersona.nombreAleatorio(false);
        String apellidosHermano1 = FuncionesPersona.apellidosAleatorios()+FuncionesPersona.apellidosAleatorios();
        int edadHermano1= (FuncionesPersona.valorEstadisticaAleatorio(30, 100));
        boolean vivoHermano1;
        boolean generoHermano1 = false;
        byte sociabilidadHermano1= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaHermano1= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaHermano1= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadHermano1= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaHermano1= (FuncionesPersona.valorEstadisticaAleatorio(50));   
        
        String nombreHermano2 = FuncionesPersona.nombreAleatorio(false);
        String apellidosHermano2 = FuncionesPersona.apellidosAleatorios()+FuncionesPersona.apellidosAleatorios();
        int edadHermano2= (FuncionesPersona.valorEstadisticaAleatorio(30, 100));
        boolean vivoHermano2;
        boolean generoHermano2 = false;
        byte sociabilidadHermano2= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaHermano2= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaHermano2= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadHermano2= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaHermano2= (FuncionesPersona.valorEstadisticaAleatorio(50));  
        
        String nombreHermano3 = FuncionesPersona.nombreAleatorio(false);
        String apellidosHermano3 = FuncionesPersona.apellidosAleatorios()+FuncionesPersona.apellidosAleatorios();
        int edadHermano3= (FuncionesPersona.valorEstadisticaAleatorio(30, 100));
        boolean vivoHermano3;
        boolean generoHermano3 = false;
        byte sociabilidadHermano3= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaHermano3= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaHermano3= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadHermano3= (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaHermano3= (FuncionesPersona.valorEstadisticaAleatorio(50));  
       
        
        System.out.println(FuncionesPersona.imprimePersona(nombreYo, apellidosYo, generoYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo));
        
        System.out.println(FuncionesPersona.imprimePersona(nombreMama, apellidosMama, generoMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));
        
        System.out.println(FuncionesPersona.imprimePersona(nombrePapa, apellidosPapa, generoPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));
    }
}
