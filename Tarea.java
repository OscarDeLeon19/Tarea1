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

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Codigo1 = texto3.getText();
                String Codigo2 = texto5.getText();

                char[] C1 = Codigo1.toCharArray();
                char[] C2 = Codigo2.toCharArray();
                char igual[] = new char[50];
                char resultado[] = new char[50];

                int CadenaMenor = C1.length;
                if (C2.length < CadenaMenor) {
                    CadenaMenor = C2.length;
                }
                int Comparacion = 0;
                int CantidadDeCaracteres = 0;
                for (int i = 0; i < C1.length; i++) {
                    CantidadDeCaracteres = 0;
                    for (int j = 0; j < C2.length; j++) {
                        if (C1[i] == C2[j]) {
                            CantidadDeCaracteres = 0;
                            int CaracterC1 = i;
                            int CaracterC2 = j;
                            igual[CantidadDeCaracteres] = C1[i];
                            CantidadDeCaracteres++;
                            int m1 = CadenaMenor - i;
                            int m2 = CadenaMenor - j;
                            int inicio;
                            if (m1 >= m2) {
                                inicio = j;
                            } else {
                                inicio = i;
                            }
                            for (int k = inicio; k < (CadenaMenor - 1); k++) {
                                if (C1[CaracterC1 + 1] == C2[CaracterC2 + 1]) {
                                    igual[CantidadDeCaracteres] = C1[CaracterC1 + 1];
                                    CantidadDeCaracteres++;
                                } else {
                                    if (CantidadDeCaracteres > Comparacion) {
                                        Comparacion = CantidadDeCaracteres;
                                        for (int z = 0; z < 10; z++) {
                                            resultado[z] = igual[z];
                                        }
                                    }
                                    CantidadDeCaracteres = 0;
                                }
                                CaracterC1++;
                                CaracterC2++;
                            }
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, String.valueOf(resultado));
                System.out.println("");
            }
        });
	}
}
