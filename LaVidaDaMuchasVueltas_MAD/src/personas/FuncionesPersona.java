/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.Random;

/**
 *
 * @author 1DAW
 */
public class FuncionesPersona {

    public static Boolean generoAleatorio() {
        return new Random().nextBoolean();
    }

    public static String nombreAleatorio(boolean bool) {
        Random ran = new Random();
        String[] nombresHombre = {"Eustaquio", "Fernando", "Sepher", "Ali", "Mariano", "Pato", "Xerxes", "Antón", "Claudio",
            "Koldo", "Patricio", "Alexios", "Manuel", "Rafael", "Mauricio", "Gregorio", "Íker", "Carlos", "Javier", "Francisco",
            "Nemesio", "Anselmo", "Miguel", "Ignacio", "Oscar", "Alex", "Juan", "Lander", "Agustin", "Cesar", "Natxo", "Nacho",
            "Javier", "Jorge", "Pablo", "Guillermo", "Pepe", "Gabriel", "Juan", "Francisco", "Franco", "Miguel", "Gonzalo",
            "Abrahán", "Luís", "Juan", "Rafael", "Alberto", "Raúl", "Abel", "Antonio", "Enrique", "Jose", "Adrian", "Dario", "Mateo",
            "Luis", "Alejandro", "Leandro", "Enzo", "Paco", "Amador", "Felix"};

        String[] nombresMujer = {"Cristobalina", "Paca", "Presentación", "Sarai", "Antonia",
            "Loli", "Juani", "Olga", "Susana", "Ruth", "Eustaquia", "Godofreda", "Josefina",
            "Ermerigilda", "Úrsula", "Angie", "Carla", "Isabel", "Marta", "Dolores", "Sonia",
            "Raquel", "Esther", "Erika", "Patrocinio", "Luisa", "Natalia", "Almudena", "Laura",
            "Kassandra", "Violeta", "María", "Mery", "Susana", "Daniela", "Juana", "Rebeca", "Eustaquia",
            "Herminia", "Sandra", "Lorena", "Maria", "Paula", "Ainhoa", "Mar", "Manoli", "Julia",
            "Rocio", "Marina", "Arelis", "Blanca", "Celeste", "Lola", "Dolores", "Yolanda", "Noemí",
            "Nuria", "Carmen", "Sheila", "Lucia", "Alia", "Alma", "Cristina", "Lucy", "Tamara", "Victoria"};
        if (bool == true) {
            return nombresMujer[ran.nextInt(nombresMujer.length)] + " ";
        } else {
            return nombresHombre[ran.nextInt(nombresHombre.length)] + " ";
        }
    }

    public static String apellidosAleatorios() {
        Random ran = new Random();
        String[] apellidos = {"Fernández", "De todos los santos", "Heredia", "Aguirre", "Del Piero",
            "Trump", "Obama", "Rajoy", "Pérez", "Reverte", "Rojas", "Muñoz", "de la Rosa", "de la O",
            "Guiérrez", "Molina", "López", "Romero", "Franco", "Martínez", "Fernández", "Bas", "Buttera",
            "Pajero", "Vega", "Guzmán", "Varo", "Páramos", "Pérez", "Vivo", "Piernas", "Moco", "Verde",
            "Pitagoras", "Pintor", "Delgado", "Vietes", "Portero", "Pestaña", "Guerrero", "Sardà",
            "Reyes", "Callado", "Santisteban", "Rubio", "Flores", "Enfriasopas", "Gallego", "Ventura",
            "Garcia", "Melero", "Morales", "Soldado", "Silva", "Hernández", "Ruiz", "Machís", "Duarte", "Díaz",
            "Vico", "Montoro", "Sacacuernos", "Cermuzo", "Cancamusa"};

        return apellidos[ran.nextInt(apellidos.length)] + " ";
    }

    public static byte valorEstadisticaAleatorio() {
        Random ran = new Random();
        return (byte) (ran.nextInt(100));
    }

    public static byte valorEstadisticaAleatorio(int min) {
        Random ran = new Random();
        return (byte) ((ran.nextInt(100 - min)) + min);
    }

    public static byte valorEstadisticaAleatorio(int min, int max) {
        Random ran = new Random();
        byte resultado;
        if (min > max) {
            resultado=valorEstadisticaAleatorio(max, min);
        } else {
            resultado=(byte)((ran.nextInt(max - min)) + min);
        }
        return resultado;
    }

    public static String imprimePersona(String nombre, String apellidos, boolean genero, int edad, byte sociabilidad, byte empatia, byte inteligencia, byte velocidad, byte fuerza) {

        String info = nombre + apellidos + "(" + (genero ? " Mujer" : " Hombre") + ")\n" + edad + " años\n" + "------------" + "\n Sociabilidad: " + sociabilidad
                + "\n Empatía: " + empatia + "\n Inteligencia: " + inteligencia + "\n Velocidad: " + velocidad + "\n Fuerza: " + fuerza + "\n\n";
        return info;
    }

}
