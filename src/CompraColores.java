import javax.swing.*;

public class CompraColores {
    int precio;

    public CompraColores() {
        this.precio = 0;
    }

    public void rojoDescuento() {
        String color = "Rojo!";
        double desc = precio * 0.10;
        double total = precio - desc;
        JOptionPane.showMessageDialog(null, color + "\nValor compra: " + precio + "\nDescuento 10%: " + desc +
                "\nTotal compra: " + total);
    }

    public void azulDescuento() {
        String color = "Azul!";
        double desc = precio * 0.20;
        double total = precio - desc;
        JOptionPane.showMessageDialog(null, color + "\nValor compra: " + precio + "\nDescuento 20%: " + desc +
                "\nTotal compra: " + total);
    }

    public void verdeDescuento() {
        String color = "Verde!";
        double desc = precio * 0.30;
        double total = precio - desc;

        JOptionPane.showMessageDialog(null, color + "\nValor compra: " + precio + "\nDescuento 30%: " + desc +
                "\nTotal compra: " + total);

        if (precio > 300000){
            desc = precio * 0.525;
            JOptionPane.showMessageDialog(null, color + "\nValor compra: " + precio + "\nDescuento 30%: " + desc +
                    "\nTotal compra: " + total);
        } else {
            desc = precio * 0.0285;
            JOptionPane.showMessageDialog(null, color + "\nValor compra: " + precio + "\nDescuento 30%: " + desc +
                    "\nTotal compra: " + total);
        }
    }

    public void negroDescuento() {
        String color = "Negro!";
        double desc = precio * 1.00; // 100% descuento
        double total = precio - desc;
        JOptionPane.showMessageDialog(null, color + "\nValor compra: " + precio + "\nDescuento 100%: " + desc +
                "\nTotal compra: " + total);
    }

    public void compraDescuento() {
        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio: "));
        boolean estado = true;

        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Elige un color: \n1. Rojo \n2. Azul \n3. Verde " +
                    "\n4. Negro \n5. Salir"));


            switch (opc) {
                case 1:
                    rojoDescuento();
                    break;
                case 2:
                    azulDescuento();
                    break;
                case 3:
                    verdeDescuento();
                    break;
                case 4:
                    negroDescuento();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Adios.");
                    estado = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (estado);
    }

    public static void main(String[] args) {
        CompraColores compraColores = new CompraColores();
        compraColores.compraDescuento();
    }
}
