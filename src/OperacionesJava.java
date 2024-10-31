import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class OperacionesJava {

    //Ciclo for
    public void cicloFor(){
        //El ciclo for necesita un inicio y una condición de parada.
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    //ciclo while
    public void cicloWhile(){
        //El ciclo while requiere de una condición que rompa el ciclo.
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
    }

    public void cicloDoWhile(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i < 5);
    }

    public void desiciones(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese: "));
        if (x > 1){
            JOptionPane.showMessageDialog(null, "EL valor ingresado es mayor a 1: " + x);
        } else {
            JOptionPane.showMessageDialog(null, "El valor ingresado es menor a 1: " + x);
        }
    }

    public void desicionesSwitch(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese x: "));

        switch (x){
            case 1:
                JOptionPane.showMessageDialog(null, "Es 1.");
            case 2:
                JOptionPane.showMessageDialog(null, "Es 2.");
            case 3:
                JOptionPane.showMessageDialog(null, "Es 3.");
            default:
                JOptionPane.showMessageDialog(null, "No es ninguna opción (1-2-3).");
        }

    }

    public void ejercicioInClass(){
        Random random = new Random();
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));
        int x = random.nextInt(1)+3;
        double descuento = 0;
        DecimalFormat df = new DecimalFormat("##");

        switch (x){
            case 1:
                descuento = valor - (valor * 0.1);
                JOptionPane.showMessageDialog(null, "Sacaste " + x + " Tienes un descuento del 10% en nuestros productos!\nPrecio producto: "
                        + valor +"\nProducto descuento: " + descuento);
                break;
            case 2:
                descuento = valor - (valor * 0.2);
                JOptionPane.showMessageDialog(null, "Sacaste " + x + " Tienes un descuento del 20% en nuestros productos!\nPrecio producto: "
                        + valor +"\nProducto descuento: " + descuento);
                break;
            case 3:
                int ruleta = random.nextInt(100)+1;
                double porcentaje = (double)ruleta / 100;
                descuento = valor - (valor * porcentaje);
                JOptionPane.showMessageDialog(null, "Sacaste " + x + " Tienes accesos a la ruleta especial !!!Se generará un número aleatorio. Ese número será tu descuento, buena suerte!!");
                JOptionPane.showMessageDialog(null, "La ruleta se ha girado y tienes un descuento del " + df.format(ruleta) + "% en nuestros productos!\nPrecio producto: "
                        + valor +" Producto descuento: " + df.format(descuento));
                break;
        }
    }

    public static void main(String[] args) {
        OperacionesJava operacionesJava = new OperacionesJava();

        //operacionesJava.cicloFor();
        //operacionesJava.cicloWhile();
        operacionesJava.ejercicioInClass();
    }
}
