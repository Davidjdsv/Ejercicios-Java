import javax.swing.*;

public class PruebaConocimientos {

    public void enunciado1(){
        int LAPIZ = 1200, BORRADOR = 500, CUADERNO = 4500, LAPICERO = 2500, CORRECTOR = 5000;
        StringBuffer sb = new StringBuffer();
        boolean estado = true;
        double acum_lapices = 0, acum_borradores = 0, acum_cuade = 0, acum_lapicero = 0, acum_correc = 0, total_compra = 0;
        int total_lapices = 0, total_borradores = 0, total_cuadernos = 0, total_lapiceros = 0, total_correctores = 0;
        do {
            try {
                int op = Integer.parseInt(JOptionPane.showInputDialog("Tienda surtibueno. Seleccione una opción: \n1.Lápices(und: 1200).\n" +
                        "2.Borradores(und: 500).\n3.Cuadernos(4500).\n4.Lapiceros(2500).\n5.Corrector(5000).\n6.Salir y cancelar la compra."));
                switch (op){
                    case 1:
                        int lapices = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos lápices desea adquirir? "));
                        total_lapices = lapices * LAPIZ;
                        acum_lapices += lapices;
                        if (acum_lapices > 3){
                            double desc_lapices = total_lapices - (total_lapices * 0.33);
                            sb.append("LÁPICES:\nDescuento en lápices del 33%: " + desc_lapices + "\nCant.lápices: " + acum_lapices + "\n");
                        } else {
                            sb.append("LÁPICES:\nValor compra lápices: " + total_lapices + "\n" + "\nCant.lápices: " + acum_lapices + "\n");
                        }
                        break;
                    case 2:
                        int borradores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos borradores desea adquirir? "));
                        total_borradores = borradores * BORRADOR;
                        double desc_borradores = total_borradores - (total_borradores * 0.1);
                        acum_borradores += borradores;
                        if (acum_borradores >= 2){
                            sb.append("BORRADORES: \nDescuento en borradores del 10%: " + desc_borradores + "\nCant.borradores: " + acum_borradores + "\n");
                        } else {
                            sb.append("BORRADORES: \nValor compra borradores: " + total_borradores + "\nCant.borradores: " + acum_borradores + "\n");
                        }
                        break;
                    case 3:
                        int cuadernos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos cuadernos desea adquirir? "));
                        total_cuadernos = cuadernos * CUADERNO;
                        double desc_cuadernos = total_cuadernos - (total_cuadernos * 0.45);
                        acum_cuade += cuadernos;
                        if (acum_cuade > 6){
                            sb.append("CUADERNOS: \nDescuento en compra del 45%:" + desc_cuadernos + "\nCant.cuadernos: " + acum_cuade + "\n");
                        } else {
                            sb.append("CUADERNOS: \nValor compra cuadernos: " + total_cuadernos + "\nCant.cuadernos: " + acum_cuade + "\n");
                        }
                        break;
                    case 4:
                        int lapiceros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos lapiceros desea adquirir? "));
                        total_lapiceros = lapiceros * LAPICERO;
                        double desc_lapiceros = total_lapiceros - (total_lapiceros * 0.145);
                        acum_lapicero += lapiceros;
                        if (acum_lapicero > 2 && acum_lapicero < 6) {
                            sb.append("LÁPICEROS: \nDescuento en lápiceros del 14.5%: " + desc_lapiceros + "\nCant.lápiceros: " + acum_lapicero + "\n");
                        } else {
                            sb.append("LÁPICEROS: \nValor compra lápiceros: " + total_lapiceros + "\nCant.lápiceros: " + acum_lapicero + "\n");
                        }
                            break;
                    case 5:
                        int correctores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos correctores desea adquirir? "));
                        total_correctores = correctores * CORRECTOR;
                        double desc_correctores = total_correctores - (total_correctores * 0.76);
                        acum_correc += correctores;
                        if (acum_correc >= 5 && acum_correc <= 7){
                            sb.append("CORRECTORES: \nDescuento en correctores del 76%: " + desc_correctores + "\nCant.correctores: " + acum_correc + "\n");
                        } else {
                            sb.append("CORRECTORES: \nValor compra correctores: " + total_correctores + "\nCant.correctores: " + acum_correc + "\n");
                        }
                        break;
                    case 6:
                        total_compra = total_lapices + total_borradores + total_cuadernos + total_lapiceros + total_correctores;
                        sb.append("Total compra: $" + total_compra);
                        estado = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción ingresada no valida...");
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error: Ingresa un valor número...");
            }
        } while (estado);
        JOptionPane.showMessageDialog(null, sb);
    }

    public static void main(String[] args) {
        PruebaConocimientos pruebaConocimientos = new PruebaConocimientos();
        pruebaConocimientos.enunciado1();

    }
}
