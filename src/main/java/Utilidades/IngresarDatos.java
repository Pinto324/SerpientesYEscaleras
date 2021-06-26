
package Utilidades;

import java.util.Scanner;

public class IngresarDatos {
    Scanner C = new Scanner(System.in);
    public IngresarDatos() {
    }
    
    public int IngresarEnteros(String mensajeDesplegar){
        System.out.println(mensajeDesplegar + " ");
        int number =  C.nextInt();
        return number;
    }
    public String IngresarString(String mensajeDesplegar){
        System.out.println(mensajeDesplegar + " ");
        String dato = C.next();
        return dato;
    }    
}
