package juegouno;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class JuegoUNO implements java.io.Serializable{

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Mazo m = new Mazo(108);
        m.inicializarMazo();
        m.revolverCarta();
        System.out.println("Dame el numero de jugadores");
        Scanner e = new Scanner(System.in);
        int n = e.nextInt();
        Jugador jugador[]=new Jugador[n];
        for (int i=0; i<n; i++){
            //Llenando datos de los jugadores
            System.out.println("Introduce el nombre del jugador "+(i+1)+": ");
            String nombre= e.next();
            System.out.println("Introduce el nickname del jugador "+(i+1)+": ");
            String nickname= e.next();
            jugador[i]= new Jugador(nombre, nickname);
            //Repartiendo cartas
                for (int a=0; a<8;a++){
                    jugador[i].tomarCarta(m);
                    //Restando cartas del mazo inicial
                    m.setNumCartas(m.getNumCartas()-1);
                }
            System.out.println(jugador[i]);
            System.out.println("\n\n");
        }
        //Tomar cartas
        for (int i=0;i<n;i++){
            System.out.println("Cuantas cartas desea agarrar el jugador"+(i+1)+"? ");
            
            int w= e.nextInt();
                for (int a=0; a<w;a++){
                    jugador[i].tomarCarta(m);
                    //Restando cartas del mazo inicial
                    m.setNumCartas(m.getNumCartas()-1);
                }
            System.out.println(jugador[i]);
            System.out.println("\n\n");
        }

            //Descarte de cartas
        for (int i=0; i<n;i++){
            System.out.println("Cuantas cartas desea descartar el jugador"+(i+1)+"?");
            int f = e.nextInt();
                for (int j=0; j<f;j++){
                    jugador[i].tirarCarta(i);
            }
        }
        System.out.println("\n\n");
        //Estado actual del juego y guardarlo en archivo
        
        File f;
        FileOutputStream fos;
        BufferedOutputStream bos;
        
        try {
            //Objeto archivo
            f= new File("EstadoActualDelJuego.txt");
            //Flujo de salida a partir de un archivo
            fos= new FileOutputStream(f);
            //Buffer para un flujo de salida
            bos= new BufferedOutputStream(fos);
            //Salto de linea en el archivo
            PrintStream ps= new PrintStream(bos);
            //Imprimiendo el estado actual del mazo
            String mazo=m.toString();
            byte[] mazoactual= mazo.getBytes();
            ByteBuffer buffer= ByteBuffer.wrap(mazoactual);
            fos.write(buffer.array());
            //Se imprimen los salto de lineas
            ps.println();
            ps.println();
            //Asegurar que los bytes en el buffer se escriban
            ps.flush();
            //Copiando el estado actual de los jugadores con un ciclo
            for (int i=0;i<n;i++){
            String jugadores=jugador[i].toString();
            bos.write(jugadores.getBytes());
            //Se imprimen los salto de lineas
            ps.println();
            ps.println();
            //Asegurar que los bytes en el buffer se escriban
            ps.flush();
            }
            bos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JuegoUNO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al intentar abrir el archivo");
        } catch (IOException ex) {
            Logger.getLogger(JuegoUNO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
