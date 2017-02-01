package morpion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceGraph extends JFrame implements ActionListener {
	
	boolean tour1 = true;
	
	JButton bouton0;
	JButton bouton1;
	JButton bouton2;
	JButton bouton3;
	JButton bouton4;
	JButton bouton5;
	JButton bouton6;
	JButton bouton7;
	JButton bouton8;
	JLabel AfficheScore;
	
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
		boxH.add(AfficheScore);
		this.add(boxH, BorderLayout.NORTH);
		
		Container boxV = Box.createVerticalBox();		// Création du menu vertical
		boxV.add(Box.createVerticalStrut(100));
		boxV.add(new JButton("VS IA"));
		boxV.add(Box.createVerticalStrut(40));
		boxV.add(new JButton("JcJ"));
		this.add(boxV, BorderLayout.WEST);
		
		JPanel panelTouches = new JPanel();				// Création de la grille
		panelTouches.setLayout(new GridLayout(3,3));
		
		bouton0 = new JButton();
		panelTouches.add(bouton0);
		bouton0.addActionListener(this);
		bouton1 = new JButton();
		panelTouches.add(bouton1);
		bouton1.addActionListener(this);
		bouton2 = new JButton();
		panelTouches.add(bouton2);		
		bouton2.addActionListener(this);
		bouton3 = new JButton();
		panelTouches.add(bouton3);
		bouton3.addActionListener(this);
		bouton4 = new JButton();
		panelTouches.add(bouton4);
		bouton4.addActionListener(this);
		bouton5 = new JButton();
		panelTouches.add(bouton5);
		bouton5.addActionListener(this);
		bouton6 = new JButton();
		panelTouches.add(bouton6);
		bouton6.addActionListener(this);
		bouton7 = new JButton();
		panelTouches.add(bouton7);
		bouton7.addActionListener(this);
		bouton8 = new JButton();		
		panelTouches.add(bouton8);
		bouton8.addActionListener(this);
		this.add(panelTouches, BorderLayout.CENTER);
		
		AfficheScore = new JLabel("Score joueur" + GetScore());
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bouton0) {
				if (tour1 == true) {
					bouton0.setText("X");
				} else {
					bouton0.setText("O");
				}
		}	else if (e.getSource() == bouton1) {
				if (tour1 == true) {
					bouton1.setText("X");
				} else {
					bouton1.setText("O");
				}
		}	else if (e.getSource() == bouton2) {
				if (tour1 == true) {
					bouton2.setText("X");
				} else {
					bouton2.setText("O");
				}
		}	else if (e.getSource() == bouton3) {
				if (tour1 == true) {
					bouton3.setText("X");
				} else {
					bouton3.setText("O");
				}
		}	else if (e.getSource() == bouton4) {
				if (tour1 == true) {
					bouton4.setText("X");
				} else {
					bouton4.setText("O");
				}
		}	else if (e.getSource() == bouton5) {
				if (tour1 == true) {
					bouton5.setText("X");
				} else {
					bouton5.setText("O");
				}
		}	else if (e.getSource() == bouton6) {
				if (tour1 == true) {
					bouton6.setText("X");
				} else {
					bouton6.setText("O");
				}
		}	else if (e.getSource() == bouton7) {
				if (tour1 == true) {
					bouton7.setText("X");
				} else {
					bouton7.setText("O");
				}
		}	else if (e.getSource() == bouton8) {
			if (tour1 == true) {
				bouton8.setText("X");
			} else {
				bouton8.setText("O");
			}
		}
		
	}
	
	
//	public double gagnant() {
//		if (bouton0 == bouton1 && bouton1 == bouton2) {
//		}
//	}
	
	
	
	public double GetScore() {
		double score = 0;
		if (EstVainqueur() == true) {
			score ++;
		}
		return score;
	}
	

	public boolean EstVainqueur() {
		return false;
	
	}
	


public static void main(String[] args) {
	InterfaceGraph f = new InterfaceGraph();
	f.setVisible(true);
	}

}