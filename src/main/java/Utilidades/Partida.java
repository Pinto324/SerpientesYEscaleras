
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
    private Casillas[][] Tablero;
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
        this.Filas = Y;
        this.Columnas = X;
        Tablero = new Casillas[X][Y];
        LlenarTablero(X,Y, CRetrocede,CAvanza,CTiraDados,CSerpientes,CPierdeTurno,CEscalera);
    }
    //Constructor si el tablero no tienes escaleras ni serpientes:
    public Partida(ArrayList<Ficha> FichasEnLaCasilla,int X, int Y, List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados,List<List<Integer>> CPierdeTurno){
        this.FichasDeJugadores = FichasEnLaCasilla;
        this.Filas = Y;
        this.Columnas = X;
        Tablero = new Casillas[X][Y];
        LlenarTablero(X,Y, CRetrocede,CAvanza,CTiraDados,CPierdeTurno);
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
        //Generaci??n de escaleras random
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
        for (int x = 0; x < X ; x++) {
            for (int y = 0; y < Y ; y++) {
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
                        for(int p = 0; p < CAvanza.size(); p++){
                            for(int q = 0; q < CTiraDados.size(); q++){
                                for(int r = 0; r < CPierdeTurno.size(); r++){
                                    for(int S = 0; S < CSerpientes.size(); S++){
                                        for(int E = 0; E < CEscalera.size(); E++){
                        //primera casilla:
                        try{
                        if(x==0&&y==0){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,FichasDeJugadores);
                        //Para crear casilla de retrocede:
                        }else if(CRetrocede.get(i).get(0)==x && CRetrocede.get(i).get(1)==y){
                                JPanel PanelR = new javax.swing.JPanel();
                                JLabel LabelR = new javax.swing.JLabel(); 
                                PanelR.setBackground(Color.ORANGE);
                                Tablero[CRetrocede.get(i).get(0)][CRetrocede.get(i).get(1)]= new CasillaRetrocede(ContadorCasillas,PanelR,LabelR,null,CRetrocede.get(i).get(2));
                        //Para crear casilla de avanza:
                        }else if(CAvanza.get(p).get(0)==x && CAvanza.get(p).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.GRAY);
                            Tablero[CAvanza.get(p).get(0)][CAvanza.get(p).get(1)]= new CasillaAvanza(ContadorCasillas,PanelR,LabelR,null,CAvanza.get(p).get(2));
                        //Para tirar dados
                        }else if(CTiraDados.get(q).get(0)==x && CTiraDados.get(q).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.WHITE);
                            Tablero[x][y]= new CasillaTirarDados(ContadorCasillas,PanelR,LabelR,null);
                        //Para perder turno:
                        }else if(CPierdeTurno.get(r).get(0)==x && CPierdeTurno.get(r).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.LIGHT_GRAY);
                            Tablero[x][y]= new CasillaPerderTurno(ContadorCasillas,PanelR,LabelR,null);
                        //Para serpientes cola:
                        }else if(CSerpientes.get(S).get(0)==x && CSerpientes.get(S).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/ColaSerpienteV.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.red);
                            Tablero[x][y]= new CasillaSerpiente(CasillaSegunCords(X,Y,CSerpientes.get(S).get(2),CSerpientes.get(S).get(3)),ContadorCasillas,PanelR,LabelR,null);
                        //Para serpientes cabeza:
                        }else if(CSerpientes.get(S).get(2)==x && CSerpientes.get(S).get(3)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/CabezaSerpienteV.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.red);
                            Tablero[x][y]= new Casillas(ContadorCasillas,PanelR,LabelR,null);
                        //Para escalera final
                        }else if(CEscalera.get(E).get(2)==x && CEscalera.get(E).get(3)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/EscaleraFinal.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.GREEN);
                            Tablero[x][y]= new Casillas(ContadorCasillas,PanelR,LabelR,null);
                        //Para Escalera abajo:
                        }else if(CEscalera.get(E).get(0)==x && CEscalera.get(E).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel();
                            LabelR.setIcon(new ImageIcon("Casillas/EscaleraInicio.png"));
                            PanelR.add(LabelR);
                            PanelR.setBackground(Color.GREEN);
                            Tablero[x][y]= new CasillaEscalera(CasillaSegunCords(X,Y,CEscalera.get(E).get(2),CEscalera.get(E).get(3)),ContadorCasillas,PanelR,LabelR,null);
                        }else if(Tablero[x][y].getNoCasilla()==0||Tablero[x][y].getImagenDeCasilla()==null){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,null);
                        }
                        }catch(NullPointerException e){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,null);
                        }                        
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ContadorCasillas++; 
                }      
            }
    }
    
    //Si el tablero contiene 0 escaleras y 0 serpientes:
        public void LlenarTablero(int X, int Y, List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados,List<List<Integer>> CPierdeTurno){
        int ContadorCasillas = 1;
        for (int x = 0; x < X ; x++) {
            for (int y = 0; y < Y ; y++) {
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
                        for(int p = 0; p < CAvanza.size(); p++){
                            for(int q = 0; q < CTiraDados.size(); q++){
                                for(int r = 0; r < CPierdeTurno.size(); r++){
                        //primera casilla:
                        try{
                        if(x==0&&y==0){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,FichasDeJugadores);
                        //Para crear casilla de retrocede:
                        }else if(CRetrocede.get(i).get(0)==x && CRetrocede.get(i).get(1)==y){
                                JPanel PanelR = new javax.swing.JPanel();
                                JLabel LabelR = new javax.swing.JLabel(); 
                                PanelR.setBackground(Color.ORANGE);
                                Tablero[CRetrocede.get(i).get(0)][CRetrocede.get(i).get(1)]= new CasillaRetrocede(ContadorCasillas,PanelR,LabelR,null,CRetrocede.get(i).get(2));
                        //Para crear casilla de avanza:
                        }else if(CAvanza.get(p).get(0)==x && CAvanza.get(p).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.GRAY);
                            Tablero[CAvanza.get(p).get(0)][CAvanza.get(p).get(1)]= new CasillaAvanza(ContadorCasillas,PanelR,LabelR,null,CAvanza.get(p).get(2));
                        //Para tirar dados
                        }else if(CTiraDados.get(q).get(0)==x && CTiraDados.get(q).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.WHITE);
                            Tablero[x][y]= new CasillaTirarDados(ContadorCasillas,PanelR,LabelR,null);
                        //Para perder turno:
                        }else if(CPierdeTurno.get(r).get(0)==x && CPierdeTurno.get(r).get(1)==y){
                            JPanel PanelR = new javax.swing.JPanel();
                            JLabel LabelR = new javax.swing.JLabel(); 
                            PanelR.setBackground(Color.LIGHT_GRAY);
                            Tablero[x][y]= new CasillaPerderTurno(ContadorCasillas,PanelR,LabelR,null);
                        }else if(Tablero[x][y].getNoCasilla()==0||Tablero[x][y].getImagenDeCasilla()==null){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,null);
                        }
                        }catch(NullPointerException e){
                            Tablero[x][y] = new Casillas(ContadorCasillas,M,L,null);
                        }                        
                                }
                            }
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
    public int CasillaSegunCords(int X, int Y, int Xc, int Yc){
        int contador = 1;
        for (int x = 0; x < X ; x++) {
            for (int y = 0; y < Y ; y++) {
                if(x==Xc&&y==Yc){
                    return contador;
                }
                contador++;
            }
        }
        return contador;
    }
}
