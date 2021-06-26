
package Usuarios;

import static Usuarios.ManejoDeUsuarios.getListaUsuarios;

public class Usuarios {
    private int Id;
    private String Nombre;
    private String Apellido;
    private int PartidasJugadas;
    private int PartidasGanadas;
    private int PartidasPerdidas;

    public Usuarios(int Id, String Nombre, String Apellido, int PartidasJugadas, int PartidasGanadas, int PartidasPerdidas) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.PartidasJugadas = PartidasJugadas;
        this.PartidasGanadas = PartidasGanadas;
        this.PartidasPerdidas = PartidasPerdidas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getPartidasJugadas() {
        return PartidasJugadas;
    }

    public void setPartidasJugadas(int PartidasJugadas) {
        this.PartidasJugadas = PartidasJugadas;
    }

    public int getPartidasGanadas() {
        return PartidasGanadas;
    }

    public void setPartidasGanadas(int PartidasGanadas) {
        this.PartidasGanadas = PartidasGanadas;
    }

    public int getPartidasPerdidas() {
        return PartidasPerdidas;
    }

    public void setPartidasPerdidas(int PartidasPerdidas) {
        this.PartidasPerdidas = PartidasPerdidas;
    }
    //Verificación si el id está en uso
    public boolean IdEnUso(int Id){
        for (int x = 0; x < getListaUsuarios().size(); x++) {          
            if(Id==ManejoDeUsuarios.getListaUsuarios().get(x).Id){
                return false;
            }
        }
        return true;
    }
}
