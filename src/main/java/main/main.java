
package main;

import InterfazGrafica.MenuPrincipal;
import Usuarios.*;

public class main {
    public static MenuPrincipal Menu = new MenuPrincipal();
    public static void main(String[] args){
        ManejoDeUsuarios.CargarUsuarios();
        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);
        Menu.setTitle("Menu Principal");
    }
}
