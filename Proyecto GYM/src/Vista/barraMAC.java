package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sevente.resources.btnRedondo;

public class barraMAC extends JPanel {

	private JPanel panelSuperior,pDerecho;
	private btnRedondo MAX,MIN,EXIT;
    
    int xMouse, yMouse;
    int pX, pY;
    
    int radioBTN = 100;
    
    public barraMAC() {
        
    	setBorder(new EmptyBorder(1, 1, 1, 1));
        //setBackground(Color.red);
        //panelSuperior.setCursor(new Cursor(MOVE_CURSOR));
        setPreferredSize(new Dimension(0,30));
        setLayout(new BorderLayout());
        
        
            JPanel panelBotones = new JPanel();
            panelBotones.setBackground(Color.white);
            //panelSuperior.setPreferredSize(new Dimension(0,10));
            add(panelBotones,BorderLayout.EAST);
            
            MAX = new btnRedondo("");
            MAX.setPreferredSize(new Dimension(14,14));
            MAX.setBtnInnerRoundRectSize(80);
            MAX.setBtnOuterRoundRectSize(80);
            panelBotones.add(MAX);
            
            JLabel ES = new JLabel();
            panelBotones.add(ES);
            
            MIN = new btnRedondo("");
            MIN.setPreferredSize(new Dimension(14,14));
            MIN.setBtnInnerRoundRectSize(80);
            MIN.setBtnOuterRoundRectSize(80);
            panelBotones.add(MIN);
            
            JLabel ES1 = new JLabel();
            panelBotones.add(ES1);
            
            EXIT = new btnRedondo("");
           
            EXIT.setPreferredSize(new Dimension(12,12));
            EXIT.setBtnInnerRoundRectSize(80);
            EXIT.setBtnOuterRoundRectSize(80);
            panelBotones.add(EXIT);
        
    }
    
    public static void main(String args[]) {
		JFrame frame = new JFrame("Custom Buttons Demo");
		frame.setLayout(new GridLayout());
		barraMAC PA = new barraMAC();
		frame.add(PA);
		frame.setSize(900, 100);
                frame.setLocation(100, 250);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
