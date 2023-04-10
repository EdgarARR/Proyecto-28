package juegouno;

import restricciones.Color;
import restricciones.Numero;
public class CartaNumerica extends Carta{
    private Numero numero;

    public CartaNumerica() {
        super();
    }

    public CartaNumerica(Numero numero, Color color) {
        super(color);
        this.numero = numero;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+"CartaNumerica{" + "numero=" + numero + '}';
    }
}