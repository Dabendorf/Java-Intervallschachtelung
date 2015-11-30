package intervalschachtelung;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 08.04.2013
  * @author WESSNER
  */

public class Schachtelung extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  //private JNumberField jNumberFielda = new JNumberField();
  private JTextField jNumberFielda = new JTextField();
  private JLabel jLabel3 = new JLabel();
  //private JNumberField jNumberFieldb = new JNumberField();
  private JTextField jNumberFieldb = new JTextField();
  private JLabel jLabel4 = new JLabel();
  //private JNumberField jNumberFieldc = new JNumberField();
  private JTextField jNumberFieldc = new JTextField();
  private JButton jButtonRechnen = new JButton();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JTextArea jTextArea2 = new JTextArea("");
    private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  // Ende Attribute

  public Schachtelung(String title) {
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 455; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten

    jLabel1.setBounds(8, 8, 438, 20);
    jLabel1.setText("Berechnung von Nullstellen mit Intervallschachtelung für Parabeln");
    cp.add(jLabel1);
    jLabel2.setBounds(8, 40, 59, 23);
    jLabel2.setText("y= f(x)=");
    jLabel2.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(jLabel2);
    jNumberFielda.setBounds(72, 40, 43, 20);
    jNumberFielda.setText("2");
    cp.add(jNumberFielda);
    jLabel3.setBounds(120, 40, 35, 20);
    jLabel3.setText("x≤ +");
    cp.add(jLabel3);
    jNumberFieldb.setBounds(160, 40, 43, 20);
    jNumberFieldb.setText("-10");
    cp.add(jNumberFieldb);
    jLabel4.setBounds(216, 40, 22, 20);
    jLabel4.setText("x +");
    cp.add(jLabel4);
    jNumberFieldc.setBounds(248, 40, 43, 20);
    jNumberFieldc.setText("10.5");
    cp.add(jNumberFieldc);
    jButtonRechnen.setBounds(320, 32, 107, 33);
    jButtonRechnen.setText("Rechnen");
    jButtonRechnen.setMargin(new Insets(2, 2, 2, 2));
    jButtonRechnen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButtonRechnen_ActionPerformed(evt);
      }
    });
    cp.add(jButtonRechnen);
    jTextArea1ScrollPane.setBounds(8, 96, 200, 164);
    cp.add(jTextArea1ScrollPane);
    jLabel5.setBounds(8, 72, 110, 20);
    jLabel5.setText("Zwischenwerte:");
    cp.add(jLabel5);
    jLabel6.setBounds(248, 72, 110, 20);
    jLabel6.setText("Nullstellen:");
    cp.add(jLabel6);
    jTextArea2ScrollPane.setBounds(240, 96, 200, 164);
    cp.add(jTextArea2ScrollPane);
    // Ende Komponenten

    setVisible(true);
  }

  // Anfang Methoden
  public void jButtonRechnen_ActionPerformed(ActionEvent evt) {
    // E
    
  }

  // Ende Methoden

  public static void main(String[] args) {
    new Schachtelung("Intervallschachtelung");
  }
}