import javax.swing.*;
import java.util.Random;

public class Triki {
    int ganador = 0;
    String[][] tablero = new String[3][3];

    public void tableroTriki() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = " ";
            }
        }
    }

    public void mostrarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j].isEmpty() ? "_" : tablero[i][j]);
            }
            System.out.println();
        }
    }

    public boolean tableroLleno(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j].isEmpty()) return false;
            }
        }
        return true;
    }

    public int verificarJugada(){
        //x
        //horizontal
        if (tablero[0][0].equals("x") && tablero[0][1].equals("x") && tablero[0][2].equals("x")){
            return 1;
        }
        else if(tablero[1][0].equals("x") && tablero[1][1].equals("x") && tablero[1][2].equals("x")){
            return 1;
        }
        else if(tablero[2][0].equals("x") && tablero[2][1].equals("x") && tablero[2][2].equals("x")){
            return 1;
        }
        //vertical
        else if(tablero[0][0].equals("x") && tablero[1][0].equals("x") && tablero[2][0].equals("x")){
            return 1;
        }
        else if(tablero[0][1].equals("x") && tablero[1][1].equals("x") && tablero[2][1].equals("x")){
            return 1;
        }
        else if(tablero[0][2].equals("x") && tablero[1][2].equals("x") && tablero[2][2].equals("x")){
            return 1;
        }
        //Cruzado
        else if(tablero[0][0].equals("x") && tablero[1][1].equals("x") && tablero[2][2].equals("x")){
            return 1;
        }
        else if(tablero[0][2].equals("x") && tablero[1][1].equals("x") && tablero[2][0].equals("x")){
            return 1;
        }

        //o
        //horizontal
        if (tablero[0][0].equals("o") && tablero[0][1].equals("o") && tablero[0][2].equals("o")){
            return 2;
        }
        else if(tablero[1][0].equals("o") && tablero[1][1].equals("o") && tablero[1][2].equals("o")){
            return 2;
        }
        else if(tablero[2][0].equals("o") && tablero[2][1].equals("o") && tablero[2][2].equals("o")){
            return 2;
        }
        //vertical
        else if(tablero[0][0].equals("o") && tablero[1][0].equals("o") && tablero[2][0].equals("o")){
            return 2;
        }
        else if(tablero[0][1].equals("o") && tablero[1][1].equals("o") && tablero[2][1].equals("o")){
            return 2;
        }
        else if(tablero[0][2].equals("o") && tablero[1][2].equals("o") && tablero[2][2].equals("o")){
            return 2;
        }
        //Cruzado
        else if(tablero[0][0].equals("o") && tablero[1][1].equals("o") && tablero[2][2].equals("o")){
            return 2;
        }
        else if(tablero[0][2].equals("o") && tablero[1][1].equals("o") && tablero[2][0].equals("o")){
            return 2;
        }
        return 0;
    }

    public void jugar(){
        while (ganador == 0 && !tableroLleno()) {
            mostrarTablero();

            //JUGADOR 1
            try {
                int jugador1_pos_y = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1:\nIngrese pos en Y: "));
                int jugador1_pos_x = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1:\nIngrese pos en X: "));
                tablero[jugador1_pos_y][jugador1_pos_x] = "x";
                if (tablero[jugador1_pos_y][jugador1_pos_x].isEmpty()){
                    tablero[jugador1_pos_y][jugador1_pos_x] = "x";
                    ganador = verificarJugada();
                } else {
                    JOptionPane.showMessageDialog(null, "Posición ocupada.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros.");
            }

            //JUGADOR 2
            try {
                int jugador2_pos_y = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2:\nIngrese pos en Y: "));
                int jugador2_pos_x = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2:\nIngrese pos en X: "));
                if (tablero[jugador2_pos_y][jugador2_pos_x].isEmpty()){
                    tablero[jugador2_pos_y][jugador2_pos_x] = "o";
                    ganador = verificarJugada();
                } else {
                    JOptionPane.showMessageDialog(null, "Posición ocupada");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros.");
            }

        }
            if (ganador == 1) {
                JOptionPane.showMessageDialog(null, "Ganó el jugador 1!");
            } else if (ganador == 2) {
                JOptionPane.showMessageDialog(null, "Ganó el jugador 2!");
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
    }

    public static void main(String[] args) {
        Triki triki = new Triki();
        //triki.tableroTriki();
        triki.jugar();
    }
}
