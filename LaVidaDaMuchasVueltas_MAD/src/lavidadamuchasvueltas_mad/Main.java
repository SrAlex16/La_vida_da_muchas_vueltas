package lavidadamuchasvueltas_mad;

import java.util.Random;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);

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
        boolean vivoYo = true;
        byte sociabilidadMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(sociabilidadPapa, sociabilidadMama));
        byte empatiaMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(empatiaPapa, empatiaMama));
        byte inteligenciaMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(inteligenciaPapa, inteligenciaMama));
        byte velocidadMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(velocidadPapa, velocidadMama));
        byte fuerzaMaxYo = (FuncionesPersona.valorEstadisticaAleatorio(fuerzaPapa, fuerzaMama));

        byte sociabilidadYo = (FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte empatiaYo = (FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte inteligenciaYo = (FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte velocidadYo = (FuncionesPersona.valorEstadisticaAleatorio(0, 5));
        byte fuerzaYo = (FuncionesPersona.valorEstadisticaAleatorio(0, 5));

        //Condición edad mínima padres
        byte edadMinPadres;
        if (edadMama > edadPapa) {
            edadMinPadres = (byte) (edadPapa);
        } else {
            edadMinPadres = (byte) (edadMama);
        }

        // Creacion de aleatorio de hermanos.
        String nombreHermano1 = "";
        String apellidosHermano1 = "";
        int edadHermano1 = -1;
        boolean vivoHermano1 = true;
        boolean generoHermano1 = true;
        byte sociabilidadHermano1 = 0, empatiaHermano1 = 0, inteligenciaHermano1 = 0, velocidadHermano1 = 0, fuerzaHermano1 = 0;

        String nombreHermano2 = "";
        String apellidosHermano2 = "";
        int edadHermano2 = -1;
        boolean vivoHermano2 = true;
        boolean generoHermano2 = true;
        byte sociabilidadHermano2 = 0, empatiaHermano2 = 0, inteligenciaHermano2 = 0, velocidadHermano2 = 0, fuerzaHermano2 = 0;

        String nombreHermano3 = "";
        String apellidosHermano3 = "";
        int edadHermano3 = -1;
        boolean vivoHermano3 = true;
        boolean generoHermano3 = true;
        byte sociabilidadHermano3 = 0, empatiaHermano3 = 0, inteligenciaHermano3 = 0, velocidadHermano3 = 0, fuerzaHermano3 = 0;

        switch (ran.nextInt(4)) {
            case 0:
                break;

            case 3:
                generoHermano3 = FuncionesPersona.generoAleatorio();
                nombreHermano3 = FuncionesPersona.nombreAleatorio(generoHermano3);
                apellidosHermano3 = apellidosYo;
                edadHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(0, edadMinPadres));
                vivoHermano3 = true;
                sociabilidadHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                empatiaHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                inteligenciaHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                velocidadHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                fuerzaHermano3 = (FuncionesPersona.valorEstadisticaAleatorio(50));

            case 2:
                generoHermano2 = FuncionesPersona.generoAleatorio();
                nombreHermano2 = FuncionesPersona.nombreAleatorio(generoHermano2);
                apellidosHermano2 = apellidosYo;
                edadHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(0, edadMinPadres));
                vivoHermano2 = true;
                sociabilidadHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                empatiaHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                inteligenciaHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                velocidadHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                fuerzaHermano2 = (FuncionesPersona.valorEstadisticaAleatorio(50));

            case 1:
                generoHermano1 = FuncionesPersona.generoAleatorio();
                nombreHermano1 = FuncionesPersona.nombreAleatorio(generoHermano1);
                apellidosHermano1 = apellidosYo;
                edadHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(0, edadMinPadres));
                vivoHermano1 = true;
                sociabilidadHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                empatiaHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                inteligenciaHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                velocidadHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                fuerzaHermano1 = (FuncionesPersona.valorEstadisticaAleatorio(50));
                break;

        }

        while (vivoYo == true) {
            System.out.println("1 - Imprimir mi información\n" + "2 - Imprimir información de mi familia\n"
                    + "3 - Hacer cosas\n" + "4 - Crecer\n" + "5 - terminar (morir)\n\n");
            byte respuesta = Byte.parseByte(sc.nextLine());

            while (respuesta > 5 && respuesta < 1) {
                System.out.println("Por favor, ingrese un número entre 1 y 5");
            }

            switch (respuesta) {
                case 1:
                    System.out.println(FuncionesPersona.imprimePersona(nombreYo, apellidosYo, generoYo, edadYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo));
                    break;
                    
                case 2:
                    System.out.println(FuncionesPersona.imprimePersona(nombreMama, apellidosMama, generoMama, edadMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama, fuerzaMama));

                    System.out.println(FuncionesPersona.imprimePersona(nombrePapa, apellidosPapa, generoPapa, edadPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa, fuerzaPapa));

                    if (edadHermano1 != -1) {
                        System.out.println(FuncionesPersona.imprimePersona(nombreHermano1, apellidosHermano1, generoHermano1, edadHermano1, sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1, fuerzaHermano1));
                    }
                    if (edadHermano2 != -1) {
                        System.out.println(FuncionesPersona.imprimePersona(nombreHermano2, apellidosHermano2, generoHermano2, edadHermano2, sociabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2, fuerzaHermano2));
                    }
                    if (edadHermano3 != -1) {
                        System.out.println(FuncionesPersona.imprimePersona(nombreHermano3, apellidosHermano3, generoHermano3, edadHermano3, sociabilidadHermano3, empatiaHermano3, inteligenciaHermano3, velocidadHermano3, fuerzaHermano3));
                    }
                    break;
                
                case 3:
                    break;
                    
                case 4:
                    edadYo++;
                    edadMama++;
                    edadPapa++;
                    edadHermano1++;
                    edadHermano2++;
                    edadHermano3++;
                    break;
                
                case 5:
                    vivoYo=false;

            }
        }
    }
}
