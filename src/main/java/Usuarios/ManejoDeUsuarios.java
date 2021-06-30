
package Usuarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ManejoDeUsuarios {
    private static ArrayList<Usuarios> ListaUsuarios = new ArrayList<>();

    public ManejoDeUsuarios() {
    }

    public static ArrayList<Usuarios> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuarios> Usuarios) {
        ManejoDeUsuarios.ListaUsuarios = Usuarios;
    }
    
    
    //Carga de Usuarios al programa mediante un array
    public static void CargarUsuarios() {
        File archivo = null;
        FileInputStream  fr = null;
        DataInputStream br = null;

        try {
            archivo = new File("Datos/Usuarios.dat");
            fr = new FileInputStream(archivo);
            br = new DataInputStream(fr);
            int Id;
            String Nombre;
            String Apellido;
            int PartidasJugadas;
            int PartidasGanadas;
            int PartidasPerdidas;
            boolean masregistros = true;
            while (masregistros) {
            try
                {
            Id= br.readInt();
            Nombre= br.readUTF();
            Apellido =br.readUTF();
            PartidasJugadas= br.readInt();
            PartidasGanadas= br.readInt();
            PartidasPerdidas= br.readInt();
            Usuarios O = new Usuarios(Id,Nombre, Apellido, PartidasJugadas,PartidasGanadas,PartidasPerdidas);
            ListaUsuarios.add(O); 
            }catch(EOFException ex){
            masregistros=false;          
                    }
            }
        } catch (IOException | NumberFormatException  e1) {
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }
    }
    //Grabar usuarios en el sistema
    public static void GrabarUsuarios() {
        FileOutputStream Fs = null;
        DataOutputStream pw = null;       
        try {
            Fs = new FileOutputStream("Datos/Usuarios.dat");
            pw = new DataOutputStream(Fs);
            for (int i = 0; i < ListaUsuarios.size(); i++) {
                pw.writeInt(ListaUsuarios.get(i).getId());
                pw.writeUTF(ListaUsuarios.get(i).getNombre());
                pw.writeUTF(ListaUsuarios.get(i).getApellido());
                pw.writeInt(ListaUsuarios.get(i).getPartidasJugadas());
                pw.writeInt(ListaUsuarios.get(i).getPartidasGanadas());
                pw.writeInt(ListaUsuarios.get(i).getPartidasPerdidas());
            }
        } catch (IOException e1) {
        } finally {
            try {
                if (Fs != null) {
                    Fs.close();
                }
            } catch (IOException e2) {
            }
        }
    }
    public static int BuscarIdPorNombre(String Nombre){
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            if(ListaUsuarios.get(i).getNombre().equals(Nombre)){
                return ListaUsuarios.get(i).getId();
            }
        }
        return -1;
    }
    public static void AsignarJuegoPorNombre(String Nombre){
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            if(ListaUsuarios.get(i).getNombre().equals(Nombre)){
                int Partidas =ListaUsuarios.get(i).getPartidasJugadas();
                ListaUsuarios.get(i).setPartidasJugadas(Partidas+1);
            }
        }
    }
    public static void AsignarDerrotaPorID(int id){
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            if(ListaUsuarios.get(i).getId()==id){
                int Partidas =ListaUsuarios.get(i).getPartidasPerdidas();
                ListaUsuarios.get(i).setPartidasPerdidas(Partidas+1);
            }
        }
    }
    public static void AsignarVictoriaPorID(int id){
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            if(ListaUsuarios.get(i).getId()==id){
                int Partidas =ListaUsuarios.get(i).getPartidasGanadas();
                ListaUsuarios.get(i).setPartidasGanadas(Partidas+1);
            }
        }
    }
}
