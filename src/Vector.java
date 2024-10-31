import javax.swing.*;

public class Vector
{
    /*
    Un vector es un arreglo unidimensional
    Elementos:   a b c d e
    posiciones:  0 1 2 3 4
     */

    /*
        Un vector se le especifican su tamaño desde un principio
        El arraylist guarda muchos mas
    */

    //tipo: int, String, double, boolean, etc

    int []numeros = new int[8];
    //posiciones: 0 1 2 3 4 5 6 7

    //Mostrar - Agregar - Eliminar - Actualizar - Buscar

    //Mostrar
    public void mostrar()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("Posición "+i+": "+numeros[i]);
        }
    }

    //Agregar
    public void agregar()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor" +
                    "\nposición: "+i));
        }
    }

    //Actualizar
    public void actualizar()
    {
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion"));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor"));

        numeros[pos] = valor;
    }

    //Eliminar
    public void eliminar()
    {
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del valor a eliminar"));

        numeros[pos] = 0;
    }

    //Buscar
    public void buscar()
    {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));

        boolean val = true;

        for (int i = 0; i < numeros.length; i++)
        {
            if(valor == numeros[i])
            {
                JOptionPane.showMessageDialog(null,"Valor encontrado" +
                        "\nposicion: "+i);
                val = false;
            }
        }

        if (val)
            JOptionPane.showMessageDialog(null,"Valor No encontrado");

    }

    //Sumar
    public void sumar()
    {
        int acum = 0;
        for (int i = 0; i < numeros.length; i ++){
            acum += numeros[i];
        }
        System.out.println("La suma de los números en el arreglo es de: " + acum);
    }

    //Mayor y menor
    public void mayorMenor()
    {
        int mayor = 0;
        int menor = 999999;
        for (int i = 0; i < numeros.length; i ++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("Número mayor en el arreglo: " + mayor + "\nNúmero menor en el arreglo: " + menor);
    }

    //Par e impar
    public void parImpar()
    {
        //int opc = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar pares. \n2.Mostrar impares. "));
        String mensaje = "";
        for (int i = 0; i < numeros.length; i ++){
            mensaje = (numeros[i] % 2 == 0) ? "Número par: " + numeros[i] : "Número impar: " + numeros[i];
            System.out.println(mensaje);
        }
    }

    //primo

    //repetir
    public void repetir()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a buscar si está repetido: "));
        int cont = 0;
        for (int i = 0; i < numeros.length; i ++){
            if (num == numeros[i]){
                cont+=1;
            }
        }
        System.out.println("El número: " + num + " está repetido " + cont);
    }

    public static void main(String[] args)
    {
        Vector vector = new Vector();

        boolean val = true;

        do
        {
            int op = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar. \n2.Agregar. \n3.Actualizar. \n4.Borarr." +
                    "\n5.Buscar. \n6.Sumar. \n7.Mayor y menor. \n8.Par e impar. \n9.Primo. \n10.Repetir. \n0.Salir."));
            switch (op)
            {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    val = false;
                    break;
                case 1:
                    vector.mostrar();
                    break;
                case 2:
                    vector.agregar();
                    break;
                case 3:
                    vector.actualizar();
                    break;
                case 4:
                    vector.eliminar();
                    break;
                case 5:
                    vector.buscar();
                    break;
                case 6:
                    vector.sumar();
                    break;
                case 7:
                    vector.mayorMenor();
                    break;
                case 8:
                    vector.parImpar();
                case 9:
                    JOptionPane.showMessageDialog(null, "No he hecho los primos.");
                case 10:
                    vector.repetir();
                default:
                    break;
            }
        }while (val);

    }
}