import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui_tutorial {
    private JPanel main;
    private JButton holaMundoButton;
    private JButton sumaButton;

    //Contructor
    public Gui_tutorial(){
        holaMundoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola mundo!");
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumar();
            }
        });
    }

    public void sumar(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese A: "));
        a = a + b;
        JOptionPane.showMessageDialog(null, a);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tutorial");
        frame.setContentPane(new Gui_tutorial().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
