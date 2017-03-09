/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sevente.resources.ImagePanel;
import com.sevente.resources.btnRedondo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Jeis
 */
public class Inicio extends JFrame{

    private JPanel pDerecho;
    private barraMAC panelSuperior;
    private ImagePanel panelCentral;
    private btnRedondo MAX,MIN,EXIT;
    private ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/com/sevente/resources/img/Inicio.png")).getImage());
    
    int xMouse, yMouse;
    int pX, pY;
    
    barraMAC barraMAC = new barraMAC();
        

    public Inicio() {
        
        JPanel contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout());
	setContentPane(contentPane);

        panelSuperior();
        panelCentral();	
			
	contentPane.add(panelSuperior,BorderLayout.NORTH);
        contentPane.add(panelCentral, BorderLayout.CENTER);
    }
    
    public void panelSuperior(){
    
        panelSuperior = new barraMAC();
        panelSuperior.setBorder(new EmptyBorder(1, 1, 1, 1));
        panelSuperior.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				
                            panelSuperiorBMousePressed(evt);
			}
		});
		panelSuperior.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				
                            panelSuperiorBMouseDragged(evt);
			}
		});
        
        panelSuperior.setBackground(Color.red);
        panelSuperior.setCursor(new Cursor(MOVE_CURSOR));
        panelSuperior.setPreferredSize(new Dimension(0,29));
        panelSuperior.setLayout(new BorderLayout());
        
        
            JPanel panelBotones = new JPanel();
            panelBotones.setBackground(Color.white);
            //panelSuperior.setPreferredSize(new Dimension(0,10));
            panelSuperior.add(panelBotones,BorderLayout.EAST);
            
            MAX = new btnRedondo("");
            MAX.setPreferredSize(new Dimension(16,16));
            MAX.setBtnInnerRoundRectSize(80);
            MAX.setBtnOuterRoundRectSize(80);
            panelBotones.add(MAX);
            
            JLabel ES = new JLabel();
            panelBotones.add(ES);
            
            MIN = new btnRedondo("");
            MIN.setPreferredSize(new Dimension(16,16));
            MIN.setBtnInnerRoundRectSize(80);
            MIN.setBtnOuterRoundRectSize(80);
            panelBotones.add(MIN);
            
            JLabel ES1 = new JLabel();
            panelBotones.add(ES1);
            
            EXIT = new btnRedondo("");
            EXIT.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            		System.exit(0);
            	}
            });
            EXIT.setPreferredSize(new Dimension(16,16));
            EXIT.setBtnInnerRoundRectSize(80);
            EXIT.setBtnOuterRoundRectSize(80);
            panelBotones.add(EXIT);
    }
    
    private void panelSuperiorBMouseDragged(MouseEvent evt) {                                    

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
            
        setLocation(getLocation().x + evt.getX() - pX,
                    getLocation().y + evt.getY() - pY);
    }                                   

    private void panelSuperiorBMousePressed(MouseEvent evt) {                                    

        if (evt.getSource()==panelSuperior) {
            
            pX = evt.getX();
            pY = evt.getY();
        }
    }  
    
    private void btnMAXEvent(){
    
         this.setExtendedState(ICONIFIED);
    }
    
    public void panelCentral(){
    
        panelCentral = new ImagePanel(imagen);
        //panelCentral.setLayout(new GridLayout());
        //panelCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelCentral.setLayout(null);
	panelCentral.setBackground(new Color(18, 150, 244));
        
            JPanel ES = new JPanel();
            ES.setBounds(50, 300, 500, 280);
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
                MAX.setPreferredSize(new Dimension(130,45));
                MAX.setBtnInnerRoundRectSize(2);
                MAX.setBtnOuterRoundRectSize(2);
                ES.add(MAX);
            
            panelCentral.add(ES);
        
            
    }
	
	public static void main(String args[]) {
		Inicio PA = new Inicio();
		PA.setBounds(100, 100, 1156, 706);
                PA.setUndecorated(true);
                PA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PA.setVisible(true);
	}

}
