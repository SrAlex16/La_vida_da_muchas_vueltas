/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavidadamuchasvueltas_mad;

/**
 *
 * @author 1DAW
 */
public class Main {

    public static void main(String[] args) {
        
        Boolean generoYo=funcionesPersona.generoAleatorio();
        String nombreYo=funcionesPersona.nombreAleatorio(generoYo);
        String apellidosYo=funcionesPersona.apellidosAleatorios()+" "+funcionesPersona.apellidosAleatorios();
        
        
    }
    
}
