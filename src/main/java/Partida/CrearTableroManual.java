
package Partida;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CrearTableroManual {
    public static void CargarArchivo(File ArchivoACargar){
        int[] TableroC = null;
        List<List<Integer>> CRetrocede = new ArrayList<>();
        List<List<Integer>> CAvanza = new ArrayList<>();
        List<List<Integer>> CTiraDados = new ArrayList<>();
        List<List<Integer>> CSerpientes = new ArrayList<>();
        List<List<Integer>> CPierdeTurno = new ArrayList<>();
        List<List<Integer>> CEscalera = new ArrayList<>();
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
                                        if(TableroC[0]>=X &&TableroC[1]>=Y){
                                            //Detectando que la casilla no este ocupada
                                            ArrayList<Integer> Retrocede = new ArrayList<>();
                                            Retrocede.add(X);
                                            Retrocede.add(Y);
                                            Retrocede.add(NoC);
                                            if(ConfirmarExistencia(1,Retrocede,CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera)){
                                                CRetrocede.add(Retrocede);   
                                            }else{
                                                
                                            }
                                        }else{
                                        //No tiene numeros validos   
                                        }
                                //Si retrocede tiene error:
                                }catch(RuntimeException e){                                    
                                }
                            break;
                            
                            case "tiradados":
                                try{
                                    //Guardando casilla tiradados
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Y = Integer.valueOf(aux);
                                    
                                    //Comprobando valores validos
                                        if(TableroC[0]>=X &&TableroC[1]>=Y){
                                            //Detectando que la casilla no este ocupada
                                            ArrayList<Integer> TiraDado = new ArrayList<>();
                                            TiraDado.add(X);
                                            TiraDado.add(Y);
                                            if(ConfirmarExistencia(1,TiraDado,CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera)){
                                                CTiraDados.add(TiraDado);   
                                            }else{
                                            }
                                        }else{
                                        //No tiene numeros validos   
                                        }
                                //Si tiradados tiene error:
                                }catch(RuntimeException e){                                                            
                                }
                            break;
                            
                            case "subida":
                                try{
                                    //Guardando subida
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Y = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X2 = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Y2 = Integer.valueOf(aux);
                                    //Comprobando valores validos
                                        if(TableroC[0]>=X &&TableroC[1]>=Y&&TableroC[0]>=X2 &&TableroC[1]>=Y2){
                                            //Detectando que la casilla no este ocupada
                                            ArrayList<Integer> Escalera = new ArrayList<>();
                                            Escalera.add(X);
                                            Escalera.add(Y);
                                            Escalera.add(X2);
                                            Escalera.add(Y2);
                                            if(ConfirmarExistencia(2,Escalera,CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera)){
                                                CEscalera.add(Escalera);   
                                            }else{
                                            }
                                        }else{
                                        //No tiene numeros validos   
                                        }
                                //Si Escalera tiene error:
                                }catch(RuntimeException e){                                                            
                                }
                            break;
                            
                            case "avanza":
                                try{
                                    //Guardando casilla avanza
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
                                    int CaR = Integer.valueOf(aux);
                                    //Comprobando valores validos
                                        if(TableroC[0]>=X &&TableroC[1]>=Y){
                                            //Detectando que la casilla no este ocupada
                                            ArrayList<Integer> Avanza = new ArrayList<>();
                                            Avanza.add(X);
                                            Avanza.add(Y);
                                            Avanza.add(CaR);
                                            if(ConfirmarExistencia(1,Avanza,CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera)){
                                                CAvanza.add(Avanza);   
                                            }else{
                                            }
                                        }else{
                                        //No tiene numeros validos   
                                        }
                                //Si avanza tiene error:
                                }catch(RuntimeException e){                                                            
                                }
                            break;
                            
                            case "pierdeturno":
                                try{
                                    //Guardando casilla pierdeturno
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Y = Integer.valueOf(aux);
                                    
                                    //Comprobando valores validos
                                        if(TableroC[0]>=X &&TableroC[1]>=Y){
                                            //Detectando que la casilla no este ocupada
                                            ArrayList<Integer> PierdeTurno = new ArrayList<>();
                                            PierdeTurno.add(X);
                                            PierdeTurno.add(Y);
                                            if(ConfirmarExistencia(1,PierdeTurno,CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera)){
                                                CPierdeTurno.add(PierdeTurno);   
                                            }else{
                                            }
                                        }else{
                                        //No tiene numeros validos   
                                        }
                                //Si PierdeTurno tiene error:
                                }catch(RuntimeException e){                                                            
                                }
                            break;
                            
                            case "bajada":
                                try{
                                    //Guardando bajada
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Y = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(',');
                                    aux = linea.substring(0, pos);
                                    int X2 = Integer.valueOf(aux);
                                    
                                    linea = linea.substring(pos + 1);
                                    pos = linea.indexOf(')');
                                    aux = linea.substring(0, pos);
                                    int Y2 = Integer.valueOf(aux);
                                    //Comprobando valores validos
                                        if(TableroC[0]>=X &&TableroC[1]>=Y&&TableroC[0]>=X2 &&TableroC[1]>=Y2){
                                            //Detectando que la casilla no este ocupada
                                            ArrayList<Integer> Serpiente = new ArrayList<>();
                                            Serpiente.add(X);
                                            Serpiente.add(Y);
                                            Serpiente.add(X2);
                                            Serpiente.add(Y2);
                                            if(ConfirmarExistencia(2,Serpiente,CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera)){
                                                CSerpientes.add(Serpiente);   
                                            }else{
                                            }
                                        }else{
                                        //No tiene numeros validos   
                                        }
                                //Si bajada tiene error:
                                }catch(RuntimeException e){                                                            
                                }
                            break;   
                            default:
                                break;    
                        }
                    }catch(HeadlessException | NumberFormatException  e){
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
    public static boolean ConfirmarExistencia(int Caso, ArrayList<Integer> Acomparar,List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados, List<List<Integer>> CSerpientes,List<List<Integer>> CPierdeTurno,List<List<Integer>> CEscalera ){
    if(Caso==1){
        //Para cualquier casilla que no sea serpiente o escalera
        if(!(CRetrocede.isEmpty())){
            for(int i = 0; i < CRetrocede.size(); i++){
                if(CRetrocede.get(i).get(0)==Acomparar.get(0)&&CRetrocede.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }
            }
        } 
        if(!(CAvanza.isEmpty())){
            for(int i = 0; i < CAvanza.size(); i++){
                if(CAvanza.get(i).get(0)==Acomparar.get(0)&&CAvanza.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }
            }
        }
        if(!(CTiraDados.isEmpty())){
            for(int i = 0; i < CTiraDados.size(); i++){
                if(CTiraDados.get(i).get(0)==Acomparar.get(0)&&CTiraDados.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }
            }
        }
        if(!(CEscalera.isEmpty())){
            for(int i = 0; i < CEscalera.size(); i++){
                if(CEscalera.get(i).get(0)==Acomparar.get(0)&&CEscalera.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CEscalera.get(i).get(2)==Acomparar.get(0)&&CEscalera.get(i).get(3)==Acomparar.get(1)){
                    return false;
                }
            }
        }
        if(!(CPierdeTurno.isEmpty())){
            for(int i = 0; i < CPierdeTurno.size(); i++){
                if(CPierdeTurno.get(i).get(0)==Acomparar.get(0)&&CPierdeTurno.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }
            }
        }
        if(!(CSerpientes.isEmpty())){
            for(int i = 0; i < CSerpientes.size(); i++){
                if(CSerpientes.get(i).get(0)==Acomparar.get(0)&&CSerpientes.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CSerpientes.get(i).get(2)==Acomparar.get(0)&&CSerpientes.get(i).get(3)==Acomparar.get(1)){
                    return false;
                }
            }
        }
    }else{
        //para serpientes y escaleras
        if(!(CRetrocede.isEmpty())){
            for(int i = 0; i < CRetrocede.size(); i++){
                if(CRetrocede.get(i).get(0)==Acomparar.get(0)&&CRetrocede.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CRetrocede.get(i).get(0)==Acomparar.get(2)&&CRetrocede.get(i).get(1)==Acomparar.get(3)){
                    return false;
                }
            }
        } 
        if(!(CAvanza.isEmpty())){
            for(int i = 0; i < CAvanza.size(); i++){
                if(CAvanza.get(i).get(0)==Acomparar.get(0)&&CAvanza.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CAvanza.get(i).get(0)==Acomparar.get(2)&&CAvanza.get(i).get(1)==Acomparar.get(3)){
                    return false;
                }
            }
        }
        if(!(CTiraDados.isEmpty())){
            for(int i = 0; i < CTiraDados.size(); i++){
                if(CTiraDados.get(i).get(0)==Acomparar.get(0)&&CTiraDados.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CTiraDados.get(i).get(0)==Acomparar.get(2)&&CTiraDados.get(i).get(1)==Acomparar.get(3)){
                    return false;
                }
            }
        }
        if(!(CEscalera.isEmpty())){
            for(int i = 0; i < CEscalera.size(); i++){
                if(CEscalera.get(i).get(0)==Acomparar.get(0)&&CEscalera.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CEscalera.get(i).get(2)==Acomparar.get(0)&&CEscalera.get(i).get(3)==Acomparar.get(1)){
                    return false;
                }else if(CEscalera.get(i).get(2)==Acomparar.get(2)&&CEscalera.get(i).get(3)==Acomparar.get(3)){
                    return false;
                }else if(CEscalera.get(i).get(0)==Acomparar.get(2)&&CEscalera.get(i).get(1)==Acomparar.get(3)){
                    return false;
                }
            }
        }
        if(!(CPierdeTurno.isEmpty())){
            for(int i = 0; i < CPierdeTurno.size(); i++){
                if(CPierdeTurno.get(i).get(0)==Acomparar.get(0)&&CPierdeTurno.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CPierdeTurno.get(i).get(0)==Acomparar.get(2)&&CPierdeTurno.get(i).get(1)==Acomparar.get(3)){
                    return false;
                }
            }
        }
        if(!(CSerpientes.isEmpty())){
            for(int i = 0; i < CSerpientes.size(); i++){
                if(CSerpientes.get(i).get(0)==Acomparar.get(0)&&CSerpientes.get(i).get(1)==Acomparar.get(1)){
                    return false;
                }else if(CSerpientes.get(i).get(2)==Acomparar.get(0)&&CSerpientes.get(i).get(3)==Acomparar.get(1)){
                    return false;
                }else if(CSerpientes.get(i).get(2)==Acomparar.get(2)&&CSerpientes.get(i).get(3)==Acomparar.get(3)){
                    return false;
                }else if(CSerpientes.get(i).get(0)==Acomparar.get(2)&&CSerpientes.get(i).get(1)==Acomparar.get(3)){
                    return false;
                }
            }
        }
    }
    return true;
    }
}
