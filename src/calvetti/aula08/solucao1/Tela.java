import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame implements ActionListener {

    private JTextField textField;
    private JLabel texto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public Tela() {
        super("Tela");

        textField = new JTextField(10);
        texto = new JLabel("Texto");
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(textField);
        container.add(texto);
        container.add(btnMostrar);
        container.add(btnLimpar);
        container.add(btnSair);

        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnMostrar) {

        } else if (e.getSource() == btnLimpar) {
            textField.setText("");
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }
}

