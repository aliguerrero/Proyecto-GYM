/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sevente.resources.ImagePanel;
import com.sevente.resources.btnRedondo;
import com.sun.awt.AWTUtilities;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import javax.swing.border.LineBorder;

/**
 *
 * @author Jeis
 */
public class VistaPrincipal extends JFrame{

    private JPanel pDerecho,panelCentral,PC;
    private barraMAC panelSuperior;
    JLabel ES1;
    BarraMenu barraMenu,PS2;
    //private panelInicio panelCentral;
    private btnRedondo MAX,MIN,EXIT;
    private ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/com/sevente/resources/img/Inicio.png")).getImage());
    
    int xMouse, yMouse;
    int pX, pY;
    
    barraMAC barraMAC = new barraMAC();
    
  //IDENTIFICADORES PARA EL CARDLAYOUT
    final public String VENTANA0 = "Ventana 0";
    
  //INSTANCIANDO LOS DIFERENTES PANELES A MOSTRAR
    private panelInicio v0 = new panelInicio();
        

    public VistaPrincipal() {
        
        JPanel contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout());
	setContentPane(contentPane);

        panelSuperior();
        panelCentral();	
			
	contentPane.add(panelSuperior,BorderLayout.NORTH);
        contentPane.add(PC, BorderLayout.CENTER);
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
        
        panelSuperior.setBackground(Color.white);
        //panelSuperior.setCursor(new Cursor(MOVE_CURSOR));
        panelSuperior.setPreferredSize(new Dimension(0,25));
        panelSuperior.setLayout(new BorderLayout());
        
        
            JPanel panelBotones = new JPanel();
            panelBotones.setBackground(Color.white);
            //panelSuperior.setPreferredSize(new Dimension(0,10));
            panelSuperior.add(panelBotones,BorderLayout.EAST);
            
            MAX = new btnRedondo("");
            MAX.setBtnNormalColor(new Color(38, 205, 73));
            MAX.setBtnRollOverColor(new Color(38, 205, 73));
            MAX.setPreferredSize(new Dimension(14,14));
            MAX.setBtnInnerRoundRectSize(80);
            MAX.setBtnOuterRoundRectSize(80);
            panelBotones.add(MAX);
            
            JLabel ES = new JLabel();
            panelBotones.add(ES);
            
            MIN = new btnRedondo("");
            MIN.setBtnNormalColor(new Color(250, 192, 66));
            MIN.setBtnRollOverColor(new Color(250, 192, 66));
            MIN.setPreferredSize(new Dimension(14,14));
            MIN.setBtnInnerRoundRectSize(80);
            MIN.setBtnOuterRoundRectSize(80);
            panelBotones.add(MIN);
            
            JLabel ES1 = new JLabel();
            panelBotones.add(ES1);
            
            EXIT = new btnRedondo("");
            EXIT.setBtnNormalColor(new Color(246, 98, 98));
            EXIT.setBtnRollOverColor(new Color(246, 98, 98));
            EXIT.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            		System.exit(0);
            	}
            });
            EXIT.setPreferredSize(new Dimension(14,14));
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
    
    	PC = new JPanel();
        PC.setBackground(Color.white);
        PC.setLayout(new BorderLayout());
        
        
        JPanel PS = new JPanel();
        PS.setBackground(Color.GREEN);
        PS.setLayout(new BorderLayout());
        //PS.setPreferredSize(new Dimension(0,100));
        PC.add(PS,BorderLayout.NORTH);
        
	        JPanel PS1 = new JPanel();
	        PS1.setBackground(new Color(75, 64, 148));
	        PS1.setLayout(new FlowLayout());
	        PS1.setPreferredSize(new Dimension(0,50));
	        PS.add(PS1,BorderLayout.NORTH);
	        
		        JLabel ES = new JLabel("CLUB FITNESS SPA C.A");
		        ES.setForeground(Color.WHITE);
		        ES.setFont(new Font("Segoe UI", Font.BOLD, 25));
		        //ES.setBorder(new LineBorder(new Color(37, 55, 68), 2));
		        PS1.add(ES);
	        
		    PS2 = new BarraMenu();
		    PS2.setBackground(new Color(37, 55, 68));
	        //barraMenu.setLayout(new BorderLayout());
		    PS2.setPreferredSize(new Dimension(0,27));
	        PS.add(PS2,BorderLayout.SOUTH);
	        	
		        /*ES1 = new JLabel("Hola");
		        ES1.setForeground(Color.WHITE);
		        //ES1.setBorder(new LineBorder(new Color(255, 55, 68), 2));
		        PS2.add(ES1);PS2.add(ES1);
		        ES1 = new JLabel("Hola");
		        ES1.setForeground(Color.WHITE);
		        //ES1.setBorder(new LineBorder(new Color(255, 55, 68), 2));
		        PS2.add(ES1);PS2.add(ES1);
		        ES1 = new JLabel("Hola");
		        ES1.setForeground(Color.WHITE);
		        //ES1.setBorder(new LineBorder(new Color(255, 55, 68), 2));
		        PS2.add(ES1);PS2.add(ES1);
		        ES1 = new JLabel("Hola");
		        ES1.setForeground(Color.WHITE);
		        //ES1.setBorder(new LineBorder(new Color(255, 55, 68), 2));
		        PS2.add(ES1);PS2.add(ES1);*/
        
    	
        panelCentral = new JPanel();
        panelCentral.setBackground(Color.BLUE);
        panelCentral.setLayout(new CardLayout());
        //panelCentral.setLayout(new GridLayout());
        //panelCentral.setBorder(new EmptyBorder(2, 2, 2, 2));
        
	        /* Contenedor Principal 
	        JPanel panelCentral1 = new JPanel();
	        panelCentral1.setBorder(new EmptyBorder(15, 15, 15, 15));
			panelCentral1.setLayout(new CardLayout(0, 0));
			panelCentral1.setBackground(Color.GRAY);*/
			
			//ANADIR LOS PANELES AL CONTENEDOR PRINCIPAL
			panelCentral.add(v0,VENTANA0);
			/*panelCentral.add(panelCentral1);*/
        PC.add(panelCentral,BorderLayout.CENTER);

    }
	
	public static void main(String args[]) {
		VistaPrincipal PA = new VistaPrincipal();
		PA.setBounds(100, 100, 1156, 706);
                PA.setUndecorated(true);
                PA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Shape forma = new RoundRectangle2D.Double(0,0,PA.getBounds().width,PA.getBounds().height,5,5);
                AWTUtilities.setWindowShape(PA, forma);
		PA.setVisible(true);
	}

}
