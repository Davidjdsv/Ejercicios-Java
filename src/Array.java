import org.w3c.dom.xpath.XPathResult;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Array {
    //Atributos
    //Integer porque es una clase de java, no el integer
    List <Integer> lista = new ArrayList<>();

    //Contructor de la clase
    /*public Array(){

    }*/

    //Métodos
    public void agregar(){
        JOptionPane.showMessageDialog(null, "Ingresando los elementos de la lista.");
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que va a agregar: "));
        int valor = 0;

        for (int i = 0; i < cant; i ++){
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (i+1) + "/" + cant));
            lista.add(valor);
        }
        JOptionPane.showMessageDialog(null, "Datos ingresados exitosamente");
    }

    public void mostrar(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posición: " + i + " Elemento: " + lista.get(i));
        }
    }

    public void eliminar(){
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite la posición que desea eliminar de la lista: "));
        lista.remove(pos);
        JOptionPane.showMessageDialog(null, "Elemento eliminado en la posición: " + pos);
        mostrar();
    }

    public void eliminar_valores(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea eliminar: "));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i)){
                lista.remove(i);
            }
        }
        System.out.println("Lista actualizada después de eliminar.");
        mostrar();
    }

    public void actualizar(){
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posción a actualizar: "));
        int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a actualizar: "));
        System.out.println("Lista original: " + lista);
        lista.set(pos, val);
        System.out.println("Lista modificada: " + lista);
    }

    public void buscar(){
        int valor_buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar: "));
        String mensaje = null;

        for (int i = 0; i < lista.size(); i++) {
            mensaje = (valor_buscar == lista.get(i)) ? "Valor encontrado en la posición: " + i : "Valor " + valor_buscar + " no encontrado";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mayor_menor(){
        int mayor = 0;
        int menor = 999999999;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > mayor) mayor = lista.get(i);
            if (lista.get(i) < menor) menor = lista.get(i);
        }
        JOptionPane.showMessageDialog(null, "El número mayor en la lista es: " + mayor);
        JOptionPane.showMessageDialog(null, "El número menor en la lista es: " + menor);
    }

    public void par_impar(){
        String mensaje = null;
        for (int i = 0; i < lista.size(); i++) {
            mensaje = (lista.get(i) % 2 == 0) ? lista.get(i) + " Es par." : lista.get(i) + " Es impar.";
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        boolean estado = true;
        int opc = 0;

        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción\n1.Agregar.\n2.Mostrar.\n3.Eliminar.\n4.Actualizar\n5.Buscar.\n" +
                        "6.Mayor y menor.\n7.Pares e impares.\n8.Eliminar varios elementos.\n9.salir." ));
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, se deben de ingresar solo números...");
            }

            switch (opc){
                case 1:
                    array.agregar();
                    break;
                case 2:
                    array.mostrar();
                    break;
                case 3:
                    array.eliminar();
                    break;
                case 4:
                    array.actualizar();
                    break;
                case 5:
                    array.buscar();
                    break;
                case 6:
                    array.mayor_menor();
                    break;
                case 7:
                    array.par_impar();
                    break;
                case 8:
                    array.eliminar_valores();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    estado = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Opción ingresada no valida...");
            }
        } while(estado);
    }
}
