import javax.swing.*;

//Class
public class Operaciones {
    int a, b = 0;

    //Constructor
    public Operaciones(int a, int b){
        this.a = a;
        this.b = b;
    }

    //Methods
    public void adding(){
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public void subtracting(){
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public void multiplying(){
        int result = a * b;
        System.out.println(a + " x " + b + " = " + result);
    }

    public void dividing(){
        double result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        Operaciones opMate = new Operaciones(a,b);

        boolean valor = true;
        
        do{
            int op = Integer.parseInt(JOptionPane.showInputDialog("1. Sumar. \n 2. Restar. \n 3.Multiplicar. " +
                    "\n 4.Dividir. \n 5.Salir."));

            switch (op){
                case 1:
                    opMate.adding();
                    break;
                case 2:
                    opMate.subtracting();
                    break;
                case 3:
                    opMate.multiplying();
                    break;
                case 4:
                    opMate.dividing();
                    break;
                case 5:
                    valor = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Opción invalida...");

            }
        }
        while(valor);
        opMate.adding();
        opMate.subtracting();
        opMate.multiplying();
        opMate.dividing();
    }
}
