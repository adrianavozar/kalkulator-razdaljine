package kalkulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulatorRazdaljine extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField razdaljina;
    private JTextField razmera;
    private JLabel rezultat;

    public kalkulatorRazdaljine() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        kalkulatorRazdaljine dialog = new kalkulatorRazdaljine();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
