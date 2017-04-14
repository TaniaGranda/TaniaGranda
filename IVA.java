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
public class IVA {
static double iva=0.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner calIva = new Scanner(System.in);
        //declaracion y asignacion de variables
        double cp1=5.5,cp2=17,cp3=2.78, resp1, resp2, resp3, subtotal, iva, total;
        int p1,p2,p3;
        //Solicitud ingreso de variables
        System.out.println("Ingrese la cantidad Producto1");
        p1=calIva.nextInt();
        System.out.println("Ingrese la cantidad Producto2");
        p2=calIva.nextInt();
        System.out.println("Ingrese la cantidad Producto3");
        p3=calIva.nextInt();
        //Operaciones
        resp1=p1*cp1;
        resp2=p2*cp2;
        resp3=p3*cp3;
        subtotal=resp1+resp2+resp3;
        iva=subtotal*0.14;
        total=subtotal+iva;
        //Mostrar por pantalla
        System.out.println(" TOTAL PAGO "+total);
    }
    
}
