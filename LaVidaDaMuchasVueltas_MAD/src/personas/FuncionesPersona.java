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
    public static Boolean generoAleatorio(){
    Random ran = new Random();
        if (ran.nextBoolean()) {
            System.out.println("Mujer");
            return true;
        } else {
            System.out.println("Hombre");
            return false;
        }
    }
}