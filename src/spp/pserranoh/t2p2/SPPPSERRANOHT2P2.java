/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.t2p2;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHT2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pablo Serrano Hernández A01410753 (IMT)
        //Programa que analice dos números enteros.
        System.out.println("Bienvenido al programa");
        operacion();
        
        System.out.println("Adios, muchas gracias");
        
    }
static int data(String valor){
    Scanner teclado = new Scanner (System.in);
    
    System.out.print("Ingrese " + valor + ": ");
    int datos = teclado.nextInt();
    
    return datos;
}  
static void div(int valor){
    if ((valor%2)==0){
        System.out.println(valor+" es un número par.");
    } if ((valor%3)==0){
          System.out.println(valor+" es un número divisible entre 3.");
        } if ((valor%5)==0) {
            System.out.println(valor+" es un número divisible entre 5.\n");
            } else {}
}
static void operacion(){
    int valinf = data("valor inferior");
    int valsup = data("valor superior");
    int count = valinf - 1;
    System.out.println("Los valores entre "+valinf+" y "+valsup+" son: ");
    while (count < valsup){
        System.out.println(count=count+1);
    }System.out.println("");
    div(valinf);
    div(valsup);
    
}

}
