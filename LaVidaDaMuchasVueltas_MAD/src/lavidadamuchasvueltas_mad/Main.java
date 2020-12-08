
package lavidadamuchasvueltas_mad;

import java.util.Random;
import personas.FuncionesPersona;

/**
 *
 * @author 1DAW
 */
public class Main {
    //Boolean TRUE: MUJER
    //Boolean FALSE: HOMBRE
    
    public static void main(String[] args) {
         Random ran = new Random();
        
        
        //variablesMama
        boolean generoMama = true;
        String nombreMama = FuncionesPersona.nombreAleatorio(generoMama);
        String apellidoMama1 = FuncionesPersona.apellidosAleatorios();
        String apellidosMama = apellidoMama1 + FuncionesPersona.apellidosAleatorios();
        int edadMama = FuncionesPersona.valorEstadisticaAleatorio(30);
        boolean vivaMama;
        byte sociabilidadMama = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaMama = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaMama = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadMama = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaMama = (FuncionesPersona.valorEstadisticaAleatorio(50));

        
        //variablesPapa
        boolean generoPapa = false;
        String nombrePapa = FuncionesPersona.nombreAleatorio(generoPapa);
        String apellidoPapa1 = FuncionesPersona.apellidosAleatorios();
        String apellidosPapa = apellidoPapa1 + FuncionesPersona.apellidosAleatorios();
        int edadPapa = (FuncionesPersona.valorEstadisticaAleatorio(30));
        boolean vivoPapa;
        byte sociabilidadPapa = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte empatiaPapa = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte inteligenciaPapa = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte velocidadPapa = (FuncionesPersona.valorEstadisticaAleatorio(50));
        byte fuerzaPapa = (FuncionesPersona.valorEstadisticaAleatorio(50));

        
        //variablesYo
        boolean generoYo = FuncionesPersona.generoAleatorio();
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        String apellidosYo = apellidoPapa1 + apellidoMama1;
        int edadYo = 0;
        boolean vivoYo;
        byte sociabilidadMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(sociabilidadPapa,sociabilidadMama));
        byte empatiaMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(empatiaPapa,empatiaMama));
        byte inteligenciaMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(inteligenciaPapa,inteligenciaMama));
        byte velocidadMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(velocidadPapa,velocidadMama));
        byte fuerzaMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(fuerzaPapa,fuerzaMama));
        
        byte sociabilidadYo=(FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte empatiaYo=(FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte inteligenciaYo=(FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte velocidadYo=(FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte fuerzaYo=(FuncionesPersona.valorEstadisticaAleatorio(0, 5));
                
                

        
        //Condición edad mínima padres
        byte edadMinPadres;
        if (edadMama > edadPapa) {
            edadMinPadres= (byte) (edadPapa);
        } else {
            edadMinPadres = (byte) (edadMama);
        }

        
        // Creacion de aleatorio de hermanos.
        String nombreHermano1="";
        String apellidosHermano1="";
        int edadHermano1;
        boolean vivoHermano1;
        boolean generoHermano1;
        byte sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1;
       
        
        String nombreHermano2="";
        String apellidosHermano2="";
        int edadHermano2;
        boolean vivoHermano2;
        boolean generoHermano2;
        byte sociabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2, fuerzaHermano2; 
       
       
        String nombreHermano3="";
        String apellidosHermano3="";
        int edadHermano3;
        boolean vivoHermano3;
        boolean generoHermano3;
        byte sociabilidadHermano3, empatiaHermano3, inteligenciaHermano3, velocidadHermano3, fuerzaHermano3;
       

        switch (ran.nextInt(4)) {
            case 0:
                break;

            case 3:
                nombreHermano3 = FuncionesPersona.nombreAleatorio(FuncionesPersona.generoAleatorio());
                apellidosHermano3 = apellidosYo;
                edadHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(0, edadMinPadres));
                vivoHermano3=true;
                generoHermano3 = false;
                sociabilidadHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                empatiaHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                inteligenciaHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                velocidadHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                fuerzaHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));

            case 2:
                nombreHermano2 = FuncionesPersona.nombreAleatorio(FuncionesPersona.generoAleatorio());
                apellidosHermano2 = apellidosYo;
                edadHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(0, edadMinPadres));
                vivoHermano2=true;
                generoHermano2 = false;
                sociabilidadHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                empatiaHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                inteligenciaHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                velocidadHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                fuerzaHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));

            case 1:
                nombreHermano1 = FuncionesPersona.nombreAleatorio(FuncionesPersona.generoAleatorio());
                apellidosHermano1 = apellidosYo;
                edadHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(0, edadMinPadres));
                vivoHermano1=true;
                generoHermano1 = false;
                sociabilidadHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                empatiaHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                inteligenciaHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                velocidadHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                fuerzaHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                break;
                
        }

        System.out.println(FuncionesPersona.imprimePersona(nombreYo, apellidosYo, generoYo, edadYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo));

        System.out.println(FuncionesPersona.imprimePersona(nombreMama, apellidosMama, generoMama, edadMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));

        System.out.println(FuncionesPersona.imprimePersona(nombrePapa, apellidosPapa, generoPapa, edadPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));
         }
}
