
package Partida;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CrearTableroManual {
    public static void CargarArchivo(File ArchivoACargar){
        int[] TableroC = null;
        ArrayList<Integer> Retrocede = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
            try{
                int pos;
                String aux;
                String Identificador;
                String linea;
                while ((linea = br.readLine()) != null) {
                    //Detección del identificador de objeto
                    try{
                        pos = linea.indexOf('(');
                        Identificador = linea.substring(0, pos);
                        switch (Identificador) {
                            case "tablero":
                                try{
                                    linea = linea.substring(pos + 1);
                                    //Guardado de tablero
                                    //columnas
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int Columnas = Integer.valueOf(aux);
                                    linea = linea.substring(pos + 1);
                                    //Filas
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Filas = Integer.valueOf(aux);
                                    //comparando si ya existe tablero
                                        if(TableroC==null){
                                            TableroC = new int [2];
                                            TableroC[0] = Columnas;
                                            TableroC[1] = Filas;
                                        }
                                //Si el tablero tiene error:
                                }catch(RuntimeException e){                                    
                                }
                            break;
                            case "retrocede":
                                try{
                                    //Guardando casilla retrocede
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int Y = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int NoC = Integer.valueOf(aux);
                                    //Comprobando valores validos
                                    if(X){
                                    Retrocede
                                    }
                                //Si retrocede tiene error:
                                }catch(RuntimeException e){                                    
                                }
                            break;
                            
                        }
                    }catch(HeadlessException | NumberFormatException | ParseException e){
                        JOptionPane.showMessageDialog(null, "Al archivo le faltaba un parametro para poder cargarse");
                    } 
                }
             }catch (IOException e1) {
            } finally {
                try {
                    if (fr != null) {
                        fr.close();
                    }
                } catch (IOException e2) {
                }
            }
    }
}
