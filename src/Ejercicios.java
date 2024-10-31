import javax.swing.*;
import java.text.DecimalFormat;

public class Ejercicios {

    public void ejercicio1(){
        System.out.println("Hola mundo");
    }

    public void ejercicio2(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        int result = x + y;
        JOptionPane.showMessageDialog(null,x + " + " + y + " = " + result);
    }

    public void ejercicio3(){
        double celsius = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura en Celsius: "));
        double fah = celsius * 9 / 5 + 32;
        JOptionPane.showMessageDialog(null, "Celsius: " + celsius + " A Fahrenheit: " + fah);
    }

    public void ejercicio4(){
        double largo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del rectángulo: "));
        double ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del rectángulo: "));
        double res = largo * ancho;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es de: " + res);
    }

    public void ejercicio5(){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 1: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 2: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 3: "));
        double res = (num1 + num2 + num3) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es de: " + res);
    }

    public void ejercicio6(){
        int horas_trabajo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas trabaja?"));
        int tarifa = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto cobras por hora?"));
        int total = horas_trabajo * tarifa;
        JOptionPane.showMessageDialog(null, "El total es de: " + total);
    }

    public void ejercicio7(){
        int ano_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));
        int ano_actual = 2024;
        int edad = ano_actual - ano_nacimiento;
        JOptionPane.showMessageDialog(null, "Su edad es: " + edad);
    }

    public void ejercicio8() {
        JOptionPane.showMessageDialog(null, "¡Descuentos en compras!");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del articulo que compró: "));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas unidades adquirió?"));
        int total_compra = precio * cantidad;
        double desc = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        if (cantidad >= 10 && cantidad < 20) {
            desc = total_compra - (total_compra * 0.1);
            JOptionPane.showMessageDialog(null, "Valor total compra: " + total_compra + " \nCantidad: "
                    + cantidad + " \ndescuento de 10% de la compra: " + df.format(desc));
        } else if (cantidad >= 20 && cantidad < 30) {
            desc = total_compra - (total_compra * 0.2);
            JOptionPane.showMessageDialog(null, "Valor total compra: " + total_compra + " \nCantidad: "
                    + cantidad + " descuento de 20% de la compra: " + df.format(desc));
        } else if (cantidad >= 30 && cantidad < 40) {
            desc = total_compra - (total_compra * 0.3);
            JOptionPane.showMessageDialog(null, "Valor total compra: " + total_compra + " \nCantidad: "
                    + cantidad + " descuento de 30% de la compra: " + df.format(desc));
        } else {
            JOptionPane.showMessageDialog(null, "No hay descuento: " + total_compra);
        }
    }

    public void ejercicio9(){
        double minutos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los minutos: "));
        double hora = minutos / 60;
        double minutos_mod = minutos % 60;
        DecimalFormat df = new DecimalFormat("#");

        JOptionPane.showMessageDialog(null, df.format( hora) + ":" + df.format(minutos_mod));
    }

    public void ejercicio10(){
        double lado_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado a: "));
        double lado_b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado b: "));
        DecimalFormat df = new DecimalFormat("#.##");
        double hipotenusa = Math.sqrt(Math.pow(lado_a, 2) * Math.pow(lado_b, 2));

        JOptionPane.showMessageDialog(null, "La hipotenusa es: " + df.format(hipotenusa));
    }

    public void ejercicio12(){
        int res = 0;
        boolean estado = true;

        do {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
            int opc = Integer.parseInt(JOptionPane.showInputDialog("1.Sumar. \n2.Restar. \n3.Multiplicar. " +
                    "\n4.Dividir. \n5.Salir"));

            switch (opc){
                case 1:
                    res = a + b;
                    JOptionPane.showMessageDialog(null, a + " + " + b + " = " + res);
                    break;
                case 2:
                    res = a - b;
                    JOptionPane.showMessageDialog(null, a + " - " + b + " = " + res);
                    break;
                case 3:
                    res = a * b;
                    JOptionPane.showMessageDialog(null, a + " * " + b + " = " + res);
                    break;
                case 4:
                    res = (int) ((double) a / b);
                    JOptionPane.showMessageDialog(null, a + " / " + b + " = " + res);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                    estado = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida: ");
            }
        }while (estado);
    }

    public void ejercicio13(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("¿Es par o impar?"));
        String mensaje = (num % 2 == 0) ? num + " Es par" : num + " Es impar";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void ejercicio14(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        String mensaje = (a > b) ? a + " Es mayor que " + b : b + " Es mayor que " + a;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void ejercicio15(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número: "));

        if (a > b && a > c) {
            if (b > c){//SALIDA: A,B,C
                JOptionPane.showMessageDialog(null, "A) " + a + " Es mayor que B) " + b + " y C) " + c);
            } else {//SALIDA A,C,B
                JOptionPane.showMessageDialog(null, "A) " + a + " Es mayor que C) " + c + " y B) " + b);
            }
        } else if (b > a && b > c) {
            if (c > a){//SALIDA B,C,A
                JOptionPane.showMessageDialog(null, "B) " + b + " Es mayor que C) " + c + " y A) " + a);
            } else {//SALIDA B,A,C
                JOptionPane.showMessageDialog(null, "B) " + b + " Es mayor que A) " + a + " y C) " + c);
            }
        } else if (c > a && c > b) {
            if (a > b){//SALIDA C,A,B
                JOptionPane.showMessageDialog(null, "C) " + c + " Es mayor que  A) " + a + " y B) " + b);
            } else {//SALIDA C,B,A
                JOptionPane.showMessageDialog(null, "C) " + c + " Es mayor que B) " + b + " y A) " + a);
            }
        } else {
            JOptionPane.showMessageDialog(null, "A) " + a + ", B) " + b + "y C) " + c + " Son iguales...");
        }

    }

    public void ejercicio16(){
        DecimalFormat df = new DecimalFormat("#.##");
        boolean estado = true;

        do {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a encontrar su raíz cuadrada: "));
                double cuadrada = Math.sqrt(num);
                String mensaje_raiz = (num < 0) ? "Error, no se admiten números negativos en raíz cuadrada" : "La raíz cuadrada de "
                        + num + " es: " + df.format(cuadrada);
                if (num >= 0) {
                    estado = false;
                }
                JOptionPane.showMessageDialog(null, mensaje_raiz);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Advertencia: Solo se admiten valores númericos.");
            }
        } while(estado);

    }

    public void ejercicio17(){
        int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto: "));
        DecimalFormat df = new DecimalFormat("#.##");
        double iva = monto * 0.16;
        double total_compra = monto + iva;

        JOptionPane.showMessageDialog(null, "Valor de la compra: " + monto + "\nIVA: " + df.format(iva)
                + "\nTotal compra: " + df.format(total_compra));
    }

    public void ejercicio19(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Factorial: \nIngrese un número: "));
        int fact = 1;
        for (int i = 1; i <= num; i ++){
            fact*=i;
        }
        System.out.println("Factorial de " + num + ": " + fact);
    }

    public void ejercicio18(){
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del punto X1: "));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del punto X2: "));

        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del punto Y1: "));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del punto Y2: "));

        DecimalFormat df = new DecimalFormat("#.##");
        double resultado = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        JOptionPane.showMessageDialog(null, "La distancia entre los 2 puntos es: " + df.format(resultado));
    }

    public void ejercicios20(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int acum = 0;
        for (int i = 1; i <= num; i ++){
            System.out.println(i);
            acum+=i;
        }
            System.out.println("Sumatoria de los números: " + acum);
    }

    public void ejercicios21(){
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año a conocer si es bisiesto: "));
        String mensaje = (year % 4 == 0) ? year + " Es año bisiesto" : year + " No es año bisiesto.";//Ternario
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void ejercicios22() {
        boolean estado = true;
        int cont = 0;

        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("1. Para entrar al bucle. \n2.Para salir."));
            if (opc == 1) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango A: "));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango B: "));
                int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar dentro del rango: "));
                cont+= 1;
                if (a > b){
                    if (num <= a && num >= b){//a = 30, num = 11, b = 10.
                        JOptionPane.showMessageDialog(null, "(" + a + "..." + num + "..." + b + ")." + num + " Está en el rango.");
                    } else {
                        JOptionPane.showMessageDialog(null, num + " No está en el rango (" + a + "..." + b + ")");
                    }
                } else {
                    if (num <= b && num >= a){//b = 30, num = 11, a = 10.
                        JOptionPane.showMessageDialog(null, "(" + b + "..." + num + "..." + a + ")." + num + " Está en el rango.");
                    } else {
                        JOptionPane.showMessageDialog(null, num + " No está en el rango (" + b + "..." + a + ")");
                    }
                }
            } else if (opc == 2) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...\nVeces realizado el algoritmo: " + cont);
                estado = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opción ingresada no valida: " + opc);
            }

        } while(estado);

    }

    public void ejercicios11(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));

        for (int i = 1; i <= 10; i ++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }

    public void ejercicios23(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
        for (int i = 1; i <= num; i ++){
            System.out.println(i);
        }
    }

    public void ejercicios24(){
        //Se digita la cantidad de elementos que tendrá el array
        int cant_elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));
        int[] lista_numeros = new int[cant_elementos];
        int mayor = 0;

        //Agregando los elementos en el array
        for (int i = 0; i < cant_elementos; i ++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresando " + (i+1) + ": "));
            lista_numeros[i] = num;

            //Agregando el número mayor reemplazandolo con cada iteracción
            if (mayor < lista_numeros[i]){
                mayor = lista_numeros[i];
            }
        }

        //Mostrando los elementos
        for (int num : lista_numeros){
            System.out.println(num);
        }
        System.out.println("El número mayor de la lista es: " + mayor);
    }

    public void ejercicios25(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
        StringBuffer sb = new StringBuffer();
        sb.append("Número ingresado: " + num + "\n");
        for (int i = num; i >= 1; i --){
            sb.append(i + "\n");
        }
        JOptionPane.showMessageDialog(null, sb);
    }

    public void tablaMultiplicar(){
        int tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tablas a mostrar: "));

        for (int i = 1; i <= tabla; i ++){
            StringBuffer sb = new StringBuffer();
            sb.append("La tabla del " + i + ":\n");
            for (int j = 1; j <= 10; j ++){
                sb.append(i + " x " + j + " = " + (i*j) + "\n");
            }
            JOptionPane.showMessageDialog(null, sb);
        }
    }

    public void extra1() {
        boolean estado = true;
        int[] numeros = null;
        int cant = 0;
        StringBuffer sb = new StringBuffer();

        do {
            try {
                cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos. \nMínimo 5, Máximo 10: "));
                if (cant > 10) {
                    JOptionPane.showMessageDialog(null, "ALERTA:\nDemasiados objetos ingresados!");
                } else if (cant < 5) {
                    JOptionPane.showMessageDialog(null, "ALERTA:\nPocos objetos ingresados!");
                } else {
                    numeros = new int[cant];
                    estado = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten valores númericos...");
            }
        } while (estado);
        JOptionPane.showMessageDialog(null, "Ingrese el valor de cada elemento!");

        for (int i = 0; i < cant; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresando elementos " + (i+1) + "/" + cant));
            numeros[i] = numero;
        }
        sb.append("Lista de números ingresados: \n");
        for (int num : numeros){
            sb.append(num + "\n");
        }
        JOptionPane.showMessageDialog(null, sb);
    }

    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();

        //Llamada de los objetos/funciones
        //EJERCICIOS HECHOS EN EL ÓRDEN DEL DOCUMENTO DEL INSTRUCTOR
        //ejercicios.ejercicio1();
        //ejercicios.ejercicio2();
        //ejercicios.ejercicio3();
        //ejercicios.ejercicio4();
        //ejercicios.ejercicio5();
        //ejercicios.ejercicio6();
        //ejercicios.ejercicio7();
        //ejercicios.ejercicio8();
        //ejercicios.ejercicio9();
        //ejercicios.ejercicio10();
        //ejercicios.ejercicio12();
        //ejercicios.ejercicio13();
        //ejercicios.ejercicio14();
        //ejercicios.ejercicio15();
        //ejercicios.ejercicio16();
        //ejercicios.ejercicio17();
        //ejercicios.ejercicio18();
        //ejercicios.ejercicio19();
        //ejercicios.ejercicios20();
        //ejercicios.ejercicios21();
        //ejercicios.ejercicios22();
        //ejercicios.ejercicios11();
        //ejercicios.ejercicios23();
        //ejercicios.ejercicios24();
        //ejercicios.ejercicios25();
        //ejercicios.tablaMultiplicar();
        //ejercicios.extra1();


    }
}
