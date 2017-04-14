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
public class estatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner estatura = new Scanner(System.in);
        //Creacion y asignacion de variables
        double p1, p2, p3, p4, p5, suma, media;
        //Solicitud ingreso de variables
        System.out.println("Ingrese la estutura de la persona 1");
        p1=estatura.nextDouble();
        System.out.println("Ingrese la estutura de la persona 2");
        p2=estatura.nextDouble();
        System.out.println("Ingrese la estutura de la persona 3");
        p3=estatura.nextDouble();
        System.out.println("Ingrese la estutura de la persona 4");
        p4=estatura.nextDouble();
        System.out.println("Ingrese la estutura de la persona 5");
        p5=estatura.nextDouble();
        //Operaciones
        suma=p1+p2+p3+p4+p5;
        media=suma/5;
        //Resultado en pantalla
        System.out.println("La media del curso es: "+media);
    }
    
}
