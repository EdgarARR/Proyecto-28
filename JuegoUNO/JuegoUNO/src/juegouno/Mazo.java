package juegouno;

import java.util.Stack;
import restricciones.Color;
import restricciones.Efecto;
import restricciones.Numero;

public class Mazo {
    private int numCartas;
    private Stack<Carta> cartas= new Stack<Carta>();
    
    public Mazo(int numCartas) {
        this.numCartas = numCartas;
    }

    public Carta recuperarUltimaCarta(){
        return this.cartas.pop();
    }

    public int getNumCartas() {
        return numCartas;
    }

    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }

    public Stack<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Stack<Carta> cartas) {
        this.cartas = cartas;
    }

    public void inicializarMazo(){
        //Cartas verdes del 0 al 9
        for(Numero num: Numero.values()){
            this.cartas.push(new CartaNumerica(num, Color.Verde));
        }
        //Cartas verdes del 1 al 9
        this.cartas.push(new CartaNumerica(Numero.uno, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.dos, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.tres, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.cuatro, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.cinco, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.seis, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.siete, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.ocho, Color.Verde));
        this.cartas.push(new CartaNumerica(Numero.nueve, Color.Verde));
        //Cartas verdes especiales
       
        for(int x=0;x<2;x++){
            this.cartas.push(new CartaEspecial(Efecto.MasDos, Color.Verde));
            this.cartas.push(new CartaEspecial(Efecto.Reversa, Color.Verde));
            this.cartas.push(new CartaEspecial(Efecto.Salto, Color.Verde));
        }

        //Cartas rojas del 0 al 9
        for(Numero num: Numero.values()){
            this.cartas.push(new CartaNumerica(num, Color.Rojo));
        }
        //Cartas rojas del 1 al 9
        this.cartas.push(new CartaNumerica(Numero.uno, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.dos, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.tres, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.cuatro, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.cinco, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.seis, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.siete, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.ocho, Color.Rojo));
        this.cartas.push(new CartaNumerica(Numero.nueve, Color.Rojo));
        //Cartas rojas especiales

        for(int x=0;x<2;x++){
            this.cartas.push(new CartaEspecial(Efecto.MasDos, Color.Rojo));
            this.cartas.push(new CartaEspecial(Efecto.Reversa, Color.Rojo));
            this.cartas.push(new CartaEspecial(Efecto.Salto, Color.Rojo));
        }

        //Cartas azules del 0 al 9
        for(Numero num: Numero.values()){
            this.cartas.push(new CartaNumerica(num, Color.Azul));
        }
        //Cartas azules del 1 al 9
        this.cartas.push(new CartaNumerica(Numero.uno, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.dos, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.tres, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.cuatro, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.cinco, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.seis, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.siete, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.ocho, Color.Azul));
        this.cartas.push(new CartaNumerica(Numero.nueve, Color.Azul));
        //Cartas azules especiales

        for(int x=0;x<2;x++){
            this.cartas.push(new CartaEspecial(Efecto.MasDos, Color.Azul));
            this.cartas.push(new CartaEspecial(Efecto.Reversa, Color.Azul));
            this.cartas.push(new CartaEspecial(Efecto.Salto, Color.Azul));
        }

        //Cartas amarillas del 0 al 9
        for(Numero num: Numero.values()){
            this.cartas.push(new CartaNumerica(num, Color.Amarillo));
        }
        //Cartas amarillas del 1 al 9
        this.cartas.push(new CartaNumerica(Numero.uno, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.dos, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.tres, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.cuatro, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.cinco, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.seis, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.siete, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.ocho, Color.Amarillo));
        this.cartas.push(new CartaNumerica(Numero.nueve, Color.Amarillo));
        //Cartas amarillas especiales

        for(int x=0;x<2;x++){
            this.cartas.push(new CartaEspecial(Efecto.MasDos, Color.Amarillo));
            this.cartas.push(new CartaEspecial(Efecto.Reversa, Color.Amarillo));
            this.cartas.push(new CartaEspecial(Efecto.Salto, Color.Amarillo));
        }

        //Cartas negras

        for(int x=0;x<4;x++){
            this.cartas.push(new CartaEspecial(Efecto.MasCuatro, Color.Negro));
            this.cartas.push(new CartaEspecial(Efecto.CambiaColor, Color.Negro));
        }
    }

    public Carta revolverCarta(){
        Carta c = null;
        Carta aux= null;


        for(int j=0;j<120;j++){
        //De donde tomaré la carta
        int io=(int) Math.ceil(Math.random()*108);
        //A dónde pondre la carta
        int id=(int) Math.ceil(Math.random()*108);

        if(io!=id){
            try{
            c=this.cartas.get(io);
            aux=this.cartas.set(id, c);
            this.cartas.setElementAt(aux, io);
            }catch(ArrayIndexOutOfBoundsException ex){

            }}
        else{
            j--;
        }
        }

        c=this.recuperarUltimaCarta();
        return c;
    }
    
    @Override
    public String toString() {
        return "Mazo{" + "numCartas=" + numCartas + ", cartas=" + cartas + '}';
    }
}