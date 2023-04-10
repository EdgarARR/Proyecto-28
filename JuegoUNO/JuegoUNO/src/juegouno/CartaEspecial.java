package juegouno;

import restricciones.Color;
import restricciones.Efecto;

public class CartaEspecial extends Carta{
    private Efecto efecto;

    public CartaEspecial(){
        super();
    }
    
    public CartaEspecial(Efecto efecto, Color color) {
        super(color);
        this.efecto = efecto;
    }
    
    public Efecto getEfecto() {
        return efecto;
    }

    public void setEfecto(Efecto efecto) {
        this.efecto = efecto;
    }    

    @Override
    public String toString() {
        return super.toString()+"CartaEspecial{" + "efecto=" + efecto+'}';
    }
}