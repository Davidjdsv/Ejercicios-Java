import javax.swing.*;

public class Ejercicio_aregglos {
    //Arrays de los ingredientes de mi cocina
    int [] ingredientes = new int[4];
    StringBuffer sb = new StringBuffer();


    public void mostrar()
    {
        sb.delete(0, 99);
        for (int i = 0; i < ingredientes.length; i++) {
            if(i == 0){
                sb.append("Panes: " + ingredientes[i] + "\n");
            } else if (i == 1) {
                sb.append("Queso: " + ingredientes[i] + "\n");
            } else if (i == 2) {
                sb.append("Carne: " + ingredientes[i] + "\n");
            } else if (i == 3) {
                sb.append("Ripio: " + ingredientes[i]);
            }

        }
            JOptionPane.showMessageDialog(null, sb);
    }

    public void validar_sencilla(int cant){
        int pan = ingredientes[0];
        int queso = ingredientes[1];
        int carne = ingredientes[2];
        int ripio = ingredientes[3];

        if (pan < 1 || queso < 1 || carne < 1 || ripio < 2){
            JOptionPane.showMessageDialog(null, "Ingredientes insuficientes");
        } else {
            ingredientes[0] -=1 * cant;
            ingredientes[1] -=1 * cant;
            ingredientes[2] -=1 * cant;
            ingredientes[3] -=2 * cant;
        }
        mostrar();
    }


    public void validar_doble(int cant){
        int pan = ingredientes[0];
        int queso = ingredientes[1];
        int carne = ingredientes[2];
        int ripio = ingredientes[3];

        if (pan < 2 || queso < 2 || carne < 2 || ripio < 4){
            JOptionPane.showMessageDialog(null, "Ingredientes insuficientes");
        } else {
            ingredientes[0] -=2 * cant;
            ingredientes[1] -=2 * cant;
            ingredientes[2] -=2 * cant;
            ingredientes[3] -=4 * cant;
        }
        mostrar();
    }

    public void llenar(){
        for (int i = 0; i < ingredientes.length; i++) {
            if (i == 0){
                ingredientes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pan: "));
            } else if (i == 1) {
                ingredientes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de queso: "));
            } else if (i == 2) {
                ingredientes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de carne: "));
            } else if (i == 3) {
                ingredientes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ripio: "));
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio_aregglos ejercicioaregglos = new Ejercicio_aregglos();
        boolean estado = true;
        JOptionPane.showMessageDialog(null, "Primero tenemos que surtir la cocina!");
        ejercicioaregglos.llenar();

        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción:\n1.Mostrar." +
                    "\n2.Hamburguesa sencilla.\n3.Hamburguesa doble.\n4.Surtir\n5.Salir."));
            int cant = 0;
            switch (opc){
                case 1:
                    ejercicioaregglos.mostrar();
                    break;
                case 2:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Cuántas hamburguesas va a llevar: "));
                    ejercicioaregglos.validar_sencilla(cant);
                    break;
                case 3:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Cuántas hamburguesas va a llevar: "));
                    ejercicioaregglos.validar_doble(cant);
                    break;
                case 4:
                    ejercicioaregglos.llenar();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Adiós.");
                    estado = false;
                    break;
            }
        }while(estado);
    }
}
