
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
    static ArrayList<Usuarios> Usuarios = new ArrayList<>();

    public ManejoDeUsuarios() {
    }

    public ArrayList<Usuarios> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> Usuarios) {
        ManejoDeUsuarios.Usuarios = Usuarios;
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
            Usuarios.add(O); 
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
            for (int i = 0; i < Usuarios.size(); i++) {
                pw.writeInt(Usuarios.get(i).getId());
                pw.writeUTF(Usuarios.get(i).getNombre());
                pw.writeUTF(Usuarios.get(i).getApellido());
                pw.writeInt(Usuarios.get(i).getPartidasJugadas());
                pw.writeInt(Usuarios.get(i).getPartidasGanadas());
                pw.writeInt(Usuarios.get(i).getPartidasPerdidas());
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
}
