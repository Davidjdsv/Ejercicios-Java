import javax.swing.*;
import java.text.DecimalFormat;

public class SolucionesExamen {
    public void estudiante(){
        DecimalFormat df = new DecimalFormat("#.#");
        int total = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        for (int i = 1; i <= 3; i ++){
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + ":"));
            total+=nota;
        }
        double promedio = (double) total / 3;
        String mensaje = (promedio >= 3) ? "Estudiante:  " + nombre + " con edad: " + edad + " Aprobó con: "
                + df.format(promedio) : "Estudiante:  " + nombre + " con edad: " + edad + " Desaprobó con: " + df.format(promedio);
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void empleados(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario: "));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus años de experiencia: "));
        int bono = 200000 * anos;
        int salario_bono = salario + bono;
        int total = 0;
        if (anos > 6){
            total = salario_bono + 600000;
            JOptionPane.showMessageDialog(null, nombre + " se gana en bono de: " + total);
        }
    }

    public void reserva(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre para la reserva: ");
        String fechaReserva = JOptionPane.showInputDialog("Ingrese la fecha: mm/dd/aa: ");
        int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog(""));
    }


    public static void main(String[] args) {
        SolucionesExamen estudiante = new SolucionesExamen();
        estudiante.estudiante();
    }
}