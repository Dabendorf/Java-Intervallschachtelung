package intervalschachtelung;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.text.NumberFormatter;

public class Schachtelung {
	
	private JFrame frame1 = new JFrame("Intervallschachtelung");
	
	public Schachtelung() {
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setPreferredSize(new Dimension(455,300)); //ANPASSEN
		//frame1.setMinimumSize(new Dimension(300,200));
		//frame1.setMaximumSize(new Dimension(450,300));
		frame1.setResizable(true);
		Container cp = frame1.getContentPane();
		cp.setLayout(new GridBagLayout());
		
		JPanel panelOben = new JPanel();
		panelOben.add(new JLabel("Berechnung von Nullstellen mit Intervallschachtelung für Parabeln"));
		
		JPanel panelMitte = new JPanel();
		JLabel yfx = new JLabel("y = f(x) =");
		yfx.setFont(new Font("Dialog", Font.BOLD, 12));
		NumberFormat format1 = NumberFormat.getInstance();
		NumberFormatter formatter1 = new NumberFormatter(format1);
		format1.setGroupingUsed(false);
	    formatter1.setAllowsInvalid(false);
		JFormattedTextField textFeldA = new JFormattedTextField(formatter1);
		textFeldA.setText("2");
		textFeldA.setColumns(4);
		textFeldA.setHorizontalAlignment(SwingConstants.RIGHT);
		JLabel x2Wert = new JLabel("x² +");
		NumberFormat format2 = NumberFormat.getInstance();
		NumberFormatter formatter2 = new NumberFormatter(format1);
		format2.setGroupingUsed(false);
	    formatter2.setAllowsInvalid(false);
		JFormattedTextField textFeldB = new JFormattedTextField(formatter2);
		textFeldB.setText("-10");
		textFeldB.setColumns(4);
		textFeldB.setHorizontalAlignment(SwingConstants.RIGHT);
		JLabel xWert = new JLabel("x +");
		NumberFormat format3 = NumberFormat.getInstance();
		NumberFormatter formatter3 = new NumberFormatter(format1);
		format3.setGroupingUsed(false);
	    formatter3.setAllowsInvalid(false);
		JFormattedTextField textFeldC = new JFormattedTextField(formatter3);
		textFeldC.setText("10.5");
		textFeldC.setColumns(4);
		textFeldC.setHorizontalAlignment(SwingConstants.RIGHT);
		JButton rechnen = new JButton("Rechnen");
		rechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				berechnen();
			}
		});
		panelMitte.add(yfx);
		panelMitte.add(textFeldA);
		panelMitte.add(x2Wert);
		panelMitte.add(textFeldB);
		panelMitte.add(xWert);
		panelMitte.add(textFeldC);
		panelMitte.add(rechnen);
		
		JPanel panelUntenLinks = new JPanel();
		panelUntenLinks.setLayout(new BorderLayout());
		JList<String> zwischenwerteListe = new JList<String>();
		DefaultListModel<String> zwischenwerteListeModel = new DefaultListModel<String>();
		JScrollPane zwischenwerteListeScrollPane = new JScrollPane(zwischenwerteListe);
		zwischenwerteListe.setModel(zwischenwerteListeModel);
	    panelUntenLinks.add(new JLabel("Zwischenwerte:"), BorderLayout.NORTH);
	    panelUntenLinks.add(zwischenwerteListeScrollPane, BorderLayout.CENTER);
		
		JPanel panelUntenRechts = new JPanel();
		panelUntenRechts.setLayout(new BorderLayout());
		JList<String> nullstellenListe = new JList<String>();
		DefaultListModel<String> nullstellenListeModel = new DefaultListModel<String>();
		JScrollPane nullstellenListeScrollPane = new JScrollPane(nullstellenListe);
		nullstellenListe.setModel(nullstellenListeModel);
	    panelUntenRechts.add(new JLabel("Nullstellen:"), BorderLayout.NORTH);
	    panelUntenRechts.add(nullstellenListeScrollPane, BorderLayout.CENTER);
	    
	    panelOben.setPreferredSize(new Dimension(0,0));
	    panelMitte.setPreferredSize(new Dimension(0,0));
	    panelUntenLinks.setPreferredSize(new Dimension(0,0));
	    panelUntenRechts.setPreferredSize(new Dimension(0,0));
		
		cp.add(panelOben, new GridBagFelder(0,0,2,1,1,0.1));
		cp.add(panelMitte, new GridBagFelder(0,1,2,1,1,0.1));
		cp.add(panelUntenLinks, new GridBagFelder(0,2,1,1,0.5,0.6));
		cp.add(panelUntenRechts, new GridBagFelder(1,2,1,1,0.5,0.6));
		
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
	}
	
	private void berechnen() {
		System.out.println("Dings");
	}
	
	public static void main(String[] args) {
		new Schachtelung();
	}
}