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
	JButton Rejouer;
	JButton vsIA;
	JButton JcJ;
	JLabel AfficheScoreJ1;
	JLabel AfficheScoreJ2;
	int b0;
	int b1;
	int b2;
	int b3;
	int b4;
	int b5;
	int b6;
	int b7;
	int b8;
	int scoreJ1 = 0;
	int scoreJ2 = 0;
	
	
	public InterfaceGraph () {
		setTitle("Morpion");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container boxH = Box.createHorizontalBox();		// Création du menu horizontal
		boxH.add(Box.createHorizontalStrut(0));
		Rejouer = new JButton();						// Création du bouton rejouer
		boxH.add(Rejouer);
		Rejouer.setText("Rejouer");
		Rejouer.addActionListener(this);
		boxH.add(Box.createHorizontalStrut(45));
		AfficheScoreJ2 = new JLabel("Score J2: 0");		// Création du tableau de score
		boxH.add(AfficheScoreJ2);
		boxH.add(Box.createHorizontalStrut(30));
		AfficheScoreJ1 = new JLabel("Score J1: 0");
		boxH.add(AfficheScoreJ1);
		this.add(boxH, BorderLayout.NORTH);
		
		Container boxV = Box.createVerticalBox();		// Création du menu vertical
		boxV.add(Box.createVerticalStrut(100));
		
		vsIA = new JButton();							// Création du bouton versus IA
		boxV.add(vsIA);
		vsIA.setText("vsIA");
		vsIA.addActionListener(this);
		boxV.add(Box.createVerticalStrut(40));
		JcJ = new JButton();							// Création du bouton joueur contre joueur 
		boxV.add(JcJ);
		JcJ.setText("JcJ");
		JcJ.addActionListener(this);
		boxV.add(Box.createVerticalStrut(40));
		this.add(boxV, BorderLayout.WEST);
		
		JPanel panelTouches = new JPanel();				// Création de la grille de bouton 
		panelTouches.setLayout(new GridLayout(3,3));
		
		bouton0 = new JButton();
		panelTouches.add(bouton0);
		bouton0.addActionListener(this);
		bouton0.setFont(bouton0.getFont().deriveFont(24.0f));		// On augmente la taille du X et du O
		bouton1 = new JButton();
		panelTouches.add(bouton1);
		bouton1.addActionListener(this);
		bouton1.setFont(bouton1.getFont().deriveFont(24.0f));
		bouton2 = new JButton();
		panelTouches.add(bouton2);		
		bouton2.addActionListener(this);
		bouton2.setFont(bouton2.getFont().deriveFont(24.0f));
		bouton3 = new JButton();
		panelTouches.add(bouton3);
		bouton3.addActionListener(this);
		bouton3.setFont(bouton3.getFont().deriveFont(24.0f));
		bouton4 = new JButton();
		panelTouches.add(bouton4);
		bouton4.addActionListener(this);
		bouton4.setFont(bouton4.getFont().deriveFont(24.0f));
		bouton5 = new JButton();
		panelTouches.add(bouton5);
		bouton5.addActionListener(this);
		bouton5.setFont(bouton5.getFont().deriveFont(24.0f));
		bouton6 = new JButton();
		panelTouches.add(bouton6);
		bouton6.addActionListener(this);
		bouton6.setFont(bouton6.getFont().deriveFont(24.0f));
		bouton7 = new JButton();
		panelTouches.add(bouton7);
		bouton7.addActionListener(this);
		bouton7.setFont(bouton7.getFont().deriveFont(24.0f));
		bouton8 = new JButton();		
		panelTouches.add(bouton8);
		bouton8.addActionListener(this);
		bouton8.setFont(bouton8.getFont().deriveFont(24.0f));
		this.add(panelTouches, BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bouton0) { 				//getSource() permet d'obtenir le bouton sur lequel le joeur a cliqué
				bouton0.setEnabled(false);				//setEnabled permet de rendre les boutons inactifs afin que l'on ne puisse plus 
				if (tour1 == true) {
					bouton0.setText("X");
					b0 = 1;
					tour1 = !tour1;						//permet d'intervertir entre les joueurs (joueur 1(X) joue puis le joueur 2(O) joue) 
				} else {
					bouton0.setText("O");
					b0 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton1) {
				bouton1.setEnabled(false);
				if (tour1 == true) {
					bouton1.setText("X");
					b1 = 1;
					tour1 = !tour1;
				} else {
					bouton1.setText("O");
					b1 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton2) {
				bouton2.setEnabled(false);
				if (tour1 == true) {
					bouton2.setText("X");
					b2 = 1;
					tour1 = !tour1;
				} else {
					bouton2.setText("O");
					b2 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton3) {
				bouton3.setEnabled(false);
				if (tour1 == true) {
					bouton3.setText("X");
					b3 = 1;
					tour1 = !tour1;
				} else {
					bouton3.setText("O");
					b3 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton4) {
				bouton4.setEnabled(false);
				if (tour1 == true) {
					bouton4.setText("X");
					b4 = 1;
					tour1 = !tour1;
				} else {
					bouton4.setText("O");
					b4 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton5) {
				bouton5.setEnabled(false);
				if (tour1 == true) {
					bouton5.setText("X");
					b5 = 1;
					tour1 = !tour1;
				} else {
					bouton5.setText("O");
					b5 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton6) {
				bouton6.setEnabled(false);
				if (tour1 == true) {
					bouton6.setText("X");
					b6 = 1;
					tour1 = !tour1;
				} else {
					bouton6.setText("O");
					b6 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton7) {
				bouton7.setEnabled(false);
				if (tour1 == true) {
					bouton7.setText("X");
					b7 = 1;
					tour1 = !tour1;
				} else {
					bouton7.setText("O");
					b7 = 0;
					tour1 = !tour1;
				}
		}	else if (e.getSource() == bouton8) {
				bouton8.setEnabled(false);
				if (tour1 == true) {
					bouton8.setText("X");
					b8 = 1;
					tour1 = !tour1;
				} else {
					bouton8.setText("O");
					b8 = 0;
					tour1 = !tour1;
				}
		}
		
		if (e.getSource() == JcJ) {
			AfficheScoreJ2.setText("Score J2: " +  GetScoreJ2());
		} 
		if (e.getSource() == vsIA) {
			AfficheScoreJ2.setText("Score IA: ");
		}
		
		if (e.getSource() == Rejouer) {			//reset de toutes les actions
			
			tour1 = true;
			
			bouton0.setText("");
			bouton1.setText("");
			bouton2.setText("");
			bouton3.setText("");
			bouton4.setText("");
			bouton5.setText("");
			bouton6.setText("");
			bouton7.setText("");
			bouton8.setText("");
			
			bouton0.setEnabled(true);
			bouton1.setEnabled(true);
			bouton2.setEnabled(true);
			bouton3.setEnabled(true);
			bouton4.setEnabled(true);
			bouton5.setEnabled(true);
			bouton6.setEnabled(true);
			bouton7.setEnabled(true);
			bouton8.setEnabled(true);
			
//			if (EstVainqueurJ1 == true) {
//				AfficheScoreJ1.setText("Score J1: " +  GetScoreJ2());
//			} else if (EstVainqueurJ2 == true ) {
//				AfficheScoreJ2.setText("Score J2: " +  GetScoreJ1());
//			}
		}
}	

	public boolean EstVainqueurJ1() {
		if (b0 == 1 && b0 == b1 && b1 == b2 ) {
			return true;
		} 
		else if(b3 == 1 && b3 == b4 && b4 == b5) {
			return true;
		}
		else if(b6 == 1 && b6 == b7 && b7 == b8) {
				return true;
			}
		else if(b0 == 1 && b0 == b4 && b4 == b8) {
				return true;
			}
		else if(b2 == 1 && b2 == b4 && b4 == b6) {
			return true;
		}
		else if(b0 == 1 && b0 == b3 && b3 == b6) {
			return true;
		}
		else if(b1 == 1 && b1 == b4 && b4 == b7) {
			return true;
		}
		else if(b2 == 1 && b2 == b5 && b5 == b8){
			return true;
		}
		else{
			return false;
		}	
	}
	
	public boolean EstVainqueurJ2() {
		if (b0 == 0 && b0 == b1 && b1 == b2 ) {
			return true;
		} 
		else if(b3 == 0 && b3 == b4 && b4 == b5) {
			return true;
		}
		else if(b6 == 0 && b6 == b7 && b7 == b8) {
				return true;
			}
		else if(b0 == 0 && b0 == b4 && b4 == b8) {
				return true;
			}
		else if(b2 == 0 && b2 == b4 && b4 == b6) {
			return true;
		}
		else if(b0 == 0 && b0 == b3 && b3 == b6) {
			return true;
		}
		else if(b1 == 0 && b1 == b4 && b4 == b7) {
			return true;
		}
		else if(b2 == 0 && b2 == b5 && b5 == b8){
			return true;
		}
		else {
			return false;
		}
	}
		
	

		
	public int GetScoreJ1() {
		int score = 0;
		if (EstVainqueurJ1() == true) {
			score ++;
		}
		return score;
	} 
		
	public int GetScoreJ2() {
		int score = 0;
		if (EstVainqueurJ2() == true) {
			score ++;
		}
		return score;
	}
	
public static void main(String[] args) {
	InterfaceGraph f = new InterfaceGraph();
	f.setVisible(true);
	}

}