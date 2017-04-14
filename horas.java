/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner h = new Scanner(System.in);
        //Creacion de variables
        int horas, min, seg, dias;
        //Solicitud ingreso de variables
        System.out.println("Ingrese una hora");
        horas=h.nextInt();
        //Operaciones
        dias=horas/24;
        min=horas*60;
        seg=horas*3600;
        //Mostrar por pantalla
        System.out.println(+horas+" tiene "+dias+" dias "+min+" minutos "+seg+" segundos ");
    }
    
}
