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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import Animacion.Animacion;

/**
 *
 * @author Jeis
 */
public class Inicio1 extends JFrame{

    private JPanel panelSuperior,pDerecho,panelCentral,pizza;
    //private ImagePanel panelCentral;
    private btnRedondo MAX,MIN,EXIT;
    private ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/com/sevente/resources/img/Inicio.png")).getImage());
    
    int xMouse, yMouse;
    int pX, pY;
        

    public Inicio1() {
    	setUndecorated(true);
        
        JPanel contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout());
	setContentPane(contentPane);

        panelSuperior();
        panelCentral();	
			
	contentPane.add(panelSuperior,BorderLayout.NORTH);
        contentPane.add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(500, 0));
        panelCentral.add(panel, BorderLayout.WEST);
        panel.setLayout(null);
        
        pizza = new JPanel();
        pizza.setBackground(new Color(63, 81, 181));
        pizza.setBounds(-250, 0, 250, 665);
        //pizza.setPreferredSize(new Dimension(250, 0));
        panel.add(pizza);
        
        JButton p1 = new JButton("PIZZA UP");
        p1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//Animacion.subir(0, -551, 1, 1, pizza);
        		Animacion.mover_derecha(-250, 0, 1, 5, pizza);
        	}
        });
        p1.setBounds(346, 220, 110, 48);
        panel.add(p1);
        
        
        JButton p2 = new JButton("PIZZA DO");
        p2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Animacion.bajar(0, 10, 1, 1, pizza);
        		Animacion.mover_izquierda(0, -250, 1, 5, pizza);
        	}
        });
        p2.setBounds(346, 307, 110, 48);
        panel.add(p2);
        
        JPanel panel_1 = new JPanel();
        panelCentral.add(panel_1);
        
        JPanel panel_2 = new JPanel();
        panelCentral.add(panel_2, BorderLayout.NORTH);
    }
    
    public void panelSuperior(){
    
        panelSuperior = new JPanel();
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
    
        panelCentral = new JPanel();
	panelCentral.setBackground(new Color(18, 150, 244));
        
            
    }
	
	public static void main(String args[]) {
		Inicio1 PA = new Inicio1();
		PA.setBounds(100, 100, 1156, 706);
                PA.setUndecorated(true);
                PA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PA.setVisible(true);
	}
}

