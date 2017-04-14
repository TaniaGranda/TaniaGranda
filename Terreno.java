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
public class Terreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner t = new Scanner(System.in);
        //Creacion de variables
        double anchura, longitud, costoM, costoT;
        //Solicitud ingreso de variables
        System.out.println("Ingrese la anchura del terreno");
        anchura=t.nextDouble();
        System.out.println("Ingrese la longitud  del terreno");
        longitud=t.nextDouble();
        System.out.println("Ingrese el costo del terreno por metro");
        costoM=t.nextDouble();
        //Operaciones
        costoT=(anchura*longitud)*costoM;
        //Mostrar por pantalla resultado
        System.out.println("El costo total a pagar es: "+costoT);
        
        
    }
    
}
