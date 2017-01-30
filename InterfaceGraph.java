package morpion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import composants.FrameComposants;

public class InterfaceGraph extends JFrame {
	
	public InterfaceGraph () {
		setTitle("Morpion");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container boxH = Box.createHorizontalBox();		// Création du menu horizontal
		boxH.add(Box.createHorizontalStrut(150));
		boxH.add(new JButton("Rejouer"));
		boxH.add(Box.createHorizontalStrut(30));
		boxH.add(new JLabel("Score IA"));
		boxH.add(Box.createHorizontalStrut(30));
		boxH.add(new JLabel("Score Joueur"));
		this.add(boxH, BorderLayout.NORTH);
		
		Container boxV = Box.createVerticalBox();		// Création du menu vertical
		boxV.add(Box.createVerticalStrut(150));
		boxV.add(new JButton("VS IA"));
		boxV.add(Box.createVerticalStrut(40));
		boxV.add(new JButton("JcJ"));
		this.add(boxV, BorderLayout.WEST);
		
		JPanel panelTouches = new JPanel();				// Création de la grille
		panelTouches.setLayout(new GridLayout(3,3));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		panelTouches.add(new JButton(""));
		this.add(panelTouches, BorderLayout.CENTER);
		
	}
	
	
	
	
	public static void main(String[] args) {
		InterfaceGraph f = new InterfaceGraph();
		f.setVisible(true);
	}
	
}
