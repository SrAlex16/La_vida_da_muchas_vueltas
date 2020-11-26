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
        Random ran = new Random();
        if (ran.nextBoolean()) {
            System.out.println("Mujer ");
            return true;
        } else {
            System.out.println("Hombre ");
            return false;
        }
    }

    public static String nombreAleatorio(boolean bool) {
        Random ran = new Random();
        String nombre = "";

        switch (ran.nextInt(5)) {
            case 0:
                nombre = (bool ? "María" : "Mariano");
                break;

            case 1:
                nombre = (bool ? "Lucía" : "Alberto");
                break;

            case 2:
                nombre = (bool ? "Mariana" : "Roberto");
                break;

            case 3:
                nombre = (bool ? "Marta" : "Pedro");
                break;

            case 4:
                nombre = (bool ? "Rocío" : "Jose");
                break;

            case 5:
                nombre = (bool ? "Paula" : "Alberto");
                break;

        }
        return nombre;
    }

    public static String apellidosAleatorios() {
        Random ran = new Random();
        String apellidos = "";
        switch (ran.nextInt(5)) {
            case 0:
                apellidos = " Gomez";
                break;
            case 1:
                apellidos = " Gutierrez";
                break;
            case 2:
                apellidos = " Perez";
                break;
            case 3:
                apellidos = " Sanchez";
                break;
            case 4:
                apellidos = " Iglesias";
                break;
        }
        return apellidos;
    }
}
