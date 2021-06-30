
package Utilidades;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Partida {
    private Casillas[][] Tablero = null;
    private ArrayList<Ficha> FichasDeJugadores;
    private int Filas;
    private int Columnas;
    private int NoSerpientes;
    private int NoEscaleras;
    private int NoTurnoff;
    
    public Partida(ArrayList<Ficha> FichasEnLaCasilla, int X, int Y, int NoSerpientes, int NoEscaleras, int NoTurnoff) {
        this.FichasDeJugadores = FichasEnLaCasilla;
        this.Filas = Y;
        this.Columnas = X;
        this.NoSerpientes = NoSerpientes;
        this.NoEscaleras = NoEscaleras;
        this.NoTurnoff = NoTurnoff;
        Tablero = new Casillas[Y][X];
        LlenarTablero();
    }
    
    //Constructor para tablero por archivo:
    public Partida(ArrayList<Ficha> FichasEnLaCasilla,int X, int Y, List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados,List<List<Integer>> CSerpientes,List<List<Integer>> CPierdeTurno,List<List<Integer>> CEscalera){
        this.FichasDeJugadores = FichasEnLaCasilla;
        LlenarTablero(X,Y, CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera);
    }
    

    public Casillas[][] getTablero() {
        return Tablero;
    }

    public void setTablero(Casillas[][] Tablero) {
        this.Tablero = Tablero;
    }

    public ArrayList<Ficha> getFichasDeJugadores() {
        return FichasDeJugadores;
    }

    public void setFichasDeJugadores(ArrayList<Ficha> FichasDeJugadores) {
        this.FichasDeJugadores = FichasDeJugadores;
    }

    public int getFilas() {
        return Filas;
    }

    public void setFilas(int Filas) {
        this.Filas = Filas;
    }

    public int getColumnas() {
        return Columnas;
    }

    public void setColumnas(int Columnas) {
        this.Columnas = Columnas;
    }
    
    public void LlenarTablero(){
        int ContadorCasillas = 1;
        ArrayList<Integer> Serpientes = new ArrayList<>();
        ArrayList<Integer> SerpientesRegreso = new ArrayList<>();
        ArrayList<Integer> Escaleras = new ArrayList<>();
        ArrayList<Integer> EscalerasFinal = new ArrayList<>();
        ArrayList<Integer> Turno;
        //Generacion de serpientes random
    do{
        //Limpiando valores
        Serpientes = new ArrayList<>();
        SerpientesRegreso = new ArrayList<>();
        Escaleras = new ArrayList<>();
        EscalerasFinal = new ArrayList<>();
        for(int i = 0; i < NoSerpientes ; i++){
            Random r1 = new Random();
            int ContadorSerpientes = (r1.nextInt(Columnas*Filas));
                if(!(ContadorSerpientes==(Columnas*Filas))){
                Serpientes.add(ContadorSerpientes);
                }else{
                    ContadorSerpientes = (r1.nextInt(Columnas*Filas));
                    if(ContadorSerpientes<(Columnas*Filas)/2){
                    ContadorSerpientes = (ContadorSerpientes+((Columnas*Filas)/2));    
                    Serpientes.add(ContadorSerpientes);
                    }else{
                    Serpientes.add(ContadorSerpientes);
                    }
                }
            int CasillaRegreso = r1.nextInt(ContadorSerpientes);
            if(CasillaRegreso > ((Columnas*Filas)/2)){
                SerpientesRegreso.add(CasillaRegreso-((Columnas*Filas)/2));
            }else if(CasillaRegreso==0||CasillaRegreso==1){
                SerpientesRegreso.add(CasillaRegreso+2);
            }else{
                SerpientesRegreso.add(CasillaRegreso);
            }
        }
        //Generación de escaleras random
            for(int i = 0; i < NoSerpientes ; i++){
                    Random r1 = new Random();
                    int EscaleraFinal = (r1.nextInt(Columnas*Filas));
                if(EscaleraFinal<(Columnas*Filas)/2){
                    EscaleraFinal=+(Columnas*Filas)/2;
                    EscalerasFinal.add(EscaleraFinal);
                }else{
                    EscalerasFinal.add(EscaleraFinal);
                }
                    int CasillaRegreso = r1.nextInt(EscaleraFinal-1)+2;
                    Escaleras.add(CasillaRegreso);
            }
        }while(!ValorRepetido(Serpientes,SerpientesRegreso,EscalerasFinal,Escaleras));
            for (int x = Columnas -1; x > -1 ; x--) {
                for (int y = Filas -1; y > -1 ; y--) {
                    JPanel M = new javax.swing.JPanel();
                    JLabel L = new javax.swing.JLabel();  
                    if(y%2==0){
                        if(x%2==0){
                            M.setBackground(Color.cyan);
                        }else{
                            M.setBackground(Color.PINK);
                        }
                    }else{
                        if(x%2==0){ 
                            M.setBackground(Color.PINK);
                        }else{
                            M.setBackground(Color.cyan);
                        }
                    }
                    //Asigna los jugadores a la primera casilla:
                    M.add(L);
                        if(ContadorCasillas == 1){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,FichasDeJugadores);
                        }
                    for (int i = 0; i < NoSerpientes ; i++) {
                        try{
                            if(Serpientes.get(i) == ContadorCasillas){
                                JLabel Cola = new javax.swing.JLabel(); 
                                Cola.setIcon(new ImageIcon("Casillas/ColaSerpienteV.png"));
                                JPanel C = new javax.swing.JPanel(); 
                                C.add(Cola);
                                C.setBackground(Color.red);
                                Tablero[x][y] = new CasillaSerpiente(SerpientesRegreso.get(i),ContadorCasillas,C,Cola,null);
                            }else if(SerpientesRegreso.get(i) == ContadorCasillas){
                                JLabel Cabeza = new javax.swing.JLabel(); 
                                Cabeza.setIcon(new ImageIcon("Casillas/CabezaSerpienteV.png"));
                                JPanel PanelCabeza = new javax.swing.JPanel();
                                PanelCabeza.add(Cabeza);
                                PanelCabeza.setBackground(Color.red);
                                Tablero[x][y] = new Casillas(SerpientesRegreso.get(i),PanelCabeza,Cabeza,null);
                            }
                        }catch(IndexOutOfBoundsException e){
                        }
                    }  
                    //Asignando escaleras:
                    for (int i = 0; i < NoEscaleras ; i++) {
                        if(EscalerasFinal.get(i) == ContadorCasillas){
                                JLabel Final = new javax.swing.JLabel(); 
                                Final.setIcon(new ImageIcon("Casillas/EscaleraFinal.png"));
                                JPanel PanelFinal = new javax.swing.JPanel(); 
                                PanelFinal.add(Final);
                                PanelFinal.setBackground(Color.GREEN);
                                Tablero[x][y] = new Casillas(EscalerasFinal.get(i),PanelFinal,Final,null);
                            }else if(Escaleras.get(i) == ContadorCasillas){
                                JLabel Inicio = new javax.swing.JLabel(); 
                                Inicio.setIcon(new ImageIcon("Casillas/EscaleraInicio.png"));
                                JPanel PanelInicio = new javax.swing.JPanel();
                                PanelInicio.add(Inicio);
                                PanelInicio.setBackground(Color.GREEN);
                                Tablero[x][y] = new CasillaEscalera(EscalerasFinal.get(i),ContadorCasillas,PanelInicio,Inicio,null);
                            }
                    }
                    if(!(ContadorCasillas == 1||ContadorCasillas== EscalerasFinal.get(0)||ContadorCasillas== EscalerasFinal.get(1)||ContadorCasillas== Escaleras.get(0)||ContadorCasillas== Escaleras.get(1) ||ContadorCasillas == SerpientesRegreso.get(0)||ContadorCasillas == SerpientesRegreso.get(1)||ContadorCasillas == Serpientes.get(0)||ContadorCasillas == Serpientes.get(1) )){
                        Tablero[x][y] = new Casillas(ContadorCasillas,M,L,null);
                    }
                    ContadorCasillas++; 
                }      
            }
    }
    //Metodo para constructor manual
    public void LlenarTablero(int X, int Y, List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados,List<List<Integer>> CSerpientes,List<List<Integer>> CPierdeTurno,List<List<Integer>> CEscalera){
        int ContadorCasillas = 1;
        List<List<Integer>> LugarCabeza = new ArrayList<>();
        List<List<Integer>> LugarEscaleras = new ArrayList<>();
        for (int x = X -1; x > -1 ; x--) {
            for (int y = Y -1; y > -1 ; y--) {
                    JPanel M = new javax.swing.JPanel();
                    JLabel L = new javax.swing.JLabel();  
                    if(y%2==0){
                        if(x%2==0){
                            M.setBackground(Color.cyan);
                        }else{
                            M.setBackground(Color.PINK);
                        }
                    }else{
                        if(x%2==0){ 
                            M.setBackground(Color.PINK);
                        }else{
                            M.setBackground(Color.cyan);
                        }
                    }
                    //Asigna los jugadores a la primera casilla:
                    M.add(L);
                    for(int i = 0; i < CRetrocede.size(); i++){
                        //primera casilla:
                        if(ContadorCasillas == 1){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,FichasDeJugadores);
                        //Para crear casilla de retrocede:
                        }else if(CRetrocede.get(i).get(0)==x && CRetrocede.get(i).get(1)==y){
                                JPanel PanelR = new javax.swing.JPanel();
                                JLabel LabelR = new javax.swing.JLabel(); 
                                PanelR.setBackground(Color.ORANGE);
                                Tablero[CRetrocede.get(i).get(0)][CRetrocede.get(i).get(1)]= new CasillaRetrocede(ContadorCasillas,PanelR,LabelR,null,CRetrocede.get(i).get(2));
                        //Para crear casilla de avanza:
                        }else if(CAvanza.get(i).get(0)==x && CAvanza.get(i).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.BLUE);
                            Tablero[CAvanza.get(i).get(0)][CAvanza.get(i).get(1)]= new CasillaAvanza(ContadorCasillas,PanelR,LabelR,null,CAvanza.get(i).get(2));
                        //Para tirar dados
                        }else if(CTiraDados.get(i).get(0)==x && CTiraDados.get(i).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.WHITE);
                            Tablero[x][y]= new CasillaTirarDados(ContadorCasillas,PanelR,LabelR,null);
                        //Para perder turno:
                        }else if(CPierdeTurno.get(i).get(0)==x && CPierdeTurno.get(i).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.BLACK);
                            Tablero[x][y]= new CasillaPerderTurno(ContadorCasillas,PanelR,LabelR,null);
                        //Para serpientes cola:
                        }else if(CSerpientes.get(i).get(0)==x && CSerpientes.get(i).get(1)==y){
                            int CabezaPotencial = 2;
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/ColaSerpienteV.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.red);
                            for(int j = 0; j < CRetrocede.size(); j++){
                                if(LugarCabeza.get(i).get(0)==CSerpientes.get(i).get(2)&&LugarCabeza.get(i).get(1)==CSerpientes.get(i).get(3)){
                                    CabezaPotencial= LugarCabeza.get(i).get(2);
                                }
                            }
                            Tablero[x][y]= new CasillaSerpiente(CabezaPotencial,ContadorCasillas,PanelR,LabelR,null);
                        //Para serpientes cabeza:
                        }else if(CSerpientes.get(i).get(2)==x && CSerpientes.get(i).get(3)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/CabezaSerpienteV.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.red);
                            ArrayList<Integer> CasillaS = new ArrayList<>();
                            CasillaS.add(x);
                            CasillaS.add(y);
                            CasillaS.add(ContadorCasillas);
                            LugarCabeza.add(CasillaS);
                            Tablero[x][y]= new Casillas(ContadorCasillas,PanelR,LabelR,null);
                        //Para escalera final
                        }else if(CEscalera.get(i).get(2)==x && CEscalera.get(i).get(3)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/EscaleraFinal.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.GREEN);
                            ArrayList<Integer> EscaleraS = new ArrayList<>();
                            EscaleraS.add(x);
                            EscaleraS.add(y);
                            EscaleraS.add(ContadorCasillas);
                            LugarEscaleras.add(EscaleraS);
                            Tablero[x][y]= new Casillas(ContadorCasillas,PanelR,LabelR,null);
                        //Para Escalera abajo:
                        }else if(CEscalera.get(i).get(0)==x && CEscalera.get(i).get(1)==y){
                            int LugarEscalera = (X*Y)-3;
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/EscaleraInicio.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.GREEN);
                            for(int j = 0; j < LugarEscaleras.size(); j++){
                                if(LugarEscaleras.get(i).get(0)==CEscalera.get(i).get(2)&&LugarEscaleras.get(i).get(1)==CEscalera.get(i).get(3)){
                                    LugarEscalera= LugarEscaleras.get(i).get(2);
                                }
                            }
                            Tablero[x][y]= new CasillaEscalera(LugarEscalera,ContadorCasillas,PanelR,LabelR,null);
                        }else if(Tablero[x][y]==null){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,null);
                        }                        
                    }
                    ContadorCasillas++; 
                }      
            }
    }
    public void MeterFichaPorNo(Ficha F){
        for (int x = 0; x < Columnas ; x++) {
            for (int y = 0; y < Filas ; y++) {
                if(Tablero[x][y].getNoCasilla()==F.getCasillaActual()){
                    if(Tablero[x][y].getFichasEnLaCasilla()!=null){
                        Tablero[x][y].getFichasEnLaCasilla().add(F);
                    }else{
                        ArrayList<Ficha> Fichas = new ArrayList<>();
                        Fichas.add(F);
                        Tablero[x][y].setFichasEnLaCasilla(Fichas);
                    }
                }
            }
        }
    }
    public void BorrarFichaPorNo(Ficha F){
        for (int x = 0; x < Columnas ; x++) {
            for (int y = 0; y < Filas ; y++) {
                if(Tablero[x][y].getNoCasilla()==F.getCasillaActual()){
                    for (int i = 0; i <  Tablero[x][y].getFichasEnLaCasilla().size() ; i++) {
                        if( Tablero[x][y].getFichasEnLaCasilla().get(i).equals(F)){
                            Tablero[x][y].getFichasEnLaCasilla().remove(i);
                        }else{
                        
                        }
                    }
                }
            }
        }
    }
    public boolean ValorRepetido(ArrayList<Integer> Lista1, ArrayList<Integer> Lista2, ArrayList<Integer> Lista3, ArrayList<Integer> Lista4){
        for (int x = 0; x < 2 ; x++) {
            for (int y = 0; y < 2 ; y++) {
                if(Objects.equals(Lista1.get(x), Lista3.get(y))&&Objects.equals(Lista2.get(x), Lista4.get(y))&&Objects.equals(Lista1.get(x), Lista4.get(y))&&Objects.equals(Lista2.get(x), Lista3.get(y))){
                    return false;
                }
            }
        }
        return true;
    }
}
