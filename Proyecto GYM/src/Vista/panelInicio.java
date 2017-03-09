package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sevente.resources.ImagePanel;
import com.sevente.resources.btnRedondo;

public class panelInicio extends JPanel{
	
	private ImagePanel panelCentral;
	private ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/com/sevente/resources/img/Inicio.png")).getImage());
	private btnRedondo MAX,MIN,EXIT;
	
	public panelInicio(){
		
		setLayout(new BorderLayout());
		
		panelCentral = new ImagePanel(imagen);
        //panelCentral.setLayout(new GridLayout());
        //panelCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelCentral.setLayout(null);
        panelCentral.setBackground(new Color(18, 150, 244));
        
            JPanel ES = new JPanel();
            ES.setOpaque(false);
            ES.setBounds(50, 250, 500, 230);
            ES.setBackground(new Color(18, 150, 244));
            ES.setLayout(new FlowLayout(FlowLayout.LEFT));
            
                JLabel ES1 = new JLabel();
                ES1.setFont(new Font("Consolas",0,40));
                ES1.setText("CERO DISTRACCIONES,");
                ES.add(ES1);

                JLabel ES2 = new JLabel();
                ES2.setFont(new Font("Consolas",0,40));
                ES2.setText("MAS RESULTADOS.");
                ES.add(ES2);
                
                JLabel ES3 = new JLabel();
                ES3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
                ES.add(ES3);
                
                JLabel ES4 = new JLabel();
                ES4.setText("Ut enim ad minim veniam, quis nostrud exercitation.");
                ES.add(ES4);
                
                JLabel ES5 = new JLabel("                                                                                       "
                        + "                                           ");
                ES.add(ES5);
                
                MAX = new btnRedondo("HELLO");
                MAX.setForeground(Color.WHITE);
                MAX.setBtnNormalColor(new Color(75, 64, 148));
                MAX.setBtnRollOverColor(new Color(75, 64, 148));
                MAX.setPreferredSize(new Dimension(130,45));
                MAX.setBtnInnerRoundRectSize(12);
                MAX.setBtnOuterRoundRectSize(12);
                ES.add(MAX);
            
            panelCentral.add(ES);
            add(panelCentral);
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("Custom Buttons Demo");
		frame.setLayout(new GridLayout());
		panelInicio PA = new panelInicio();
		frame.add(PA);
		frame.setSize(900, 500);
                frame.setLocation(100, 250);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
