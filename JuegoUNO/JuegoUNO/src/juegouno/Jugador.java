package juegouno;

import java.util.ArrayList;
import java.util.Stack;

public class Jugador {
    private String nombre;
    private String nickName;
    private ArrayList<Carta> mano= new ArrayList<Carta>();

    public Jugador() {
    }
    
    public Jugador(String nombre, String nickName) {
        this.nombre = nombre;
        this.nickName = nickName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public void tomarCarta(Mazo m){
        this.mano.add(m.recuperarUltimaCarta());
                            
    }

    public void tirarCarta(int i) {
        Stack<Carta> cartasDescarte = new Stack<>();
        cartasDescarte.push(mano.get(i));
        mano.remove(i);
        System.out.println("Pila de descarte:"+cartasDescarte);
    }
    
    @Override
    public String toString() {
        return "Jugador{"+ "nombre=" + nombre + ", nickName=" + nickName + ", mano=" + mano + '}';
    }


}