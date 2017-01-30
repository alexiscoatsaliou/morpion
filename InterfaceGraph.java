package morpion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InterfaceGraph extends JFrame{
	
	public InterfaceGraph () {
		setTitle("Morpion");
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container boxH = Box.createHorizontalBox();		// Création du menu horizontal
		boxH.add(Box.createHorizontalStrut(0));
		boxH.add(new JButton("Rejouer"));
		boxH.add(Box.createHorizontalStrut(45));
		boxH.add(new JLabel("Score IA"));
		boxH.add(Box.createHorizontalStrut(30));
		boxH.add(new JLabel("Score Joueur"));
		this.add(boxH, BorderLayout.NORTH);
		
		Container boxV = Box.createVerticalBox();		// Création du menu vertical
		boxV.add(Box.createVerticalStrut(100));
		boxV.add(new JButton("VS IA"));
		boxV.add(Box.createVerticalStrut(40));
		boxV.add(new JButton("JcJ"));
		this.add(boxV, BorderLayout.WEST);
		
		JPanel panelTouches = new JPanel();				// Création de la grille
		panelTouches.setLayout(new GridLayout(3,3));
		
		JPanel panel = new JPanel();
		JButton bouton0 = new JButton("clik");
		panelTouches.add(bouton0);
		
		JButton bouton1 = new JButton("clik");
		panelTouches.add(bouton1);
		
		JButton bouton2 = new JButton("clik");
		panelTouches.add(bouton2);
		
		JButton bouton3 = new JButton("clik");
		panelTouches.add(bouton3);
		
		JButton bouton4 = new JButton("clik");
		panelTouches.add(bouton4);
		
		JButton bouton5 = new JButton("clik");
		panelTouches.add(bouton5);
		
		JButton bouton6 = new JButton("clik");
		panelTouches.add(bouton6);
		
		JButton bouton7 = new JButton("clik");
		panelTouches.add(bouton7);
		
		JButton bouton8 = new JButton("clik");
		panelTouches.add(bouton8);
		
		
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
//		panelTouches.add(new JButton(""));
		this.add(panelTouches, BorderLayout.CENTER);
		
	}
	
	
	
	
	public static void main(String[] args) {
		InterfaceGraph f = new InterfaceGraph();
		f.setVisible(true);
	}
	
}
