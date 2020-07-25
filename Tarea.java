import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tarea {

    public static void main(String[] args) {

    	JFrame ventana = new JFrame("Funcionamiento");
        ventana.setSize(500, 350);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        ventana.add(panel);

        Font fuente = new Font("Arial", Font.BOLD, 20);
        JTextField texto1 = new JTextField("Secuencias de ADN");
        texto1.setBounds(0, 0, 500, 50);
        texto1.setEditable(false);
        texto1.setHorizontalAlignment(JTextField.CENTER);
        texto1.setFont(fuente);

        JTextField texto2 = new JTextField("Escribe la primera secuencia: ");
        texto2.setBounds(0, 50, 500, 50);
        texto2.setHorizontalAlignment(JTextField.CENTER);
        texto2.setEditable(false);
        texto2.setFont(fuente);

        JTextField texto3 = new JTextField();
        texto3.setBounds(0, 100, 500, 50);
        texto3.setHorizontalAlignment(JTextField.CENTER);
        texto3.setFont(fuente);

        JTextField texto4 = new JTextField("Escribe la segunda secuencia: ");
        texto4.setBounds(0, 150, 500, 50);
        texto4.setHorizontalAlignment(JTextField.CENTER);
        texto4.setEditable(false);
        texto4.setFont(fuente);

        JTextField texto5 = new JTextField();
        texto5.setBounds(0, 200, 500, 50);
        texto5.setHorizontalAlignment(JTextField.CENTER);
        texto5.setFont(fuente);

        JButton boton = new JButton("Realizar Comparacion");
        boton.setBounds(0, 250, 500, 50);

        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        panel.add(texto4);
        panel.add(texto5);
        panel.add(boton);
        ventana.setVisible(true);
	}
}
