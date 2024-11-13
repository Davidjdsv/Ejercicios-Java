import javax.swing.*;
import java.util.Random;

public class Matrices {
    int[][] matriz = new int[3][3];

    public void llenarMatriz(){
        int valor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor: "));
                matriz[i][j] = valor;
            }
        }
    }

    public void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void eliminarMatriz(){
        int posY = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición en Y: "));
        int posX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición en X: "));

        matriz[posY][posX] = 0;
    }

    public void modificarMatriz(){
        int posY = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición en Y: "));
        int posX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición en X: "));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor: "));

        matriz[posY][posX] = valor;
    }

    public void buscarMatriz(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar: "));
        boolean val = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (valor == matriz[i][j]) {
                    val = true;
                    break;
                }
            }
        }

        String mensaje = (val) ? "Valor encontrado" : "Valor no encontrado";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void llenarMatrizRandom(){
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int num_aleatorio = random.nextInt(1, 100);
                matriz[i][j] = num_aleatorio;
            }
        }
    }

    public void mostrarPosicion(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar a mostrar en posición: "));
        boolean estado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == valor){
                    JOptionPane.showMessageDialog(null, "Valor encontrado en la pos: [" + i  + "," + j + "]");
                    estado = true;
                    break;
                }
            }
        }
    }

    public void eliminarPorDato(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a eliminar según su dato: "));
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (valor == matriz[i][j]){
                    matriz[i][j] = 0;
                }
            }
        }
    }

    public void sumarMatriz(){
        int acum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                acum += matriz[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Total números sumados en la matriz: " + acum);
    }

    public void menorMayorMatriz(){
        int menor = 999;
        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                } else if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Número mayor de la matriz: " + mayor + "" +
                "\nNúmero menor de la matriz: " + menor);
    }


    public static void main(String[] args) {
        Matrices matrices = new Matrices();
        boolean estado = true;

        do {
            try {
                int op = Integer.parseInt(JOptionPane.showInputDialog("-Ingrese la opción-\n1.Llenar matriz.\n" +
                        "2.Mostrar matriz.\n3.Eliminar matriz.\n4.Modificar matriz.\n5.Buscar matriz.\n" +
                        "6.Llenar matriz random.\n7.Buscar y mostrar pos\n8. Eliminar por dato.\n9. Sumar matriz\n10. Mayor y menor\n0.Salir del programa."));

                switch (op) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Adiós.");
                        estado = false;
                        break;
                    case 1:
                        matrices.llenarMatriz();
                        break;
                    case 2:
                        matrices.mostrarMatriz();
                        break;
                    case 3:
                        matrices.eliminarMatriz();
                        break;
                    case 4:
                        matrices.modificarMatriz();
                        break;
                    case 5:
                        matrices.buscarMatriz();
                        break;
                    case 6:
                        matrices.llenarMatrizRandom();
                        break;
                    case 7:
                        matrices.mostrarPosicion();
                        break;
                    case 8:
                        matrices.eliminarPorDato();
                        break;
                    case 9:
                        matrices.sumarMatriz();
                        break;
                    case 10:
                        matrices.menorMayorMatriz();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción ingresada no valida...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número.");
            }
        } while(estado);
    }
}
